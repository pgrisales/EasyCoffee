package WebS;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author GAR
 */
public class Geo {

    private static String mapUrl = "https://zoom.earth/#view=";
    private static String uLat;
    private static String uLon;
    private static String coordenadas;
    private static File pathInDownloads = new File("../../../Downloads/wmfoijepbrevinsidfjaoeffff.txt");//


    public static void getGeo() throws URISyntaxException, IOException {
        //File f = new File(getClass().getResource("").getFile());
        //System.out.println("DEFAULT PATH GEO "+Geo.class.getResource("").getFile().toString());
        //System.out.println("PATH EN GEO "+Geo.class.getResource("").getFile().toString());
        if(!pathInDownloads.exists()){
            //File file = new File("src/main/resources/web/getCoor.html");
            File file = new File(Geo.class.getResource("../web/getCoor.html").getFile());//
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(file.toURI());
            }
        }
        
    }

    public static String getCoor() throws IOException, InterruptedException, URISyntaxException {
        //System.out.println("DEFAULT PATH GEO "+Geo.class.getResource("").getFile().toString());
        //System.out.println("PATH EN GEO "+Geo.class.getResource("").getFile().toString());
        //wmfoijepbrevinsidfjaoeffff.txt
        File file = new File("../../../Downloads/wmfoijepbrevinsidfjaoeffff.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

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

    public static File getPathInDownloads() {
        return pathInDownloads;
    }

}