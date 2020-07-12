/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.easycoffee.Memo;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nivektakedown
 */

public class WebFilesDAO {
    final private String GETALL = "SELECT * FROM EASYCOFFEBD.WEBFILES";
    private Connection conn;
    public WebFilesDAO(Connection conn) {
        this.conn = conn;
    }
    public String obtener(String NAME) {  //Obtener todos los memos del sistema
        PreparedStatement stat = null;
        ResultSet rs = null;
        String name = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.WEBFILES WHERE WEBFILES.WEBFILE_NAME = '"+NAME+"'");
            rs = stat.executeQuery();
            String nombre = "";
            if (rs.next()) {
                nombre = rs.getString("WEBFILE_TEXT");
            } else {
                System.out.println("no encontrado");
            }
            name=rs.getString(2);           
            
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
}
