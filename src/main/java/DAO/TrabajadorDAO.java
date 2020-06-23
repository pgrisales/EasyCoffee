package DAO;

import com.easycoffee.Trabajador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class TrabajadorDAO implements DAO<Trabajador, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.TRABAJADOR VALUES (?, ?)"; //(PER_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO, USU_RESPUESTAPREGUNTA)
    final String UPDATE = "UPDATE EASYCOFFEBD.TRABAJADOR SET TRA_SALARIO = ? WHERE PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.TRABAJADOR WHERE PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.TRABAJADOR";

    private Connection conn;

    public TrabajadorDAO(Connection conn) {
        this.conn = conn;
    }

    private Trabajador convertir(ResultSet rs) throws SQLException {

        String nombrePersona = rs.getString("PER_NOMBRE");
        String apellidoPersona = rs.getString("PER_APELLIDO");
        boolean estadoPersona = rs.getBoolean("PER_ESTADOPERSONA");
        Long cedulaCiudadania = rs.getLong("PER_CEDULACIUDADANIA");
        double salario = rs.getDouble("TRA_SALARIO");

        Trabajador newTrabajador = new Trabajador(salario, cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona);
        return newTrabajador;
    }

    @Override
    public void insertar(Trabajador a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1, a.getCedula());
            stat.setDouble(2, a.getSalario());
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
    public void modificar(Trabajador a) {
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
    }

    @Override
    public void eliminar(Trabajador a) {
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
    public List<Trabajador> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Trabajador> t = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                t.add(convertir(rs));
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
        return t;
    }

    @Override
    public Trabajador obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Trabajador t = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.PERSONA NATURAL JOIN EASYCOFFEBD.TRABAJADOR WHERE PER_CEDULACIUDADANIA = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                t = convertir(rs);
            } else {
                System.out.println("Registro Trabajador no encontrado");
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
        return t;
    }

}
