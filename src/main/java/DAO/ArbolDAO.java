package DAO;

import com.easycoffee.Arbol;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Camilo Vargas
 */
public class ArbolDAO implements DAO<Arbol, Integer> {

    final String INSERT = "INSERT INTO EASYCOFFEDB.ARBOL VALUES (?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEDB.ARBOL SET ARB_TIPOARB = ?, LOTE_IDLOTE = ? ARB_ESTADO = ? ARB_FECHASEMBRADO = ? WHERE ARB_ID = ?";
    final String DELETE = "DELETE FROM EASYCOFFEDB.ARBOL WHERE ARB_ID = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEDB.ARBOL";

    private Connection conn;

    public ArbolDAO(Connection conn) {
        this.conn = conn;
    }

    private Arbol convertir(ResultSet rs) throws SQLException {

        int idArbol = rs.getInt("ARB_ID");
        String tipoArbol = rs.getString("ARB_TIPOARB");
        int idLote = rs.getInt("LOTE_IDLOTE");
        boolean estadoArbol = rs.getBoolean("ARB_ESTADO");
        String fechaSiembra = String.valueOf(rs.getDate("ARB_FECHASIEMBRA"));
        Arbol newArbol = new Arbol(idArbol,idLote, estadoArbol,tipoArbol, fechaSiembra);
        return newArbol;
    }

    @Override
    public void insertar(Arbol a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, a.getID());
            stat.setString(2, a.getVariedad());
            stat.setInt(3, a.getIdLote());
            stat.setBoolean(4, a.isEstadoArbolVivo());
            stat.setDate(5, java.sql.Date.valueOf(a.getFechaDeSembrado()));
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
    public void modificar(Arbol a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, a.getVariedad());
            stat.setInt(2, a.getIdLote());
            stat.setBoolean(3, a.isEstadoArbolVivo());
            stat.setDate(4, java.sql.Date.valueOf(a.getFechaDeSembrado()));
            stat.setInt(5, a.getID());
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
    public void eliminar(Arbol a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getID());
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
    public List<Arbol> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Arbol> a = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                a.add(convertir(rs));
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
        return a;
    }

    @Override
    public Arbol obtener(Integer id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Arbol a = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEDB.ARBOL WHERE ARB_ID = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                a = convertir(rs);
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
        return a;
    }

}
