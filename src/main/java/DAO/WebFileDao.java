
package DAO;

import com.easycoffee.Memo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAR
 */
public class WebFileDao {
    
    public static void main(String[] args) throws SQLException{
        
        System.out.println(obtener("getCoor.html"));
        
    }
    public static String obtener(String fileName) throws SQLException {   //Obtener Todos los memos de una Persona
        
        Connection conn = DriverManager.getConnection("jdbc:h2:~/Documents/NetBeansProjects/EasyCoffee/db/EASYCOFFEBD", "admin", "1234");
        
        PreparedStatement stat = null;
        ResultSet rs = null;
        String file = null;
        try {
            stat = conn.prepareStatement("SELECT * FROM EASYCOFFEBD.WEBFILES WHERE WEBFILES.WEBFILE_NAME = '?'");
            stat.setString(1, fileName);
            rs = stat.executeQuery();
            System.out.println(stat);
            System.out.println(rs);
            file = rs.getString("WEBFILE_NAME");
            
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
        return file;
    }
    
}
