package WebS;


import Frontera.FramePrincipal;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
    private static File coordenadasFile = new File(Geo.class.getClassLoader().getResource("").getPath().toString() + "web/coordenadasFincaEasyCoffee.txt");//"../web/coordenadasFincaEasyCoffee.txt"

    public static void getGeo() throws IOException, URISyntaxException {
        
        if (!coordenadasFile.exists()) {

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                /*File saveCoor = null;
                saveCoor = saveCoor.createTempFile("FileSaver", ".js");
                //BufferedWriter writer = new BufferedWriter(new FileWriter(saveCoor, true));
                //writer.write(FramePrincipal.getSistem().getWebFiles("FileSaver.js"));
                
                //writer.close();
                
                File getCoorFile = null;
                getCoorFile = getCoorFile.createTempFile("getCoor", ".html");
                getCoorFile.deleteOnExit();
                System.out.println(getCoorFile.exists());
                 //BufferedWriter writer1= new BufferedWriter(new FileWriter(getCoorFile, true));
                //String s = FramePrincipal.getSistem().getWebFiles("getCoor.html");
                //s = s.replaceAll("<script src=\"FileSaver.js\"></script>", "<script src=\""+saveCoor.getName()+"\"></script>");
                
                //writer1.write(s);
                //writer1.close();
               // System.out.println(s);
                System.out.println(getCoorFile.toURI());*/
                
                
                
                
                URI u = new URI(Geo.class.getClassLoader().getResource("web/getCoor.html").getPath().toString());
                Desktop.getDesktop().browse(u);
            }
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
        temp.renameTo(new File(Geo.class.getClassLoader().getResource("").getPath().toString() + "web/coordenadasFincaEasyCoffee.txt"));
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
