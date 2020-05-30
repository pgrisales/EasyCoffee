package Control;

import DAO.DAOManager;
import com.easycoffee.Jornada;
import com.easycoffee.Lote;
import com.easycoffee.Trabajador;

/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class Produccion {
    DAO.DAOManager daoManager;

    public Produccion() {
        this.daoManager = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
    }
    public boolean RegistrarProduccionBD(Jornada produccion){
        daoManager.getJornadaDAO().insertar(produccion);
        return true;
    }
    public boolean RegistrarLoteBD(Lote lote){
        daoManager.getLoteDAO().insertar(lote);
        return true;
    }
}
