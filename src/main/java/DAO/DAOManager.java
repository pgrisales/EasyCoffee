package DAO;

import Frontera.FramePrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo Vargas
 */
public class DAOManager {

    private Connection conn;

    private UsuarioDAO usuarios = null;
    private TrabajadorDAO trabajadores = null;
    private PersonaDAO personas = null;
    private LoteDAO lotes = null;
    private JornadaDAO jornadas = null;
    private FincaDAO fincas = null;
    private ArbolDAO arboles = null;
    private RespuestasDAO respuestas = null;
    private PermisosDAO permisos = null;

//    database :  "jdbc:derby://localhost:1527/easycoffebd" Username: "root" Password: "admin"
    public DAOManager() {
        try {
            conn = DriverManager.getConnection("jdbc:h2:~/Documents/NetBeansProjects/EasyCoffee/db/EASYCOFFEBD", "admin", "1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PermisosDAO getPermisosDAO() {
        if (permisos == null) {
            permisos = new PermisosDAO(conn);
        }
        return permisos;
    }

    public UsuarioDAO getUsuarioDAO() {
        if (usuarios == null) {
            usuarios = new UsuarioDAO(conn);
        }
        return usuarios;
    }

    public TrabajadorDAO getTrabajadorDAO() {
        if (trabajadores == null) {
            trabajadores = new TrabajadorDAO(conn);
        }
        return trabajadores;
    }

    public PersonaDAO getPersonaDAO() {
        if (personas == null) {
            personas = new PersonaDAO(conn);
        }
        return personas;
    }

    public LoteDAO getLoteDAO() {
        if (lotes == null) {
            lotes = new LoteDAO(conn);
        }
        return lotes;
    }

    public JornadaDAO getJornadaDAO() {
        if (jornadas == null) {
            jornadas = new JornadaDAO(conn);
        }
        return jornadas;
    }

    public FincaDAO getFincaDAO() {
        if (fincas == null) {
            fincas = new FincaDAO(conn);
        }
        return fincas;
    }

    public ArbolDAO getArbolDAO() {
        if (arboles == null) {
            arboles = new ArbolDAO(conn);
        }
        return arboles;
    }

    public RespuestasDAO getRespuestasDAO() {
        if (respuestas == null) {
            respuestas = new RespuestasDAO(conn);
        }
        return respuestas;
    }

    public boolean testConexion() throws SQLException {
        return conn.isValid(1);
    }

    public void cerrarConexion() throws SQLException {
        conn.close();
    }

}
