/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebS;

import Frontera.FramePrincipal;
import Frontera.MenuSeleccion;
import Frontera.Produccion.EditFinca;
import Frontera.Produccion.RegistrarLote;
import static WebS.Mapa1.fxContainer;
import com.easycoffee.Lote;
import java.awt.Color;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.shape.Circle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author GAR
 */
public class MenuMap implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Button verLotesB;
    @FXML
    private Button crearVistaB;
    @FXML  
    private Button volverB;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //root.setOpacity(0);
        /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MenuMap.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }*/
        //root.setStyle("-fx-background-color: rgba(0, 0, 0, 10); -fx-background-radius: 35;");
        try {
            while(Geo.getPathInDownloads() == null){
                    try {
                    Thread.sleep(4000);
                    Geo.getCoordenadas().notify();
                    System.out.println("YA SE CREARON LAS HPTAS COORDENADAS!!!!!!!");
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
            Thread.sleep(3000);
            synchronized (Geo.getPathInDownloads()) {
                System.out.println(Geo.getPathInDownloads());
                Geo.getPathInDownloads().notify();
                System.out.println("COORDENADAS CREADAS");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
        root.setVisible(true);
        volverB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    //Parent view = FXMLLoader.load(getClass().getResource("../fxml/MenuMap.fxml")); //Map
                    //Scene viewSc = new Scene(view);
                    //root.setVisible(false);
                    fxContainer.setScene(Mapa1.createScene());
                } catch (IOException ex) {
                    Logger.getLogger(MenuMap.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Mapa1.stopT();
                FramePrincipal.cambiarPanel127(new EditFinca(MenuSeleccion.getCedula()));
                FramePrincipal.cambiarPanel376(new RegistrarLote(new ArrayList<Lote>()));
                //FramePrincipal.mapPanel().removeAll();
                FramePrincipal.mapPanel().setVisible(false);

                //Platform.exit();
            }
        });
        
        crearVistaB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml")); //Map
                    Scene viewSc = new Scene(view);
                    root.setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(MenuMap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        File file = new File(getClass().getResource("../image/Pedrosky.png").getFile());

        Image fondo;
        try {
            fondo = new Image(new FileInputStream(file));
            BackgroundImage img = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
            Background background = new Background(img);
            root.setBackground(background);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Image fondo = new Image(getClass().getResource("a"))
        //Image fondo = new ImageView(img);
        //Image fondo = (new ImageView(getClass().getResource("../image/318763,xcitefun-cocora-valley-7.jpg"))).getImage();//(getClass().getResource("../image/LOGO.png")).getImage());

        //root.setShape(new Circle(20));
    }

}
