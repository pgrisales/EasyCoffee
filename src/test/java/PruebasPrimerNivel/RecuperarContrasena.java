package PruebasPrimerNivel;

import Control.ControlUsuarios;
import DAO.DAOManager;
import com.easycoffee.Persona;
import com.easycoffee.Usuario;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilo Vargas
 */
public class RecuperarContrasena {

    private static DAO.DAOManager dao = new DAOManager();
    private static int number = 200;
    private static Control.ControlUsuarios c;

    public RecuperarContrasena() {
    }

    @BeforeClass
    public static void setUpClass() {
        for (int i = 0; i < number; i++) {
            Persona p = new Persona((long) (1000 + i), "Test" + i, "Test" + i, true);
            dao.getPersonaDAO().insertar(p);
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true, false);
            String[] res = {"respuesta1", "respuesta2", "respuesta3"};
            u.setRespuesta(res);
            dao.getUsuarioDAO().insertar(u);
            dao.getRespuestasDAO().insertar(u);
        }
    }

    @AfterClass
    public static void tearDownClass() throws SQLException {
        for (int i = 0; i < number; i++) {
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true, false);
            dao.getRespuestasDAO().eliminar(u);
            dao.getUsuarioDAO().eliminar(u);
            Persona p = new Persona((long) (1000 + i), "Test" + i, "Test" + i, true);
            dao.getPersonaDAO().eliminar(p);
        }
        dao.cerrarConexion();
    }

    @Before
    public void setUp() {
        c = new ControlUsuarios();
    }

    @After
    public void tearDown() {
        System.gc();
    }

    @Test
    public void RecuperarContraseña() throws SQLException {
        for (int i = 0; i < number; i++) {
            c = new ControlUsuarios();
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true, false);
            String[] res = {"respuesta1", "respuesta2", "respuesta3"};
            c.inicializarCedula(u.getCedula());
            boolean q = c.compararRespuestas(res[0], 0);
            boolean w = c.compararRespuestas(res[1], 1);
            boolean e = c.compararRespuestas(res[2], 2);
            if (q && w && e) {
                c.changePassword("newPassword");
            }
        }
        assertEquals("newPassword", dao.getUsuarioDAO().obtener((long) 1000).getPassword());
    }
}
