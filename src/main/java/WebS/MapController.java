package WebS;

import java.awt.Robot;
import java.io.IOException;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        selectB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectB.setOpacity(0);
                Robot robot;
                try {
                    WritableImage imagen = root.snapshot(new SnapshotParameters(), null);
                    //webview.autosize();
                    FincaShapeController.image = imagen;
                    //webview.autosize();
                    System.out.println("La imagen existe "+FincaShapeController.image);
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/FincaShape.fxml")); 
                    Scene viewSc = new Scene(view);
                    Mapa1.cambiarSc(viewSc);
                   // Mapa.fxContainer.setScene(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        WebEngine engine = webview.getEngine();
        String coor = "";
        try {
            coor = Geo.getCoor();
            String data = Geo.getMapUrl() + coor + "," + "17z";
            System.out.println(data);
            engine.load(data);
        } catch (IOException ex) {
            Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
