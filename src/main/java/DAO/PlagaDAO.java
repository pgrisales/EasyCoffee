/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import com.easycoffee.Lote;
import com.easycoffee.Plaga;
import com.easycoffee.Usuario;
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
public class PlagaDAO {
    final String INSERT = "INSERT INTO EASYCOFFEBD.PLAGA VALUES (default, ?, ?, ?, ?)";
    final String DELETE = "DELETE FROM EASYCOFFEBD.PLAGA WHERE PLA_NOMBRE = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.PLAGA";
    private Connection conn;

    public PlagaDAO(Connection conn) {
        this.conn = conn;
    }
    private Plaga convertir(ResultSet rs) throws SQLException, IOException {
        
        String nombre = rs.getString("PLA_NOMBRE");
        Clob clob = rs.getClob("PLA_DESCRIPCION");
        Reader r = clob.getCharacterStream();
        StringBuffer bufferDescripcion = new StringBuffer();
        int ch;
        while((ch = r.read())!=-1) {
            bufferDescripcion.append(""+(char)ch);
         }
        clob = rs.getClob("PLA_TRATAMIENTO");
        r = clob.getCharacterStream();
        StringBuffer bufferTratamiento = new StringBuffer();
        int sh;
        while((sh = r.read())!=-1) {
            bufferTratamiento.append(""+(char)sh);
         };
        Blob blob = rs.getBlob("PLA_IMG");
        
        byte[] img = blob.getBytes(1, (int)blob.length());
        BufferedImage icon = null;
        try {
            icon = ImageIO.read(new ByteArrayInputStream(img));
        } catch (Exception e) {
        }
        ImageIcon icono = new ImageIcon(icon);
        
        Plaga newPlaga = new Plaga(nombre,icono,bufferDescripcion.toString(),bufferTratamiento.toString());
        return newPlaga;
    }
    public void insertar(Plaga u, String ruta) throws FileNotFoundException {
        PreparedStatement stat = null;
         FileInputStream fi = null;
        try {
            Clob Descripcion = new javax.sql.rowset.serial.SerialClob(u.getDescripcionPlaga().toCharArray());
            Clob Tratamiento = new javax.sql.rowset.serial.SerialClob(u.getTratamientoPlaga().toCharArray());
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, u.getNombrePlaga());
            stat.setClob(2, Descripcion);
            stat.setClob(3, Tratamiento);
            File file = new File(ruta);
            fi = new FileInputStream(file);
            stat.setBinaryStream(4, fi);
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
    public List<Plaga> obtenerTodos() throws IOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Plaga> u = new ArrayList<Plaga>();
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
