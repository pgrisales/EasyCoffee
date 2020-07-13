package WebS;

import Frontera.FramePrincipal;
import Frontera.MenuSeleccion;
import Frontera.Produccion.EditFinca;
import Frontera.Produccion.RegistrarLote;
import com.easycoffee.Lote;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.JFrame;

/**
 *
 * @author GAR
 */
public class Mapa1 {

    private static final int JFXPANEL_WIDTH_INT = 900;
    private static final int JFXPANEL_HEIGHT_INT = 580;
    public static JFXPanel fxContainer;
    private static JFrame frame = new JFrame("Map");
    static Stage window;

    public static void main(String[] args) {

    }

    public static void stopT() {
        Platform.exit();
    }

    public static void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));

        // create JavaFX scene
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                try {
                    cambiarSc(createScene());
                } catch (IOException ex) {
                    Logger.getLogger(Mapa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        System.out.println("SE INICIO EL PANEL");
        
    }

    public static JFXPanel fx() {
        init();

        return fxContainer;
    }

    public static void cambiarSc(Scene scene) {
        fxContainer.setScene(scene);
    }

    public static Scene createScene() throws IOException {

        AnchorPane root = new AnchorPane();
        Button crearVistaB = new Button("Descargar Coordenadas");
        Button volverB = new Button("Volver");
        volverB.relocate(326, 256);
        crearVistaB.relocate(467, 256);
        volverB.setPrefSize(110, 25);
        crearVistaB.setPrefSize(110, 25);

       // crearVistaB.setStyle("-fx-font-size: 2em;");
        //volverB.setStyle("-fx-font-size: 2em;");//-fx-font-size:8;-fx-font: 16 Sitka Banner;
        
        crearVistaB.setStyle("-fx-border-color: rgb(255, 255, 255); -fx-border-width: 2px; -fx-font-weight: bold; -fx-background-color: rgb(102, 0, 0); -fx-text-fill: rgb(255, 255, 255)");
        volverB.setStyle("-fx-border-color: rgb(255, 255, 255); -fx-border-width: 2px; -fx-font-weight: bold; -fx-background-color: rgb(102, 0, 0); -fx-text-fill: rgb(255, 255, 255)");
        
        BackgroundImage img = new BackgroundImage(new Image("/image/Pedrosky.png", true), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background = new Background(img);
        root.setBackground(background);
        
       
        
        crearVistaB.setOnAction(new EventHandler<ActionEvent>() {
            Button crearVistaB = new Button("Crear vista");
            @Override
            public void handle(ActionEvent event) {
                try {
                    
                    System.out.println("LOAD y estatic "+Mapa1.class.getClassLoader().getResource(""));
                    System.out.println("SIN LOAD "+getClass().getResource(""));

                    //FXMLLoader loader = new FXMLLoader(Mapa1.class.getClassLoader().getResource("fxml/Map.fxml"));
                   // Parent view = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Map.fxml"));
                    //Parent view =loader.load();
                    
                    //Scene viewSc = new Scene(view);**/
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/Map.fxml"));
                    Parent view =loader.load();
                    Scene viewSc = new Scene(view);
                    
                    cambiarSc(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(Mapa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        volverB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                FramePrincipal.cambiarPanel127(new EditFinca(MenuSeleccion.getCedula()));
                FramePrincipal.cambiarPanel376(new RegistrarLote(new ArrayList<Lote>()));
                FramePrincipal.mapPanel().setVisible(false);

            }
        });

        root.setVisible(true);
        root.getChildren().add(volverB);
        root.getChildren().add(crearVistaB);
        return new Scene(root);
    }

}
