package DAO;

import com.easycoffee.Lote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Lopez
 */
public class LoteDAO implements DAO<Lote, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.LOTE VALUES (default, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEBD.LOTE SET LOTE_FECHADESYERBADO = ?, LOTE_FECHAABONADO = ?, LOTE_CARGA = ? WHERE LOTE_IDLOTE = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.LOTE WHERE LOTE_IDLOTE = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.LOTE";
    private Connection conn;

    public LoteDAO(Connection conn) {
        this.conn = conn;
    }

    private Lote convertir(ResultSet rs) throws SQLException {
        String aux[] = new String[3];
        String fDesyerbado = String.valueOf(rs.getDate("LOTE_FECHADESYERBADO"));
        aux = fDesyerbado.split("-");
        fDesyerbado = aux[2] + "/" + aux[1] + "/" + aux[0];
        String fAbonado = String.valueOf(rs.getDate("LOTE_FECHAABONADO"));
        aux = fAbonado.split("-");
        fAbonado = aux[2] + "/" + aux[1] + "/" + aux[0];
        boolean carga = rs.getBoolean("LOTE_CARGA");
        Long idLote = new Long(rs.getInt("LOTE_IDLOTE"));
        double area = rs.getDouble("LOTE_AREATOTAL");
        Lote newLote = new Lote(idLote, area, fDesyerbado, fAbonado, carga);
        return newLote;
    }

    @Override
    public void insertar(Lote a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
            stat.setDate(1, new java.sql.Date(date1.parse(a.getFechaDesyerbado()).getTime()));
            stat.setDate(2, new java.sql.Date(date1.parse(a.getFechaAbonado()).getTime()));
            stat.setDouble(3, a.getAreaTotal());
            stat.setBoolean(4, a.isCarga());
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
    public void modificar(Lote a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setDate(1, java.sql.Date.valueOf(a.getFechaDesyerbado()));
            stat.setDate(2, java.sql.Date.valueOf(a.getFechaAbonado()));
            stat.setBoolean(3, a.isCarga());
            stat.setInt(4, (int) (long) a.getIdLote());
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
    public void eliminar(Lote a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getIdLote());
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
    public List<Lote> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Lote> l = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                l.add(convertir(rs));
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
                    System.out.println("Error al Intentar cerrar la conexion con H2DB");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2DB");
                }
            }
        }
        return l;
    }

    @Override
    public Lote obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Lote l = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.LOTE WHERE LOTE_IDLOTE = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                l = convertir(rs);
            } else {
                System.out.println("Registro Lote no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL2");
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2DB");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2DB");
                }
            }
        }
        return l;
    }

}
