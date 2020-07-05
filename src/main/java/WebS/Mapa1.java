package WebS;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
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
    
    public static void stopT(){
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
                cambiarSc(createScene());
            }
        });
        
        System.out.println("SE INICIO EL PANEL");
    }
    public static JFXPanel fx(){
        init();
        
        return fxContainer;
    }
    
    public static void cambiarSc(Scene scene) {
        fxContainer.setScene(scene);
    }

    public static Scene createScene() {

        StackPane root = new StackPane();
        Button btn = new Button();
        btn.setText("Ver Mapa");
        //root.setStyle("-fx-background-color: rgba(0, 0, 0, 0); -fx-background-radius: 1;");

        btn.setStyle("-fx-background-color: rgba(102, 0, 0, 100;");
        btn.setTextFill(Color.WHITE);
        //Image fondo;
        try {
            File file = new File(Mapa1.class.getResource("../image/Pedrosky.png").getFile());
            Image fondo = new Image(new FileInputStream(file));
            BackgroundImage img = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
            Background background = new Background(img);
            root.setBackground(background);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml"));//Map
                    Scene viewSc = new Scene(view);
                    
                    cambiarSc(viewSc);
                    //fxContainer.setScene(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(Mapa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        root.setVisible(true);
        root.getChildren().add(btn);
        return new Scene(root);
    }

}
