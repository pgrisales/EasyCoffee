package Control;

import DAO.DAOManager;
import Frontera.FramePrincipal;
import com.easycoffee.Arbol;
import com.easycoffee.Jornada;
import com.easycoffee.Lote;
import com.easycoffee.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class Produccion {

    DAO.DAOManager daoManager;

    public Produccion() {
        this.daoManager = new DAOManager();
    }

    public boolean RegistrarProduccionBD(float arrobas, int idLote, int cedula) {
        Jornada jornada = null;
        for (Trabajador t : FramePrincipal.getSistem().getTrabajadores()) {
            if (t.getCedula() == cedula) {
                jornada = new Jornada(arrobas, daoManager.getLoteDAO().obtener(new Long(idLote)), t);
                t.setJornada(jornada);
                break;
            }
        }
        daoManager.getJornadaDAO().insertar(jornada);
        return true;
    }

    public boolean RegistrarLoteBD(Lote lote) {
        daoManager.getLoteDAO().insertar(lote);
        return true;
    }

    /*Inicio Metodos Registrar Arboles*/
    public void RegistrarArbolesVivos(Lote lote) {
        for (Arbol a : lote.getArbolesVivos()) {
            daoManager.getArbolDAO().insertar(a);
        }
    }

    public void RegistrarArbolesVivos(ArrayList<Arbol> arboles) {
        for (Arbol a : arboles) {
            daoManager.getArbolDAO().insertar(a);
        }
    }
    /*Fin Metodos Registrar Arboles*/
    
}
