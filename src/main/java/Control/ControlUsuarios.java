package Control;

import DAO.DAOManager;
import com.easycoffee.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author Camilo Vargas
 */
public class ControlUsuarios {

    private Usuario u = null;
    private DAOManager DAO;

    public ControlUsuarios() {
        this.DAO = new DAOManager();
    }

    public void registrarAdministrador(Administrador admin) throws SQLException {
        Persona p = new Persona(admin.getCedula(), admin.getNombre(), admin.getApellido(), true);
        DAO.getPersonaDAO().insertar(p);
        Usuario u = new Usuario(admin.getPassword(), admin.getCedula(), admin.getNombre(), admin.getApellido(), true, admin.getRespuesta()[0], admin.getRespuesta()[0], admin.getRespuesta()[0], true);
        DAO.getUsuarioDAO().insertar(u);
        DAO.getRespuestasDAO().insertar(u);
        DAO.cerrarConexion();
    }

    public void registrarAuxiliar(Usuario user) throws SQLException {
        Persona p = new Persona(user.getCedula(), user.getNombre(), user.getApellido(), true);
        DAO.getPersonaDAO().insertar(p);
        Usuario u = new Usuario(user.getPassword(), user.getCedula(), user.getNombre(), user.getApellido(), true, user.getRespuesta()[0], user.getRespuesta()[0], user.getRespuesta()[0], false);
        DAO.getUsuarioDAO().insertar(u);
        DAO.getRespuestasDAO().insertar(u);
        DAO.cerrarConexion();
    }

    public void registrarFotoUsuario(int id, String ruta) throws FileNotFoundException {
        DAO.getUsuarioDAO().insertarFoto(new Long(id), ruta);
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

    public boolean verificarEstado(Long cedula) {
        if (DAO.getUsuarioDAO().obtener(cedula) != null) {
            if (DAO.getUsuarioDAO().obtener(cedula).isEstado()) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public void setEstadoPersona(Long cedula, boolean est) {
        DAO.getUsuarioDAO().updateEstado(DAO.getUsuarioDAO().obtener(cedula), est);
    }

    public boolean verificarLogin(Long cedula, String contraseña) {
        return verificarExistenciaCedula(cedula) && compararPassword(cedula, contraseña);
    }

    public boolean inicializarCedula(Long cedula) {
        try {
            if (DAO.getUsuarioDAO().obtener(cedula) != null) {
                this.u = DAO.getUsuarioDAO().obtener(cedula);
                this.u.setRespuesta(DAO.getRespuestasDAO().obtener(cedula.intValue()));
                //            System.out.println("comparar ced " + this.u);
            }

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

    public void eliminarTrabajador(Long idTrabajador) {
        this.DAO.getJornadaDAO().eliminar(idTrabajador);
        this.DAO.getTrabajadorDAO().eliminar(idTrabajador);
        this.DAO.getPersonaDAO().eliminar(idTrabajador);
    }

    public void eliminarUsuarioAuxiliar(Long idUsuarioAuxiliar) {
        this.DAO.getPermisosDAO().eliminar(idUsuarioAuxiliar);
        this.DAO.getUsuarioDAO().eliminar(idUsuarioAuxiliar);
        this.DAO.getPersonaDAO().eliminar(idUsuarioAuxiliar);
    }

    public void almacenarFinca(Finca f) {
        this.DAO.getFincaDAO().insertar(f);
    }

    public Usuario obtenerUser(int cedula) {
        return DAO.getUsuarioDAO().obtener(new Long(cedula));
    }
}
