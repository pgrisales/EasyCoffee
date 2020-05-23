/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import com.easycoffee.Usuario;

/**
 *
 * @author Camilo Vargas
 */
public class ValidarLogin {
    UsuarioDAO usuarioDAO= new UsuarioDAO();

    public ValidarLogin() {
    }
    
    public boolean verificarLogin(Usuario user){
        return false;
    }
}
