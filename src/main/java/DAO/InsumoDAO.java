package DAO;

import com.easycoffee.Insumo;
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
public class InsumoDAO {

    final String INSERT = "INSERT INTO EASYCOFFEBD.INSUMO VALUES (default, ?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEBD.INSUMO SET CANTIDADSTOCK = ? WHERE IDINSUMO = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.INSUMO WHERE IDINSUMO = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.INSUMO";
    private Connection conn;

    public InsumoDAO(Connection conn) {
        this.conn = conn;
    }

    private Insumo convertir(ResultSet rs) throws SQLException {
        String nombreInsumo = rs.getString("NOMBREINSUMO");
        String descripcionInsumo = rs.getString("DESCRIPCIONINSUMO");
        Double precioCompra = rs.getDouble("PRECIOCOMPRA");
        Double cantidadStock = rs.getDouble("CANTIDADSTOCK");
        Insumo newInsumo = new Insumo(nombreInsumo, descripcionInsumo, precioCompra, cantidadStock);
        newInsumo.setIdLote(rs.getInt("LOTE_LOTE_IDLOTE"));
        newInsumo.setIdLote(rs.getInt("IDINSUMO"));
        return newInsumo;
    }

    public void insertar(Insumo a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, a.getIdLote());
            stat.setString(2, a.getNombreInsumo());
            stat.setString(3, a.getDescripcionInsumo());
            stat.setDouble(4, a.getPrecioCompra());
            stat.setDouble(5, a.getCantidadEnStock());
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

    public void modificar(Insumo a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setDouble(1, a.getCantidadEnStock());
            stat.setInt(2, a.getIdLote());
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

    public void eliminar(Insumo a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getIdInsumo());
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

    public Insumo obtener(int idInsumo) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Insumo i = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.INSUMO WHERE IDINSUMO = ?");
            stat.setInt(1, idInsumo);
            rs = stat.executeQuery();
            if (rs.next()) {
                i = convertir(rs);
            } else {
                System.out.println("Registro Insumo no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL2");
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
        }
        return i;
    }

    public Insumo obtenerUltimo() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Insumo i = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.INSUMO WHERE IDINSUMO = (SELECT MAX (IDINSUMO) FROM EASYCOFFEBD.INSUMO)");
            rs = stat.executeQuery();
            if (rs.next()) {
                i = convertir(rs);
            } else {
                System.out.println("Registro Insumo no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL2");
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
        }
        return i;
    }

    public List<Insumo> obtenerTodosSegunLote(int idLote) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Insumo> I = new ArrayList<>();
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.INSUMO WHERE LOTE_LOTE_IDLOTE = ?");
            stat.setInt(1, idLote);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                I.add(convertir(rs));
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
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    System.out.println("Error al Intentar cerrar la conexion con H2");
                }
            }
        }
        return I;
    }
}
