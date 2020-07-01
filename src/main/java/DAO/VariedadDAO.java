/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import com.easycoffee.Lote;
import com.easycoffee.Plaga;
import com.easycoffee.Usuario;
import com.easycoffee.Variedad;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class VariedadDAO {
    final String INSERT = "INSERT INTO EASYCOFFEBD.VARIEDAD VALUES (default, ?, ?, ?, ?, ?, ?)";
    final String DELETE = "DELETE FROM EASYCOFFEBD.VARIEDAD WHERE var_NOMBRE = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.VARIEDAD";
    private Connection conn;

    public VariedadDAO(Connection conn) {
        this.conn = conn;
    }
    private Variedad convertir(ResultSet rs) throws SQLException, IOException {
        
        String nombre = rs.getString("VAR_NOMBRE");
        String porte = rs.getString("VAR_PORTE");
        String color = rs.getString("VAR_COLORHOJA");
        String prod = rs.getString("VAR_PROD");
        Clob clob = rs.getClob("VAR_DESCRIPCION");
        Reader r = clob.getCharacterStream();
        StringBuffer bufferDescripcion = new StringBuffer();
        int ch;
        while((ch = r.read())!=-1) {
            bufferDescripcion.append(""+(char)ch);
         }
        
        Blob blob = rs.getBlob("VAR_IMG");
        
        byte[] img = blob.getBytes(1, (int)blob.length());
        BufferedImage icon = null;
        try {
            icon = ImageIO.read(new ByteArrayInputStream(img));
        } catch (Exception e) {
        }
        ImageIcon icono = new ImageIcon(icon);
        
        Variedad newVariedad = new Variedad(nombre, icono, bufferDescripcion.toString(), color, prod, porte);
        return newVariedad;
    }
    public void insertar(Variedad u, String ruta) throws FileNotFoundException {
        PreparedStatement stat = null;
         FileInputStream fi = null;
        try {
            Clob Descripcion = new javax.sql.rowset.serial.SerialClob(u.getDescripcion().toCharArray());
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            stat = conn.prepareStatement(INSERT);
            stat.setBinaryStream(1, fi);
            stat.setClob(2, Descripcion);
            stat.setString(3, u.getColorHoja());
            stat.setString(4, u.getProduccion());
            stat.setString(5, u.getPorte());
            stat.setString(6, u.getNombrevar());
            
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
    public List<Variedad> obtenerTodos() throws IOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Variedad> u = new ArrayList<Variedad>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                u.add(convertir(rs));
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
        return u;
    }
}
