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
import java.net.URL;
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
import javax.swing.ImageIcon;

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
        //add(fxContainer, BorderLayout.CENTER);

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
        Button crearVistaB = new Button("Crear vista");
        Button volverB = new Button("Volver");
        volverB.relocate(326, 256);
        crearVistaB.relocate(467, 256);
        volverB.setPrefSize(90, 25);
        crearVistaB.setPrefSize(90, 25);

        //crearVistaB.setStyle("-fx-background-color: rgba(102, 0, 0, 100");
        crearVistaB.setTextFill(Color.WHITE);
        //Image fondo;
        //System.out.println(Mapa1.class.getResource("Pedrosky.png").getFile().toString());
        BackgroundImage img = new BackgroundImage(new Image("/image/Pedrosky.png", true), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background = new Background(img);
        root.setBackground(background);
        
        
        
        crearVistaB.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                try {
                    //System.out.println(getClass().getResource(""));
                    //Parent view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml"));//Map
                    
                    //URL u = new URL(getClass().getResource("../fxml/Map.fxml").toString());
                    
                    //Parent view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml"));//Map
                    
                    //Parent view = FXMLLoader.load(u);//Map
                    
                    //System.out.println(url);
                    //Parent view = FXMLLoader.load(url);
                    
                    //URL url = new URL("../fxml/Map.fxml");
                    //System.out.println(url);
                    System.out.println("SIN LOAD "+getClass().getResource(""));
                    System.out.println("CON LOAD "+getClass().getClassLoader().getResource(""));
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/Map.fxml"));
                    //loader.setController(new MapController());
                    Parent view =loader.load();
                    
                    //Scene viewSc = new Scene(view);**/
                    Scene viewSc = new Scene(view);
                    
                    cambiarSc(viewSc);
                    //fxContainer.setScene(viewSc);
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
                //FramePrincipal.mapPanel().removeAll();
                FramePrincipal.mapPanel().setVisible(false);

            }
        });

        /*Parent view = FXMLLoader.load(Mapa1.class.getResource("../fxml/MenuMap.fxml"));//Map
        Scene viewSc = new Scene(view);*/
        root.setVisible(true);
        root.getChildren().add(volverB);
        root.getChildren().add(crearVistaB);
        return new Scene(root);
    }

}
