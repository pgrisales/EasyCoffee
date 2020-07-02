package Control;

import DAO.DAOManager;
import com.easycoffee.Insumo;
import com.easycoffee.VentaCafe;
import java.util.ArrayList;

/**
 *
 * @author Camilo Vargas
 */
public class Administrativo {

    DAO.DAOManager daoManager;

    public Administrativo() {
        this.daoManager = new DAOManager();
    }

    public void registrarCambiosInsumo(Insumo i) {
        daoManager.getInsumoDAO().modificar(i);
    }

    public void addInsumo(Insumo i) {
        daoManager.getInsumoDAO().insertar(i);
    }

    public ArrayList<Insumo> insumosxLote(int idLote) {
        return (ArrayList<Insumo>) daoManager.getInsumoDAO().obtenerTodosSegunLote(idLote);
    }

    public void registrarVenta(VentaCafe v) {

    }
}
