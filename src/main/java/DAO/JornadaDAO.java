package DAO;

import com.easycoffee.Jornada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class JornadaDAO implements DAO<Jornada, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.JORNADA VALUES (default, ?, ?, ?, ?, ?)";
    final String DELETE = "DELETE FROM EASYCOFFEBD.JORNADA WHERE ID = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.JORNADA";
    private Connection conn;

    public JornadaDAO(Connection conn) {
        this.conn = conn;
    }

    private Jornada convertir(ResultSet rs) throws SQLException {

        int ID = rs.getInt("JOR_ID");
        int idLote = rs.getInt(DELETE);
        float arrobas = rs.getFloat("JOR_ARROBASRECOGIDAS");
        String fecha = String.valueOf(rs.getDate("JOR_FECHA"));
        String horaregistro = rs.getString("JOR_HORAREGISTRO");
        Jornada newJornada = new Jornada(arrobas, horaregistro, fecha, new Long(idLote), ID);
        return newJornada;
    }

    @Override
    public void insertar(Jornada a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setFloat(1, a.getArrobasRecogidas());
            stat.setString(2, a.getFechaJornada());
            stat.setString(3, a.getHoraDeRegistro());
            stat.setLong(4, a.getLoteTrabajado());
            stat.setLong(5, a.getIdTrabajador());
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
    public void modificar(Jornada a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Jornada a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getIdJornada());
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
    public List<Jornada> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Jornada> j = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                j.add(convertir(rs));
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
        return j;
    }

    @Override
    public Jornada obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Jornada p = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.JORNADA WHERE ID = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                p = convertir(rs);
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
        return p;
    }

}
