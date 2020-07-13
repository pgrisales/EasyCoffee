package WebS;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

/**
 * @author GAR
 */
public class MapController implements Initializable {

    @FXML
    private WebView webview;
    @FXML
    private Button selectB;
    @FXML
    private AnchorPane root;
    @FXML
    private Button volverB;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        selectB.setStyle("-fx-border-color: rgb(255, 255, 255); -fx-border-width: 2px; -fx-font-weight: bold; -fx-background-color: rgb(102, 0, 0); -fx-text-fill: rgb(255, 255, 255)");
        volverB.setStyle("-fx-border-color: rgb(255, 255, 255); -fx-border-width: 2px; -fx-font-weight: bold; -fx-background-color: rgb(102, 0, 0); -fx-text-fill: rgb(255, 255, 255)");

        selectB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectB.setOpacity(0);
                volverB.setOpacity(0);
                Robot robot;
                try {
                    WritableImage imagen = root.snapshot(new SnapshotParameters(), null);
                    FincaShapeController.image = imagen;
                    System.out.println("La imagen existe " + FincaShapeController.image);
                    //Parent view = FXMLLoader.load(getClass().getResource("/fxml/FincaShape.fxml"));
                    Parent view = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/FincaShape.fxml"));
                    Scene viewSc = new Scene(view);
                    Mapa1.cambiarSc(viewSc);
                    // Mapa.fxContainer.setScene(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        volverB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Mapa1.cambiarSc(Mapa1.createScene());
                } catch (IOException ex) {
                    Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
        });

        WebEngine engine = webview.getEngine();
        String coor = "";
        
        

        int a = 1;
        int b = 1;
        
        
        if(Geo.getCoordenadas() == null){
            try {
                Geo.getGeo();
            } catch (IOException ex) {
                Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        while (a == 1) {

            if (Geo.getCoordenadas() == null) {
                while (b == 1) {
                    try {
                        Geo.getCoorFile();
                    } catch (IOException ex) {
                        Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    b++;
                }

            }

            if (Geo.getCoordenadas() != null) {
                String coord = "";
                coord = Geo.getCoordenadas();
                String data = Geo.getMapUrl() + coord + "," + "17z";
                System.out.println(data);
                engine.load(data);
                System.out.println(coord);
                a = 22;
                System.out.println(a);
                break;
            }
        }
    }

}