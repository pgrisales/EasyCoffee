package DAO;

import com.easycoffee.*;
import java.sql.*;
import java.util.List;

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

//    database :  "jdbc:derby://localhost:1527/easycoffedb" Username: "root" Password: "admin"
    public DAOManager(String host, String username, String password, String database) {
        try {
            conn = DriverManager.getConnection("jdbc:derby://" + host + "/" + database, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void cerrarConexion() throws SQLException {
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        DAOManager DAO = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
        List<Persona> personas = DAO.getPersonaDAO().obtenerTodos();
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
        List<Usuario> users = DAO.getUsuarioDAO().obtenerTodos();
        for (Usuario u : users) {
            System.out.println(u.toString());
        }
        DAO.cerrarConexion();
    }
}
