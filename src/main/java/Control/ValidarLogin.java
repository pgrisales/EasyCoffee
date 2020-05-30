package Control;

import DAO.DAOManager;

public class ValidarLogin {
    
    DAO.DAOManager daoManager;
    
    public ValidarLogin() {
        this.daoManager = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
    }
    
    public boolean verificarLogin(Long cedula, String contraseña) {
        return compararUsername(cedula) && compararPassword(cedula, contraseña);
    }
    
    public boolean compararUsername(Long cedula) {
        System.out.println(daoManager.getUsuarioDAO().obtener(cedula).toString());
        return daoManager.getUsuarioDAO().obtener(cedula) != null;
    }
    
    private boolean compararPassword(Long cedula, String contraseña) {
        return contraseña.equals(daoManager.getUsuarioDAO().obtener(cedula).getPassword());
    }
    
}
