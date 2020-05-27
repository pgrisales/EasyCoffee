package Control;

import DAO.DAOManager;
import com.easycoffee.Usuario;
import java.sql.SQLException;

public class ValidarLogin {

    DAO.DAOManager daoManager;

    public ValidarLogin() {
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
    }

    public boolean verificarLogin(Usuario user) {
        return compararUsername(user) && compararPassword(user);
    }

    private boolean compararUsername(Usuario user) {
        System.out.println(daoManager.getUsuarioDAO().obtener(user.getCedula()).getCedula());
        return user.getUsername().equals(daoManager.getUsuarioDAO().obtener(user.getCedula()).getUsername());
    }

    private boolean compararPassword(Usuario user) {
        return user.getPassword().equals(daoManager.getUsuarioDAO().obtener(user.getCedula()).getPassword());
    }

//    public static void main(String[] args) {
//        Usuario test = new Usuario("admin3", "134", (long) 195, "Camilo", "Vargas", true);
//        ValidarLogin login = new ValidarLogin();
//        boolean logear = login.verificarLogin(test);
//        if (logear) {
//            System.out.println("Bienvenido " + test.getNombre());
//        } else {
//            System.out.println("Upsss.... Algo Ha salido mal :/");
//        }
//    }
}
