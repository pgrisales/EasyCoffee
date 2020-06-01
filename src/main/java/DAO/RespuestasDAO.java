package DAO;

import com.easycoffee.Usuario;
import java.sql.*;

public class RespuestasDAO {

    final String INSERT = "INSERT INTO EASYCOFFEBD.RESPUESTAS VALUES (?, ?, ?, ?)";
    final String UPDATE = "UPDATE EASYCOFFEBD.RESPUESTAS SET RES_NUMERO1 = ?, RES_NUMERO2 = ? RES_NUMERO3 = ? WHERE PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.RESPUESTAS WHERE PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.RESPUESTAS";

    private Connection conn;

    public RespuestasDAO(Connection conn) {
        this.conn = conn;
    }

    private String[] convertir(ResultSet rs) throws SQLException {
        int cedulaCiudadania = rs.getInt("PER_CEDULACIUDADANIA");
        String respuesta1 = rs.getString("RES_NUMERO1");
        String respuesta2 = rs.getString("RES_NUMERO2");
        String respuesta3 = rs.getString("RES_NUMERO3");
        String[] newRespuestas = {respuesta1, respuesta2, respuesta3};
        return newRespuestas;
    }

    public void insertar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, (int) (long) u.getCedula());
            String[] aux = u.getRespuesta();
            stat.setString(2, aux[0]);
            stat.setString(3, aux[1]);
            stat.setString(4, aux[2]);
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

    public void modificar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            String[] aux = u.getRespuesta();
            stat.setString(1, aux[0]);
            stat.setString(2, aux[1]);
            stat.setString(3, aux[2]);
            stat.setInt(4, (int) (long) u.getCedula());
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

    public void eliminar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, (int) (long) u.getCedula());
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

    public String[] obtener(Integer cedulaCiudadania) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        String[] preguntas = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.RESPUESTAS WHERE PER_CEDULACIUDADANIA = ?");
            stat.setLong(1, cedulaCiudadania);
            rs = stat.executeQuery();
            if (rs.next()) {
                preguntas = convertir(rs);
            } else {
                System.out.println("Registro Respuestas no encontrado");
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
        return preguntas;
    }
}
