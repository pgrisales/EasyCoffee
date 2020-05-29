package DAO;

import com.easycoffee.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Camilo Vargas
 */
public class UsuarioDAO implements DAO<Usuario, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.USUARIO VALUES (?, ?)"; //(PER_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO, USU_RESPUESTAPREGUNTA)
    final String UPDATE = "UPDATE EASYCOFFEBD.USUARIO SET USU_PASSWORD = ?, WHERE PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.USUARIO WHERE PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.USUARIO";

    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    private Usuario convertir(ResultSet rs) throws SQLException {

        String password = rs.getString("USU_PASSWORD");
        String nombrePersona = rs.getString("PER_NOMBRE");
        String apellidoPersona = rs.getString("PER_APELLIDO");
        boolean estadoPersona = rs.getBoolean("PER_ESTADOPERSONA");
        Long cedulaCiudadania = rs.getLong("PER_CEDULACIUDADANIA");

        Usuario newUsuario = new Usuario(password, cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona);

        return newUsuario;
    }

    @Override
    public void insertar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, u.getPassword());
            stat.setInt(2, u.getCedula().intValue());
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
            stat.setLong(2, u.getCedula());
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
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.USUARIO WHERE PER_CEDULACIUDADANIA = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                u = convertir(rs);
            } else {
                System.out.println("Registro no encontrado");
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

}
