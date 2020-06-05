package DAO;

import com.easycoffee.Persona;
import com.easycoffee.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Lopez
 */
public class PersonaDAO implements DAO<Persona, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.PERSONA VALUES (?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEBD.PERSONA SET PER_ESTADOPERSONA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.PERSONA WHERE PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.PERSONA";
    
    private int c = 1;
    
    private Connection conn;

    public PersonaDAO(Connection conn) {
        this.conn = conn;
    }

    private Persona convertir(ResultSet rs) throws SQLException {

        String nombrePersona = rs.getString("PER_NOMBRE");
        String apellidoPersona = rs.getString("PER_APELLIDO");
        boolean estadoPersona = rs.getBoolean("PER_ESTADOPERSONA");
        Long cedulaCiudadania = rs.getLong("PER_CEDULACIUDADANIA");
        Persona newPersona = new Persona(cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona);
        return newPersona;
    }
    

    @Override
    public void insertar(Persona a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1, a.getCedula());
            stat.setBoolean(2, a.isEstado());
            stat.setString(3, a.getNombre());
            stat.setString(4, a.getApellido());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (Exception e) {
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
    public void modificar(Persona a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setBoolean(1, a.isEstado());
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
        
        System.out.println("VEZ # "+c + " MODIFICAR SQL...");
        c++;
        Persona p = obtener(a.getCedula());
        System.out.println("EN SQL SHIT "+p.isEstado());
    }

    @Override
    public void eliminar(Persona a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getCedula());
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

    public void eliminar(Long a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.intValue());
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
    public Persona obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Persona p = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.PERSONA WHERE PER_CEDULACIUDADANIA = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                p = convertir(rs);
            } else {
                System.out.println("Registro Persona no encontrado");
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
        return p;
    }

    @Override
    public List<Persona> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Persona> p = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                p.add(convertir(rs));
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
        return p;
    }
}
