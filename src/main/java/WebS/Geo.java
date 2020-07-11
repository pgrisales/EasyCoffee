package WebS;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;

/**
 *
 * @author GAR
 */
public class Geo {

    private static String mapUrl = "https://zoom.earth/#view=";
    private static String uLat;
    private static String uLon;
    private static String coordenadas;
    private static File coordenadasFile = new File(Geo.class.getClassLoader().getResource("").getPath().toString()+"web/coordenadasFincaEasyCoffee.txt");//"../web/coordenadasFincaEasyCoffee.txt"

    public static void getGeo() throws URISyntaxException, IOException {
        System.out.println("hpta puta");
        System.out.println("getgeo: coord " + Geo.class.getClassLoader().getResource("") + "web/coordenadasFincaEasyCoffee.txt");
        System.out.println("getgeo: asdf " + Geo.class.getClassLoader().getResource("") + "web/getCoor.html");
        System.out.println("getgeo: ASDFASDF " + new File(Geo.class.getClassLoader().getResource("web/getCoor.html").getPath()).toURI());
        if (!coordenadasFile.exists()) {
            //File file = new File(Geo.class.getClassLoader().getResource("").getFile()+"/web/getCoor.html");//
            //File file = new File(Geo.class.getClassLoader().getResource("")+"web/getCoor.html");

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                //URI u = new URI(Geo.class.getClassLoader().getResource("we    b/getCoor.html").toString());
                File temp = new File(Geo.class.getClassLoader().getResource("web/getCoor.html").toString());
                temp.createTempFile("getCoor", ".html");
                //File temp1 = File.createTempFile(null, ".html", temp);
                //temp1.deleteOnExit();
                Desktop.getDesktop().browse(temp.toURI());
                //Desktop.getDesktop().browse(u);
                //Desktop.getDesktop().browse(new File(Geo.class.getClassLoader().getResource("web/getCoor.html").getPath().toString()).toURI());
            }//getClass().getClassLoader().getResource("coordenadasFincaEasyCoffee.txt")
        }

    }

    public static void getCoorFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("TXT", "*.txt")
        );
        //coordenadasFile = fileChooser.showOpenDialog(null);
        File temp = fileChooser.showOpenDialog(null);
        //temp.renameTo(new File(Geo.class.getResource("scoordenadasFincaEasyCoffee.txt").toString()));
        //temp.renameTo(new File("coordenadasFincaEasyCoffee.txt"));
        //Geo.class.getClassLoader().getResource("coordenadasFincaEasyCoffee.txt").toString()
        System.out.println("hpta " + Geo.class.getClassLoader().getResource(""));
        System.out.println(Geo.class.getClassLoader().getResource("") + "coordenadasFincaEasyCoffee.txt");
        temp.renameTo(new File(Geo.class.getClassLoader().getResource("").getPath().toString()+"web/coordenadasFincaEasyCoffee.txt"));
        System.out.println(coordenadasFile.exists());
    }

    public static String getCoor() throws IOException, InterruptedException, URISyntaxException {
        BufferedReader br = new BufferedReader(new FileReader(coordenadasFile));

        String it = "";
        while ((it = br.readLine()) != null) {
            String[] coor = it.split(",");
            uLat = coor[0];
            uLon = coor[1];
            coordenadas = uLat + "," + uLon;
        }

        System.out.println("lat: " + uLat);
        System.out.println("lon: " + uLon);
        return coordenadas;
    }

    public static String getMapUrl() {
        return mapUrl;
    }

    public static String getuLat() {
        return uLat;
    }

    public static String getuLon() {
        return uLon;
    }

    public static String getCoordenadas() {
        return coordenadas;
    }

    public static File getCoordenadasFile() {
        return coordenadasFile;
    }

}
