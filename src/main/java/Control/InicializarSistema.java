/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;
import DAO.DAOManager;
import com.easycoffee.Administrador;
import com.easycoffee.Lote;
import com.easycoffee.Trabajador;
import com.easycoffee.Usuario;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class InicializarSistema{
    
    private Administrador admin = null;   //ADMIN MAESTRO
    DAO.DAOManager daoManager;
    
    public InicializarSistema() {
      
       this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
       
       ArrayList<Usuario> users = (ArrayList<Usuario>) daoManager.getUsuarioDAO().obtenerTodos();
      
       this.admin = (Administrador) users.remove(0);
       
       if(admin != null){
                this.admin.setFinca(daoManager.getFincaDAO().obtener(1));
                if(this.admin.getFinca()!=null){
                    this.admin.getFinca().setAuxiliares(users);
                    ArrayList<Trabajador> trabajadores = (ArrayList<Trabajador>) daoManager.getTrabajadorDAO().obtenerTodos();
                    ArrayList<Lote> lotes = (ArrayList<Lote>) daoManager.getLoteDAO().obtenerTodos();
                    this.admin.getFinca().setTrabajadores(trabajadores);
                    this.admin.getFinca().setLotes(lotes);
                }
       }
       
       
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
    
    

    
    
}
