package WebS;

import static WebS.Mapa1.fxContainer;
import static WebS.Mapa1.init;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author GAR
 */
public class Mapa {

    private static final int JFXPANEL_WIDTH_INT = 900;
    private static final int JFXPANEL_HEIGHT_INT = 575;
    public static JFXPanel fxContainer;
    private static JFrame frame = new JFrame("Map");
    static Stage window;

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

    }


    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        //add(fxContainer, BorderLayout.CENTER);

        // create JavaFX scene
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                try {
                    cambiarSc(createScene());
                } catch (IOException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public JFXPanel fx(){
        init();
        return fxContainer;
    }
    
    private void cambiarSc(Scene scene) {
        fxContainer.setScene(scene);
    }

    private Scene createScene() throws IOException {

        /*StackPane root = new StackPane();
        Button btn = new Button();
        btn.setText("Ver Mapa");
        System.out.println(getClass().getResource("../image/318763,xcitefun-cocora-valley-7.jpg").getFile());
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/MenuMap.fxml"));//Map
                    Scene viewSc = new Scene(view);

                    fxContainer.setScene(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });*/

        //oot.getChildren().add(btn);
        Parent view = FXMLLoader.load(getClass().getResource("../fxml/MenuMap.fxml"));//Map
        Scene viewSc = new Scene(view);
        return viewSc;
    }

}
