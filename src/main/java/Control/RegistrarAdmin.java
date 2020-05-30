/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOManager;
import com.easycoffee.Administrador;
import com.easycoffee.Persona;
import com.easycoffee.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Nivektakedown
 */
public class RegistrarAdmin {

    DAO.DAOManager daoManager;

    public RegistrarAdmin() {
        this.daoManager = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
    }

    public void registrar(Administrador admin) throws SQLException {
        Persona p = new Persona(admin.getCedula(), admin.getNombre(), admin.getPassword(), true);
        daoManager.getPersonaDAO().insertar(p);
        Usuario u = new Usuario(admin.getPassword(), admin.getCedula(), admin.getNombre(), admin.getApellido(), true, admin.getRespuesta()[0], admin.getRespuesta()[0], admin.getRespuesta()[0]);
        daoManager.getUsuarioDAO().insertar(u);
        daoManager.getRespuestasDAO().insertar(u);
        daoManager.cerrarConexion();
    }
}
