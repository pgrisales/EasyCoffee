package WebS;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author GAR
 */
public class Mapa extends JApplet {

    private static final int JFXPANEL_WIDTH_INT = 900;
    private static final int JFXPANEL_HEIGHT_INT = 600;
    private static JFXPanel fxContainer;

    public static void iniciar() throws URISyntaxException, InterruptedException, IOException {

        Geo.getGeo();

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
                    Thread.sleep(10000);
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

                JFrame frame = new JFrame("Map");
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
                try {
                    createScene();
                } catch (IOException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void createScene() throws IOException, URISyntaxException {

        WebView webview = new WebView();
        VBox root = new VBox();
        WebEngine engine = webview.getEngine();
        String coor = Geo.getCoor();
        String url = Geo.getMapUrl() + coor + "," + "17z";
        System.out.println(url);
        Button btn = new Button("Ver localizacion");
        Button cerrarB = new Button("Cerrar");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load(url);
            }
        });

        root.getChildren().addAll(webview);
        //StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(cerrarB);
        fxContainer.setScene(new Scene(root));
    }

}
