/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffebd");
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
