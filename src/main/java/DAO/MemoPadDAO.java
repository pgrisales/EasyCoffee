package DAO;

import com.easycoffee.Memo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class MemoPadDAO {

    final private String INSERT = "INSERT INTO EASYCOFFEBD.MEMOPAD VALUES (?, ?, ?, DEFAULT)"; //(MEMO_FECHAMEMOPAD, PER_CEDULACIUDADANIA, MEMO_TEXTOMEMOPAD)
    final private String UPDATE = "UPDATE EASYCOFFEBD.MEMOPAD SET MEMO_TEXTOMEMOPAD = ? WHERE MEMO_FECHAMEMOPAD = ? AND PER_CEDULACIUDADANIA = ?";
    final private String DELETE = "DELETE FROM EASYCOFFEBD.MEMOPAD WHERE MEMO_FECHAMEMOPAD = ? AND PER_CEDULACIUDADANIA = ?";
    final private String GETALL = "SELECT * FROM EASYCOFFEBD.MEMOPAD";
    private Connection conn;

    public MemoPadDAO(Connection conn) {
        this.conn = conn;
    }

    private Memo convertir(ResultSet rs) throws SQLException {

        //String fechaSiembra = String.valueOf(rs.getDate("ARB_FECHASIEMBRA"));
        String fechaMemo = String.valueOf(rs.getDate("MEMO_FECHAMEMOPAD"));
        int idPersona = rs.getInt("PER_CEDULACIUDADANIA");
        String textoMemo = rs.getString("MEMO_TEXTOMEMOPAD");

        Memo newMemo = new Memo(idPersona, fechaMemo, textoMemo);
        return newMemo;
    }

    public void insertar(Memo memo) {
        PreparedStatement stat = null;
        try {
            SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
            //Date.valueOf(memo.getFecha())
            stat = conn.prepareStatement(INSERT);
            stat.setDate(1, new Date(date1.parse(memo.getFecha()).getTime()));
            stat.setInt(2, memo.getIdPersona());
            stat.setString(3, memo.getTexto());
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

    public void modificar(Memo memo) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, memo.getTexto());
            stat.setString(2, memo.getFecha());
            stat.setInt(3, memo.getIdPersona());
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

    public void eliminar(Memo memo) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, memo.getIdPersona());
            stat.setString(2, memo.getTexto());
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

    public List<Memo> obtenerTodos() {  //Obtener todos los memos del sistema
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Memo> memos = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                memos.add(convertir(rs));
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
        return memos;
    }

    public List<Memo> obtener(Integer id) {   //Obtener Todos los memos de una Persona
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Memo> memos = new ArrayList<>();
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.MEMOPAD WHERE PER_CEDULACIUDADANIA = ?");
            stat.setInt(1, id);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                memos.add(convertir(rs));
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
        return memos;
    }

}
