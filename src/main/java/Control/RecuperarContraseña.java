/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOManager;
import com.easycoffee.Usuario;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Nivektakedown
 */
public class RecuperarContraseña {

    Usuario u = null;
    DAO.DAOManager daoManager;

    public RecuperarContraseña() {
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
    }

    public boolean compararCedula(Long cedula) {
        try {
            this.u = daoManager.getUsuarioDAO().obtener(cedula);
            System.out.println("comparar ced "+u);
            return true;
        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }
        
    }

    public boolean compararRespuestas(String r, int index) {
        String[] s = this.u.getRespuesta();
        System.out.println("comparar res "+s[index].equals(r));
        return s[index].equals(r);
    }

    public void changePassword(String p) throws SQLException {
        this.u.setPassword(p);
        daoManager.getUsuarioDAO().modificar(this.u);
        daoManager.cerrarConexion();
    }
    public static void main(String[] args) {
//        Usuario test = new Usuario("134", (long) 195, "Camilo", "Vargas", true);
        ValidarLogin login = new ValidarLogin();
        RecuperarContraseña r=new RecuperarContraseña();
        boolean c= r.compararCedula((long)195);
        
    }
}
