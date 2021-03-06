package DAO;

import com.easycoffee.Persona;
import com.easycoffee.Usuario;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Vargas
 */
public class UsuarioDAO implements DAO<Usuario, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.USUARIO VALUES (?, ?, ?, ?)"; //(PER_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO, USU_RESPUESTAPREGUNTA)
    final String UPDATE = "UPDATE EASYCOFFEBD.USUARIO SET USU_PASSWORD = ? WHERE USUARIO.PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.USUARIO WHERE USUARIO.PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.USUARIO";
    final String UPDATEIMG = "UPDATE EASYCOFFEBD.USUARIO SET USU_IMG = ? WHERE USUARIO.PER_CEDULACIUDADANIA = ?";

    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    private Usuario convertir(ResultSet rs) throws SQLException {
        Usuario newUsuario;
        String password = rs.getString("USU_PASSWORD");
        String nombrePersona = rs.getString("PER_NOMBRE");
        String apellidoPersona = rs.getString("PER_APELLIDO");
        boolean estadoPersona = rs.getBoolean("PER_ESTADOPERSONA");
        Long cedulaCiudadania = rs.getLong("PER_CEDULACIUDADANIA");
        boolean rol = rs.getBoolean("USU_ROL");
        Blob blob = rs.getBlob("USU_IMG");
        
        if(blob == null){
            newUsuario = new Usuario(password, cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona, rol);
        }else{
            byte[] img = blob.getBytes(1, (int)blob.length());
            BufferedImage icon = null;
            try {
                icon = ImageIO.read(new ByteArrayInputStream(img));
            } catch (Exception e) {
            }
            ImageIcon icono = new ImageIcon(icon);
            newUsuario = new Usuario(password, icono, cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona, rol);
        }
               
        return newUsuario;
    }

    @Override
    public void insertar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, u.getPassword());
            stat.setInt(2, u.getCedula().intValue());
            stat.setBytes(3, null);
            stat.setBoolean(4, u.isRol());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }
    public void insertarFoto(Long id, String ruta) throws FileNotFoundException {
        PreparedStatement stat = null;
        FileInputStream fi = null;
        
        try {
            stat = conn.prepareStatement(UPDATEIMG);
            
            File file = new File(ruta);
            fi = new FileInputStream(file);
            stat.setBinaryStream(1, fi);
            
            stat.setInt(2, id.intValue());
            
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public void modificar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, u.getPassword());
            System.out.println("CONTRA: " + u.getPassword());
            stat.setLong(2, u.getCedula());
            System.out.println("user: " + u.getCedula());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya modificado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public void eliminar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, u.getCedula());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya eliminado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }

    public void eliminar(Long u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, u.intValue());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya eliminado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Usuario> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Usuario> u = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                u.add(convertir(rs));
                r = rs.next();
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL");
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con Derby");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con Derby");
                }
            }
        }
        return u;
    }

    @Override
    public Usuario obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Usuario u = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.USUARIO WHERE USUARIO.PER_CEDULACIUDADANIA = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                u = convertir(rs);
            } else {
                System.out.println("Registro Usuario Obtener no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL2");
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con Derby");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con Derby");
                }
            }
        }
        return u;
    }
    
    public void updateEstado(Persona a, boolean est) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement("UPDATE EASYCOFFEBD.PERSONA SET PER_ESTADOPERSONA = ? WHERE PER_CEDULACIUDADANIA = ?");
            stat.setBoolean(1, est);
            stat.setLong(2, a.getCedula());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya modificado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ef) {
                    ef.printStackTrace();
                }
            }
        }
    }
        
}