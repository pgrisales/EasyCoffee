package WebS;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author GAR
 */
public class PrecioCafe {

    private static PrecioCafe single = null;
    private static Document doc;
    private static String precioInternoRef;             //Precio de una Carga (1 Carga= 125Kg)      //Café Pergamino Seco
    private static String precioPasillaFinca;           //Precio Arroba Pasilla (Pasilla Cafe no tan puro - Sello Rojo) 
    private static String bolsaNY;                      //Precio Centavos de Dolar por cada Libra de Cafe Básico
    private static String tasaCambio;                   //Precio Dolar en Pesos colombianos a la Fecha
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static int count = 1;

    private PrecioCafe() throws IOException {
        update();
    }

    public static PrecioCafe getInstance() throws IOException {
        if (single == null) {
            single = new PrecioCafe();
        }
        return single;
    }

    public void updateInfo() {
        try {
            doc = Jsoup.connect("https://federaciondecafeteros.org/").get();
            String title = doc.title();
            System.out.println(title);
            System.out.println("ACTUALIZACION PRECIO DEL CAFE #" + count);
            count++;

            precioInternoRef = doc.select("ul.lista > li[tabindex=1] > strong").first().text();
            precioPasillaFinca = doc.select("ul.lista > li[tabindex=4] > strong").first().text();
            bolsaNY = doc.select("ul.lista > li[tabindex=2] > strong").first().text();
            tasaCambio = doc.select("ul.lista > li[tabindex=3] > strong").first().text();
        } catch (Exception e) {
            System.out.println("Error en conexion!");
            e.printStackTrace();
        }
    }

    public void update() {
        Runnable task = new Runnable() {
            public void run() {
                updateInfo();
                /*System.out.println(doc.select("ul.lista > li[tabindex=1] > span").first().text() + precioInternoRef);
                System.out.println(doc.select("ul.lista > li[tabindex=4] > span").first().text() + precioPasillaFinca);
                System.out.println(doc.select("ul.lista > li[tabindex=2] > span").first().text() + bolsaNY);
                System.out.println(doc.select("ul.lista > li[tabindex=3] > span").first().text() + tasaCambio);*/
            }
        };
        int initialDelay = 0;
        int periodicDelay = 2;
        scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay, TimeUnit.HOURS);
    }

    public Document getDoc() {
        return doc;
    }

    public String getPrecioInternoRef() {
        return precioInternoRef;
    }

    public String getPrecioPasillaFinca() {
        return precioPasillaFinca;
    }

    public String getBolsaNY() {
        return bolsaNY;
    }

    public String getTasaCambio() {
        return tasaCambio;
    }

    public boolean isCharged() {
        return (!bolsaNY.isEmpty() && !precioInternoRef.isEmpty() && !precioPasillaFinca.isEmpty() && !tasaCambio.isEmpty());
    }
}
