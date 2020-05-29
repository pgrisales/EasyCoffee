package Control;

import DAO.DAOManager;
import com.easycoffee.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Nivektakedown
 */
public class RecuperarContraseña {

    Usuario u = null;
    DAO.DAOManager daoManager;

    public RecuperarContraseña() {
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffebd");
    }

    public boolean compararCedula(Long cedula) {
        try {
            this.u = daoManager.getUsuarioDAO().obtener(cedula);
            System.out.println("comparar ced " + u);
            return true;
        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }

    }

    public boolean compararRespuestas(String r, int index) {
        String[] s = this.u.getRespuesta();
        System.out.println("comparar res " + s[index].equals(r));
        return s[index].equals(r);
    }

    public void changePassword(String p) throws SQLException {
        this.u.setPassword(p);
        daoManager.getUsuarioDAO().modificar(this.u);
        daoManager.cerrarConexion();
    }
}
