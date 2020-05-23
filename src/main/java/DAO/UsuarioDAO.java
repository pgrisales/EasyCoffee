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
public class UsuarioDAO implements DAO<Usuario, Long>{

    final String INSERT = "INSERT INTO USUARIO VALUES (?, ?, ?, ?, ?, ?);"; //(PERSONA_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO)
    final String UPDATE = "UPDATE USUARIO SET USU_USERNAME = ?, USU_PASSWORD = ?, LOTE_LOTE_IDLOTE = ? WHERE PERSONA_CEDULACIUDADANIA = ?;";
    final String DELETE = "DELETE FROM USUARIO WHERE PERSONA_CEDULACIUDADANIA = ?;";
    final String GETALL = "SELECT * FROM PERSONA NATURAL JOIN USUARIO";
    
    private Connection conn;

    private Usuario convertir(ResultSet rs) throws SQLException{
        Long cedulaCiudadania = rs.getLong("PERSONA_CEDULACIUDADANIA");
        int idFinca = rs.getInt("FINCA_IDFINCA");
        int idLote = rs.getInt("LOTE_LOTE_IDLOTE");
        String username = rs.getString("USU_USERNAME");
        String password = rs.getString("USU_PASSWORD");
        String rolUsuario = rs.getString("USU_ROLUSUARIO");
//        Usuario newUsuario = new Usuario(username, password, "Falts Esto", cedulaCiudadania, , INSERT, true);
    }
    
    @Override
    public void insertar(Usuario u) {
        PreparedStatement stat = null;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1, u.getCedula());
            stat.setInt(2, 1);
            stat.setInt(3, u.getIdLote());
            stat.setString(4, u.getUsername());
            stat.setString(5, u.getPassword());
            stat.setString(6, "Aux");
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ef){
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public void modificar(Usuario u) {
        PreparedStatement stat = null;
        try{
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, u.getUsername());
            stat.setString(2, u.getPassword());
            stat.setInt(3, u.getIdLote());
            stat.setLong(4, u.getCedula());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya eliminado");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ef){
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public void eliminar(Usuario u) {
        PreparedStatement stat = null;
        try{
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, u.getCedula());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya eliminado");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            if (stat != null) {
                try{
                    stat.close();
                }catch(SQLException ef){
                    ef.printStackTrace();
                }
            }
        }
    }

    @Override
    public ArrayList<Usuario> obtenerTodos() {
        return null;
    }

    @Override
    public Usuario obtener(Long id) {
        
    }
}