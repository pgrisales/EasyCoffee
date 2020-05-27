/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import com.easycoffee.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Diego Lopez A
 */
public class PermisosDAO {
    final String INSERT = "INSERT INTO EASYCOFFEDB.PERMISOS VALUES (default, ?, ?)";
    final String DELETE = "DELETE FROM EASYCOFFEDB.PERMISOS WHERE PER_ID = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEDB.PERMISOS";

    private Connection conn;

    public PermisosDAO(Connection conn) {
        this.conn = conn;
    }
    
    private int convertir(ResultSet rs) throws SQLException {
    int idLote = rs.getInt("LOTE_IDLOTE");
    return idLote;
    }
    
    public void insertar(Usuario u, int idLote) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, u.getCedula().intValue());
            stat.setInt(2, idLote);
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
}
