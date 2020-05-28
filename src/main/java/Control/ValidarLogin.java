package Control;

import DAO.DAOManager;
import com.easycoffee.Usuario;
import java.sql.SQLException;

public class ValidarLogin {

    DAO.DAOManager daoManager;

    public ValidarLogin() {
        this.daoManager = new DAOManager("localhost:1527", "root", "admin", "easycoffedb");
    }

    public boolean verificarLogin(Long cedula, String contraseña) {
        return compararUsername(cedula) && compararPassword(cedula, contraseña);
    }

    public boolean compararUsername(Long cedula) {
        return daoManager.getUsuarioDAO().obtener(cedula) != null;
    }

    private boolean compararPassword(Long cedula, String contraseña) {
        return contraseña.equals(daoManager.getUsuarioDAO().obtener(cedula).getPassword());
    }

    //Ejemplo Verificación Usuarios
    public static void main(String[] args) {
        Usuario test = new Usuario("134", (long) 195, "Camilo", "Vargas", true);
        ValidarLogin login = new ValidarLogin();
        boolean logear = login.verificarLogin(test.getCedula(),test.getPassword());
        if (logear) {
            System.out.println("Bienvenido " + test.getNombre());
        } else {
            System.out.println("Upsss.... Algo Ha salido mal :/");
        }
    }
}
