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
public class IngresarAplicacion {

    private static DAO.DAOManager dao = new DAOManager("localhost:1527", "root", "1234", "easycoffebd");
    private static int number = 200;
    Control.ControlUsuarios c;

    public IngresarAplicacion() {

    }

    @BeforeClass
    public static void setUpClass() {
        for (int i = 0; i < number; i++) {
            Persona p = new Persona((long) (1000 + i), "Test" + i, "Test" + i, true);
            dao.getPersonaDAO().insertar(p);
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true);
            dao.getUsuarioDAO().insertar(u);
        }
    }

    @AfterClass
    public static void tearDownClass() throws SQLException {
        for (int i = 0; i < number; i++) {
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true);
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
    public void existenciaUsuario() {
        boolean verificados;
        for (int i = 0; i < number; i++) {
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true);
            boolean existe = c.verificarExistenciaCedula(u.getCedula());
            if (!existe) {
                assertTrue(false);
            }
        }
        verificados = true;
        assertTrue(verificados);
    }

    @Test
    public void ingresarAlSistema() {
        boolean autenticados;
        for (int i = 0; i < number; i++) {
            Usuario u = new Usuario("password", (long) (1000 + i), "Test" + i, "Test" + i, true);
            boolean acceso = c.verificarLogin(u.getCedula(), u.getPassword());
            if (!acceso) {
                assertTrue(false);
            }
        }
        autenticados = true;
        assertTrue(autenticados);
    }
}
