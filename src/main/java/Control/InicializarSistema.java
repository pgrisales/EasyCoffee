package Control;

import DAO.DAOManager;
import WebS.PrecioCafe;
import com.easycoffee.Administrador;
import com.easycoffee.Arbol;
import com.easycoffee.Finca;
import com.easycoffee.Jornada;
import com.easycoffee.Lote;
import com.easycoffee.Memo;
import com.easycoffee.Plaga;
import com.easycoffee.Trabajador;
import com.easycoffee.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class InicializarSistema {

    private Administrador admin = null;
    private DAO.DAOManager daoManager;
    private ArrayList<Usuario> users = null;
    private ArrayList<Trabajador> trabajadores = null;
    private ArrayList<Lote> lotes = null;
    private ArrayList<Plaga> plagas = null;
    private ArrayList<Memo> memosUser = null;

    public InicializarSistema() {

        Thread pcafe = new Thread() {
            public void run() {
                try {
                    PrecioCafe precioCafe = WebS.PrecioCafe.getInstance();
                } catch (IOException ex) {
                    Logger.getLogger(InicializarSistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        pcafe.start();

        this.daoManager = new DAOManager();
        this.users = (ArrayList<Usuario>) daoManager.getUsuarioDAO().obtenerTodos();
        int a = 0;
        int i = 0;
        for (Usuario u : users) {
            u.setRespuesta(daoManager.getRespuestasDAO().obtener(u.getCedula().intValue()));
            if (daoManager.getPermisosDAO().obtenerTodos(u).size() > 0) {
                u.setIdLotes(daoManager.getPermisosDAO().obtenerTodos(u));
            } else {
                u.setIdLotes(new ArrayList<>());
            }
            if (u.isRol()) {
                i = a;
            }
            a++;
        }
        if (!users.isEmpty()) {
            Usuario u = users.remove(i);
            this.admin = new Administrador(u.getPassword(), u.getCedula(), u.getNombre(), u.getApellido(), true, u.getRespuesta()[0], u.getRespuesta()[1], u.getRespuesta()[2], u.isRol());
            System.gc();
            if (admin != null) {
                this.admin.setFinca(daoManager.getFincaDAO().obtener(1));
                if (this.admin.getFinca() == null) {
                    this.admin.setFinca(new Finca());
                }
                if (this.admin.getFinca() != null) {
                    this.admin.getFinca().setAuxiliares(users);
                    try {
                        this.plagas = (ArrayList<Plaga>) daoManager.getPlagasDAO().obtenerTodos();
                    } catch (IOException ex) {
                        Logger.getLogger(InicializarSistema.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (this.plagas.size() != 0) {
                        this.admin.getFinca().setPlagas(plagas);
                    }
                    this.trabajadores = (ArrayList<Trabajador>) daoManager.getTrabajadorDAO().obtenerTodos();

                    //TRABAJADORES Y JORNADAS
                    for (Trabajador t : trabajadores) {
                        t.setJornada((ArrayList<Jornada>) daoManager.getJornadaDAO().obtenerTodos(t.getCedula()));
                    }
                    this.lotes = (ArrayList<Lote>) daoManager.getLoteDAO().obtenerTodos();

                    //Asignando de BD los lotes y los trabajadores
                    this.admin.getFinca().setTrabajadores(trabajadores);
                    this.admin.getFinca().setLotes(lotes);
                    for (Lote l : this.admin.getFinca().getLotes()) {
                        l.setArbolesVivos((ArrayList<Arbol>) daoManager.getArbolDAO().obtenerTodos(l));
                        if (daoManager.getArbolDAO().obtenerTodos(l).size() > 0) {
                        }
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

    public Usuario getUser(long cedula) {
        if (admin.getCedula() == cedula) {
            return admin;
        }
        for (int i = 0; i < this.users.size(); i++) {
            if (cedula == this.users.get(i).getCedula()) {
                return this.users.get(i);
            }
        }
        return null;
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
