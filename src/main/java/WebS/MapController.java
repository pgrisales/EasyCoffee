package WebS;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * @author GAR
 */
public class MapController implements Initializable {

    @FXML
    private WebView webview;
    @FXML
    private Button selectB;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectB.setOpacity(0);
                Robot robot;
                try {
                    robot = new Robot();
                    Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                    //Rectangle rectangle = new Rectangle(frame.getX()+10,frame.getY()+40,frame.getWidth(),frame.getHeight()-120);
                    BufferedImage image = robot.createScreenCapture(rectangle);
                    Image mapa = SwingFXUtils.toFXImage(image, null);
                    FincaShapeController.image = mapa;
                    
                    System.out.println("La imagen existe"+FincaShapeController.image);
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/FincaShape.fxml"));
                    Scene viewSc = new Scene(view);

                    Mapa.fxContainer.setScene(viewSc);
                } catch (AWTException ex) {
                    Logger.getLogger(MapController.class.getName()).log(Level.SEVERE, null, ex);
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
