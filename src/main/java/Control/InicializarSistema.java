package Control;
import DAO.DAOManager;
import com.easycoffee.Administrador;
import com.easycoffee.Arbol;
import com.easycoffee.Finca;
import com.easycoffee.Lote;
import com.easycoffee.Trabajador;
import com.easycoffee.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class InicializarSistema {

    private Administrador admin = null;   //ADMIN MAESTRO
    private DAO.DAOManager daoManager;
    private ArrayList<Usuario> users = null;
    private ArrayList<Trabajador> trabajadores = null;
    private ArrayList<Lote> lotes = null;

    public InicializarSistema() {
        this.daoManager = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
        this.users = (ArrayList<Usuario>) daoManager.getUsuarioDAO().obtenerTodos();
        for (Usuario u : users) {
            u.setRespuesta(daoManager.getRespuestasDAO().obtener(u.getCedula().intValue()));
        }
        if (!users.isEmpty()) {
            Usuario u = users.remove(0);
            this.admin = new Administrador(u.getPassword(), u.getCedula(), u.getNombre(), u.getApellido(), true, u.getRespuesta()[0], u.getRespuesta()[1], u.getRespuesta()[2]);
            System.gc();
            if (admin != null) {
                
                this.admin.setFinca(daoManager.getFincaDAO().obtener(1));
                if(this.admin.getFinca()==null){
                    this.admin.setFinca(new Finca());
                }
                
                
                if (this.admin.getFinca() != null) {
                    this.admin.getFinca().setAuxiliares(users);
                    this.trabajadores = (ArrayList<Trabajador>) daoManager.getTrabajadorDAO().obtenerTodos();
                    
                    //TRABAJADORES Y JORNADAS
                    for (Trabajador t : trabajadores) {
                        t.setJornada(daoManager.getJornadaDAO().obtener(t.getCedula()));
                    }
                    
                    this.lotes = (ArrayList<Lote>) daoManager.getLoteDAO().obtenerTodos();
                    
                    //Asignando de BD los lotes y los trabajadores
                    this.admin.getFinca().setTrabajadores(trabajadores);
                    this.admin.getFinca().setLotes(lotes);
                    for (Lote l : this.admin.getFinca().getLotes()) {
                        l.setArbolesVivos((ArrayList<Arbol>) daoManager.getArbolDAO().obtenerTodos(l));
                    }
                }
            }
        }
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

}
