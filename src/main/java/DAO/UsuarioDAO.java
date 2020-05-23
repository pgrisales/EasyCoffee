/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.easycoffee.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Camilo Vargas
 */
public class UsuarioDAO implements DAO<Usuario, Long> {

    final String INSERT = "INSERT INTO EASYCOFFEDB.USUARIO VALUES (?, ?, ?, ?, ?, ?, ?);"; //(PERSONA_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO, USU_RESPUESTAPREGUNTA)
    final String UPDATE = "UPDATE EASYCOFFEDB.USUARIO SET USU_USERNAME = ?, USU_PASSWORD = ?, LOTE_LOTE_IDLOTE = ? USU_RESPUESTAPREGUNTA= ? WHERE PERSONA_CEDULACIUDADANIA = ?;";
    final String DELETE = "DELETE FROM EASYCOFFEDB.USUARIO WHERE PERSONA_CEDULACIUDADANIA = ?;";
    final String GETALL = "SELECT * FROM EASYCOFFEDB.PERSONA NATURAL JOIN EASYCOFFEDB.USUARIO";

    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    private Usuario convertir(ResultSet rs) throws SQLException {
        Long cedulaCiudadania = rs.getLong("PERSONA_CEDULACIUDADANIA");
        int idFinca = rs.getInt("FINCA_IDFINCA");
        int idLote = rs.getInt("LOTE_LOTE_IDLOTE");
        String username = rs.getString("USU_USERNAME");
        String password = rs.getString("USU_PASSWORD");
        String rolUsuario = rs.getString("USU_ROLUSUARIO");
        String nombrePersona = rs.getString("PER_NOMBRE");
        String apellidoPersona = rs.getString("PER_APELLIDO");
        String respuestaUsuario = rs.getString("USU_RESPUESTAUSUARIO");
        boolean estadoPersona = rs.getBoolean("PER_ESTADOPERSONA");
        Usuario newUsuario = new Usuario(username, password, respuestaUsuario, cedulaCiudadania, nombrePersona, apellidoPersona, estadoPersona);
        return newUsuario;
    }

    @Override
    public void insertar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1, u.getCedula());
            stat.setInt(2, 1);
            stat.setInt(3, u.getIdLote());
            stat.setString(4, u.getUsername());
            stat.setString(5, u.getPassword());
            stat.setString(6, "Aux");
            stat.setString(7, u.getRespuesta());
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
    public void modificar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, u.getUsername());
            stat.setString(2, u.getPassword());
            stat.setInt(3, u.getIdLote());
            stat.setString(4, u.getRespuesta());
            stat.setLong(5, u.getCedula());
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
    public void eliminar(Usuario u) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, u.getCedula());
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
    public ArrayList<Usuario> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        ArrayList<Usuario> u = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            if (!rs.next()) {
                System.out.println("Registro no encontrado");
            }
            while (rs.next()) {
                u.add(convertir(rs));
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
        return u;
    }

    @Override
    public Usuario obtener(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Usuario u = null;
        try {
            stat = conn.prepareStatement(GETALL + "WHERE PERSONA_CEDULACIUDADANIA = ?");
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                u = convertir(rs);
            } else {
                System.out.println("Registro no encontrado");
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL");
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
        return u;
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            String myDb = "jdbc:derby://localhost:1527/easycoffedb";
            conn = DriverManager.getConnection(myDb, "root","admin");
            UsuarioDAO dao = new UsuarioDAO(conn);
            ArrayList<Usuario> users = dao.obtenerTodos();
            for (Usuario u : users) {
                System.out.println(u.toString());
            }
        } catch (SQLException e) {
            System.out.println("Error de UsuarioDao");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
