/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.easycoffee.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class PersonaDAO implements DAO<Persona, Long>{
    final String INSERT = "INSERT INTO PERSONA VALUES (?, ?, ?, ?);"; 
    final String UPDATE = "UPDATE PERSONA SET PER_ESTADOPERSONA = ?;";
    final String DELETE = "DELETE FROM PERSONA WHERE PERSONA_CEDULACIUDADANIA = ?;";
    final String GETALL = "SELECT * FROM PERSONA;";

    private Connection conn;

    public PersonaDAO(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void insertar(Persona a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1, a.getCedula());
            stat.setBoolean(2, a.isEstado());
            stat.setString(2, a.getNombre());
            
        } catch (Exception e) {
        }
    }

    @Override
    public void modificar(Persona a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Persona a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Persona> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
