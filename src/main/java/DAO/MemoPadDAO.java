package DAO;

import com.easycoffee.Memo;
import java.util.List;

/**
 *
 * @author Camilo Vargas
 */
public class MemoPadDAO implements DAO<Memo, Integer> {

    final String INSERT = "INSERT INTO EASYCOFFEBD.MEMOPAD VALUES (?, ?, ?)"; //(MEMO_FECHAMEMOPAD, PER_CEDULACIUDADANIA, MEMO_TEXTOMEMOPAD)
    final String UPDATE = "UPDATE EASYCOFFEBD.MEMOPAD SET MEMO_TEXTOMEMOPAD = ? WHERE MEMO_FECHAMEMOPAD = ? AND PER_CEDULACIUDADANIA = ?";
    final String DELETE = "DELETE FROM EASYCOFFEBD.MEMOPAD WHERE MEMO_FECHAMEMOPAD = ? AND PER_CEDULACIUDADANIA = ?";
    final String GETALL = "SELECT * FROM EASYCOFFEBD.MEMOPAD WHERE PER_CEDULACIUDADANIA = ?";

    @Override
    public void insertar(Memo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Memo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Memo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Memo> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Memo obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
