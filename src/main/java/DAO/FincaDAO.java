package DAO;

import com.easycoffee.Finca;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class FincaDAO implements DAO<Finca, Integer> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.FINCA VALUES (DEFAULT,?,NULL, NULL)";
    final String UPDATE = "UPDATE EASYCOFFEBD.FINCA SET FIN_NOMBREFINCA = ? WHERE FIN_IDFINCA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.USUARIO WHERE FIN_NOMBREFINCA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.FINCA";

    private Connection conn;

    public FincaDAO(Connection conn) {
        this.conn = conn;
    }

    private Finca convertir(ResultSet rs) throws SQLException {
        String nombreFinca = rs.getString("FIN_NOMBREFINCA");
        Finca newFinca = new Finca(nombreFinca);
        return newFinca;
    }

    @Override
    public void insertar(Finca f) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, f.getNombreFinca());
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

    public String obtenerCoordenadas() {  //Obtener todos los memos del sistema
        PreparedStatement stat = null;
        ResultSet rs = null;
        String name = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.FINCA");
            rs = stat.executeQuery();
            String nombre = "";
            if (rs.next()) {
                name = rs.getString("COORDENADAS_FINCA");
                System.out.println("coor "+nombre);
            } else {
                System.out.println("no encontrado");
            }
            //name=rs.getString(2);           
            
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
        return name;
    }
    public String obtenerShape() {  //Obtener todos los memos del sistema
        PreparedStatement stat = null;
        ResultSet rs = null;
        String name = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.FINCA");
            rs = stat.executeQuery();
            String nombre = "";
            if (rs.next()) {
                name = rs.getString("SHAPE_FINCA");
            } else {
                System.out.println("no encontrado");
            }
            //name=rs.getString(2);           
            
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
        return name;
    }

    @Override
    public void modificar(Finca f) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, f.getNombreFinca());
            stat.setInt(2, 1);
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
public void modificarCoordenadas(String coor) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement("UPDATE EASYCOFFEBD.FINCA SET COORDENADAS_FINCA = ?");
            stat.setString(1, coor);
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


    public void modificarShape(String shap) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement("UPDATE EASYCOFFEBD.FINCA SET SHAPE_FINCA = ? ");
            stat.setString(1, shap);

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
    public void eliminar(Finca f) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, 1);
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
    public List<Finca> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Finca> f = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                f.add(convertir(rs));
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
        return f;
    }

    @Override
    public Finca obtener(Integer id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Finca f = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.FINCA FETCH FIRST 1 ROWS ONLY");
            rs = stat.executeQuery();
            if (rs.next()) {
                f = convertir(rs);
            } else {
                System.out.println("Registro Finca no encontrado");
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
        return f;
    }

}
