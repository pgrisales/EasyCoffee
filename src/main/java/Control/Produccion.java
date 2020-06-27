package Control;

import DAO.DAOManager;
import Frontera.FramePrincipal;
import com.easycoffee.Arbol;
import com.easycoffee.Jornada;
import com.easycoffee.Lote;
import com.easycoffee.Memo;
import com.easycoffee.Plaga;
import com.easycoffee.Trabajador;
import java.io.FileNotFoundException;
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
    public boolean RegistrarPlagaBD(Plaga plaga, String Ruta) throws FileNotFoundException {
        daoManager.getPlagasDAO().insertar(plaga, Ruta);
        return true;
    }
    public boolean registrarMemoPad(Memo m) {
        daoManager.getMemosDAO().insertar(m);
        return true;
    }

    /**
     * Nos sirve para Obtener todos los memos del Usuario que actualmente 
     * se encuentra en el sistema.
     * @param idUsuario Id del Usuario que esta trabajando en el sistema
     * @return ArrayList< Memo > contiene los Memos del usuario en cuestion
     */
    public ArrayList<Memo> obtenerMemos(int idUsuario) {
        ArrayList<Memo> memosxUsuario = (ArrayList<Memo>) daoManager.getMemosDAO().obtener(idUsuario);
        return memosxUsuario;
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
