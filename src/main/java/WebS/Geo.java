package WebS;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        if(!coordenadasFile.exists()){
            //File file = new File("src/main/resources/web/getCoor.html");
            File file = new File(Geo.class.getResource("../web/getCoor.html").getFile());//
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(file.toURI());
            }//getClass().getClassLoader().getResource("coordenadasFincaEasyCoffee.txt")
        }
        
    }
    
    public static void getCoorFile(){
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
        System.out.println("hpta puta"+Geo.class.getClassLoader().getResource("").getPath().toString());
        System.out.println(Geo.class.getClassLoader().getResource("").getPath().toString()+"coordenadasFincaEasyCoffee.txt");
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