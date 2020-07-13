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
import java.util.Scanner;
import javafx.stage.FileChooser;

/**
 *
 * @author GAR
 */
public class Geo {

    private static String mapUrl = "https://zoom.earth/#view=";
    private static String uLat;
    private static String uLon;
    private static String coordenadas = FramePrincipal.getSistem().getAdmin().getFinca().getCoordenadas();

    public static void getGeo() throws IOException, URISyntaxException {

        if (coordenadas == null) {

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                File saveCoor = null;
                saveCoor = saveCoor.createTempFile("FileSaver", ".js");
                BufferedWriter writer = new BufferedWriter(new FileWriter(saveCoor, true));
                writer.write(FramePrincipal.getSistem().getWebFiles("FileSaver.js"));

                writer.close();

                File getCoorFile = null;
                getCoorFile = getCoorFile.createTempFile("getCoor", ".html");
                getCoorFile.deleteOnExit();
                System.out.println(getCoorFile.exists());
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(getCoorFile, true));
                String s = FramePrincipal.getSistem().getWebFiles("getCoor.html");
                s = s.replaceAll("<script src=\"FileSaver.js\"></script>", "<script src=\"" + saveCoor.getName() + "\"></script>");

                writer1.write(s);
                writer1.close();
                System.out.println(s);
                System.out.println(getCoorFile.toURI());
                Desktop.getDesktop().browse(getCoorFile.toURI());

            }
        }

    }

    public static void getCoorFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("TXT", "*.txt")
        );
        File temp = fileChooser.showOpenDialog(null);
        System.out.println("hpta " + Geo.class.getClassLoader().getResource(""));
        String coordenadas = "";
        Scanner myReader = new Scanner(temp);
      while (myReader.hasNextLine()) {
        coordenadas = myReader.nextLine();
      }
      myReader.close();
        System.out.println("HPTA PUTA :"+coordenadas);
        
        FramePrincipal.getSistem().getAdmin().getFinca().setCoordenadas(coordenadas);
        FramePrincipal.getSistem().setCoordenadas(coordenadas);
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


}
