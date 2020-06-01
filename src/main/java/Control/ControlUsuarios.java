package Control;

import DAO.DAOManager;
import com.easycoffee.*;
import java.sql.SQLException;

/**
 *
 * @author Camilo Vargas
 */
public class ControlUsuarios {

    private Usuario u = null;
    private DAOManager DAO;

    public ControlUsuarios() {
        this.DAO = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
    }

    public void registrarAdministrador(Administrador admin) throws SQLException {
        Persona p = new Persona(admin.getCedula(), admin.getNombre(), admin.getApellido(), true);
        DAO.getPersonaDAO().insertar(p);
        Usuario u = new Usuario(admin.getPassword(), admin.getCedula(), admin.getNombre(), admin.getApellido(), true, admin.getRespuesta()[0], admin.getRespuesta()[0], admin.getRespuesta()[0]);
        DAO.getUsuarioDAO().insertar(u);
        DAO.getRespuestasDAO().insertar(u);
        DAO.cerrarConexion();
    }
    
    public void registrarAuxiliar(Usuario user) throws SQLException {
        Persona p = new Persona(user.getCedula(), user.getNombre(), user.getApellido(), true);
        DAO.getPersonaDAO().insertar(p);
        Usuario u = new Usuario(user.getPassword(), user.getCedula(), user.getNombre(), user.getApellido(), true, user.getRespuesta()[0], user.getRespuesta()[0], user.getRespuesta()[0]);
        DAO.getUsuarioDAO().insertar(u);
        DAO.getRespuestasDAO().insertar(u);
        DAO.cerrarConexion();
    }
    
    public void registrarTrabajador(Trabajador trabajador) throws SQLException {
        Persona p = new Persona(trabajador.getCedula(), trabajador.getNombre(), trabajador.getApellido(), true);
        DAO.getPersonaDAO().insertar(p);
        DAO.getTrabajadorDAO().insertar(trabajador);
        DAO.cerrarConexion();
    }

    public boolean verificarExistenciaCedula(Long cedula) {
        return DAO.getUsuarioDAO().obtener(cedula) != null;
    }

    private boolean compararPassword(Long cedula, String contraseña) {
        return contraseña.equals(DAO.getUsuarioDAO().obtener(cedula).getPassword());
    }

    public boolean verificarLogin(Long cedula, String contraseña) {
        return verificarExistenciaCedula(cedula) && compararPassword(cedula, contraseña);
    }

    public boolean inicializarCedula(Long cedula) {
        try {
            this.u = DAO.getUsuarioDAO().obtener(cedula);
            this.u.setRespuesta(DAO.getRespuestasDAO().obtener(cedula.intValue()));
//            System.out.println("comparar ced " + this.u);
            return true;
        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }

    }

    public boolean compararRespuestas(String r, int index) {
        if (this.u != null) {
            String[] s = this.u.getRespuesta();
            return s[index].equals(r);
        }
        return false;
    }

    public void changePassword(String p) throws SQLException {
        this.u.setPassword(p);
        DAO.getUsuarioDAO().modificar(this.u);
        DAO.cerrarConexion();
    }

    public void setU(int cedula) {
        this.u = DAO.getUsuarioDAO().obtener(new Long(cedula));
    }

    public Usuario getU() {
        return u;
    }

}
