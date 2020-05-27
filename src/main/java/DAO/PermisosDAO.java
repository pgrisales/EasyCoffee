/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import com.easycoffee.Arbol;
import com.easycoffee.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Diego Lopez A
 */
public class PermisosDAO {
    final String INSERT = "INSERT INTO EASYCOFFEDB.PERMISOS VALUES (default, ?, ?)";
    final String DELETE = "DELETE FROM EASYCOFFEDB.PERMISOS WHERE LOTE_IDLOTE = ? AND PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEDB.PERMISOS WHERE PER_CEDULACIUDADANIA = ?";
    
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
    public void eliminar(Usuario a, Long idLote) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, idLote.intValue());
            stat.setInt(2, a.getCedula().intValue());
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
    public ArrayList<Integer> obtenerTodos() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        ArrayList<Integer> a = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            boolean r = rs.next();
            while (r) {     //OJO!!! El rs.next(); Funciona Igual que un Scanner sc.next();
                a.add(convertir(rs));
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
        return a;
    }

    
}
