/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOManager;
import com.easycoffee.Administrador;
import com.easycoffee.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Nivektakedown
 */
public class RegistrarAdmin {
    DAO.DAOManager daoManager;

    public RegistrarAdmin() {
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
    }
    public void registrar(Administrador admin) throws SQLException{
        Usuario u= new Usuario(admin.getPassword(), admin.getCedula(), admin.getNombre(), admin.getApellido(), true, admin.getRespuesta()[0], admin.getRespuesta()[0], admin.getRespuesta()[0]);
        daoManager.getUsuarioDAO().insertar(u);
        daoManager.cerrarConexion();
    }
}
