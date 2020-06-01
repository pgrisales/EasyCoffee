package DAO;

import com.easycoffee.Arbol;
import com.easycoffee.Lote;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo Vargas
 */
public class ArbolDAO implements DAO<Arbol, Integer> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.ARBOL VALUES (default, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEBD.ARBOL SET ARB_TIPOARB = ?, LOTE_IDLOTE = ?, ARB_ESTADO = ?, ARB_FECHASEMBRADO = ? ";
    final String DELETE = "DELETE FROM EASYCOFFEBD.ARBOL WHERE ARB_ID = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.ARBOL WHERE LOTE_IDLOTE = ?";

    private Connection conn;

    public ArbolDAO(Connection conn) {
        this.conn = conn;
    }

    private Arbol convertir(ResultSet rs) throws SQLException {

        String tipoArbol = rs.getString("ARB_TIPOARB");
        int idLote = rs.getInt("LOTE_IDLOTE");
        boolean estadoArbol = rs.getBoolean("ARB_ESTADO");
        String fechaSiembra = String.valueOf(rs.getDate("ARB_FECHASIEMBRA"));
        Arbol newArbol = new Arbol(idLote, estadoArbol, tipoArbol, fechaSiembra);
        return newArbol;
    }

    @Override
    public void insertar(Arbol a) {
        PreparedStatement stat = null;
        try {
            SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, a.getVariedad());
            System.out.println(a.getIdLote());
            stat.setInt(2, a.getIdLote());
            stat.setBoolean(3, a.isEstadoArbolVivo());
            stat.setDate(4, new java.sql.Date(date1.parse(a.getFechaDeSembrado()).getTime()));
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(ArbolDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public void eliminar(int a, Lote lote) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, a);
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

    public List<Arbol> obtenerTodos(Lote lote) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Arbol> a = new ArrayList<Arbol>();
        try {
            stat = conn.prepareStatement(GETALL);
            stat.setInt(1, lote.getIdLote().intValue());
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
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.ARBOL WHERE ARB_ID = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                a = convertir(rs);
            } else {
                System.out.println("Registro Arbol no encontrado");
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

    @Override
    public List<Arbol> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Arbol a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
