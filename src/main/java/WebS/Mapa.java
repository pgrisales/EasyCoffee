package WebS;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.SwingFXUtils;
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
import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

/**
 *
 * @author GAR
 */
public class Mapa extends JApplet {

    private static final int JFXPANEL_WIDTH_INT = 900;
    private static final int JFXPANEL_HEIGHT_INT = 600;
    public static JFXPanel fxContainer;
    private static JFrame frame = new JFrame("Map");
    static Stage window;
    
    
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException{
        iniciar();
    }

    public static void iniciar() throws URISyntaxException, InterruptedException, IOException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                try {
                    /*while(Geo.getPathInDownloads() == null){
                    try {
                    Thread.sleep(4000);
                    Geo.getCoordenadas().notify();
                    System.out.println("YA SE CREARON LAS HPTAS COORDENADAS!!!!!!!");
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }*/
                    Thread.sleep(3000);
                    synchronized (Geo.getPathInDownloads()) {
                        System.out.println(Geo.getPathInDownloads());
                        Geo.getPathInDownloads().notify();
                        System.out.println("COORDENADAS CREADAS");
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }

                
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JApplet applet = new Mapa();
                applet.init();

                frame.setContentPane(applet.getContentPane());

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                applet.start();
            }
        });
    }

    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                createScene();
            }
        });
    }

    private void createScene() {

        StackPane root = new StackPane();
        Button btn = new Button();
        btn.setText("Ver Mapa");

        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("X POSITION:" + event.getSceneX());
                System.out.println("Y POSITION:" + event.getSceneY());
            }
        });
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml"));
                    Scene viewSc = new Scene(view);

                    fxContainer.setScene(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }

}
