/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.easycoffee.Trabajador;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class TrabajadorDAO implements DAO<Trabajador,Long>{

    final String INSERT = "INSERT INTO EASYCOFFEDB.TRABAJADOR VALUES (?, ?)"; //(PER_CEDULACIUDADANIA, FINCA_IDFINCA, LOTE_LOTE_IDLOTE, USU_USERNAME, USU_PASSWORD, USU_ROLUSUARIO, USU_RESPUESTAPREGUNTA)
    final String UPDATE = "UPDATE EASYCOFFEDB.USUARIO SET USU_USERNAME = ?, USU_PASSWORD = ?, LOTE_LOTE_IDLOTE = ? USU_RESPUESTAPREGUNTA= ? WHERE PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEDB.USUARIO WHERE PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEDB.PERSONA NATURAL JOIN EASYCOFFEDB.USUARIO";
    
    private Connection conn;

    public TrabajadorDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Trabajador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Trabajador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Trabajador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trabajador> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trabajador obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
