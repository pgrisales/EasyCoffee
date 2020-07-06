package WebS;

import Frontera.FramePrincipal;
import Frontera.Produccion.EditarLote;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author GAR
 */
public class FincaShapeController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private Button saveB;
    @FXML
    private Button eraseB;
    @FXML
    private Button volverB;

    private static int clicks = 0;
    private static double xStart;
    private static double yStart;
    private static double xEnd;
    private static double yEnd;

    static Image image;

    private ArrayList shape = new ArrayList<Double>();
    private ArrayList cShape = new ArrayList<Double>();
    private ArrayList lotes = FramePrincipal.getSistem().getAdmin().getFinca().getLotes();
    private ArrayList fincaCells = new ArrayList<Rectangle>();
    Polyline bFinca = new Polyline();
    private static int idLote = 0;
    private static Color initColor = Color.color(Math.random(), Math.random(), Math.random(), 0.6);
    @FXML
    private AnchorPane canvasP;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        BackgroundImage img = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background = new Background(img);
        root.setBackground(background);

        /*saveB.setStyle("-fx-background-color: rgba(102, 0, 0, 100);");
        volverB.setStyle("-fx-background-color: rgba(102, 0, 0, 100);");
        eraseB.setStyle("-fx-background-color: rgba(102, 0, 0, 100);");*/
        canvasP.setOnMouseClicked(e -> {
            drawline(clicks, e);
        });

        saveB.setOnMouseClicked(e -> {
            previewShape(shape);
            canvasP.setOnMouseClicked(null);
            saveB.setVisible(false);
            fillFinca();
            shape.clear();
            cShape.clear();
            fincaCells.clear();
            idLote = 0;

        });

        eraseB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                shape.clear();
                cShape.clear();
                fincaCells.clear();
                idLote = 0;
                canvasP.getChildren().clear();
                canvasP.setOnMouseClicked(e -> {
                    drawline(clicks, e);
                });
                saveB.setVisible(true);
                //canvasP.setVisible(false);
            }
        });

        volverB.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Parent view;
                try {
                    view = FXMLLoader.load(getClass().getResource("../fxml/Map.fxml"));
                    Scene viewSc = new Scene(view);
                    //Mapa.fxContainer.setScene(viewSc);
                    Mapa1.cambiarSc(viewSc);
                } catch (IOException ex) {
                    Logger.getLogger(FincaShapeController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    public void defColor(int lote, Rectangle r) {
        if (idLote != lote) {
            initColor = Color.color(Math.random(), Math.random(), Math.random(), 0.6);
            idLote++;
        }
        r.setFill(initColor);
        r.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //FramePrincipal.cambiarPanel376(new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(),lote));
                //FramePrincipal.mapPanel().setVisible(false);
                System.out.println(lote);
                verLote(lote);
            }
        });
    }

    public void verLote(int lote) {
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new Color(0.8, 0.7, 0.2, 1));
        UI.put("Panel.background", Color.RED);
        JOptionPane.showConfirmDialog(null, new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(), lote));

    }

    public void grid(double minX, double minY, double width, double height, Polyline boundsFinca) {
        ArrayList<Rectangle> cells = new ArrayList<>();
        int nCols = 300;
        int nRows = 300;
        double sX = width / nCols;
        double sY = height / nRows;
        GridPane grid = new GridPane();
        grid.setPrefSize(width, height);
        grid.setMaxSize(width, height);
        grid.setLayoutX(minX);
        grid.setLayoutY(minY);

        for (int i = 0; i < nCols; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / nCols);
            grid.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < nRows; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / nRows);
            grid.getRowConstraints().add(rowConst);
        }

        boundsFinca.setFill(Color.BLACK);
        /*grid.setOpacity(1);
        grid.setShape(boundsFinca);
        grid.setVisible(true);
        grid.setGridLinesVisible(true);
        for (int i = 0; i < nCols; i++) {
            ColumnConstraints column = new ColumnConstraints(100/nCols);
            grid.getColumnConstraints().add(column);
        }
        
        for(int j = 0; j < nRows; j++){
            RowConstraints row = new RowConstraints(100/nRows);
            grid.getRowConstraints().add(row);
        }*/
        Button b = new Button();

        ArrayList idx = new ArrayList<Integer>();
        //ArrayList indJ = new ArrayList<Integer>();

        for (int i = 0; i < nCols; i++) {
            for (int j = 0; j < nRows; j++) {
                cells.add(new Rectangle(minX + (sX * j), minY + (sY * i), sX, sY));;
                cells.get(j + (i * nCols)).setStrokeLineJoin(StrokeLineJoin.ROUND);
                cells.get(j + (i * nCols)).setStrokeLineCap(StrokeLineCap.ROUND);
                cells.get(j + (i * nCols)).setStroke(Color.TRANSPARENT);
                grid.add(cells.get(j + (i * nCols)), i, j);

                fincaCells.add(cells.get(j + (i * nCols)));
                if (!boundsFinca.contains(cells.get(j + (i * nCols)).getX(), cells.get(j + (i * nCols)).getY())) {
                    cells.get(j + (i * nCols)).setVisible(false);
                }
                idx.add((i * nCols) + j);
                /*cells.get(j+(i*nCols)).setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        //Se pierden algunos
                    }
                });
                 */
            }
        }

        ///////////////////////////////
        ArrayList piezas = new ArrayList<Double>();
        int sumA = 0;
        for (int i = 0; i < lotes.size(); i++) {
            if ((int) FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal() < 0) {
                sumA += ((int) FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal()) * -1;
            } else {
                sumA += (int) FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
            }
        }

        int asdf = 0;
        for (int i = 0; i < lotes.size(); i++) {
            int areaLote = (int) FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
            if (areaLote < 0) {
                areaLote *= -1;
            }
            double sLote = (((areaLote / 1000) * 100) / (sumA / 1000));
            double nShapes = (sLote * cells.size()) / 100;
            //piezas.add(nShapes);
            for (int j = 0; j < nShapes; j++) {

                defColor(i, cells.get((int) idx.get(asdf)));

                asdf++;
            }

        }

        //ystem.out.println("asdf: "+asdf);
        //   System.out.println("idx: "+idx.size());
        while (asdf < idx.size()) {
            cells.get(asdf).setFill(initColor);
            asdf++;

        }
        //////////////////////////////

        canvasP.getChildren().addAll(cells);

    }

    //terminar el EVENT AL RESIDUO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void residuo(int a, int b, Color c, ArrayList<Rectangle> cells) {
        while (a < b) {
            cells.get(a).setFill(initColor);
            a++;
        }
    }
    
    public void fillFinca() {
        double minX = bFinca.getBoundsInLocal().getMinX();
        double minY = bFinca.getBoundsInLocal().getMinY();
        double width = bFinca.getBoundsInLocal().getWidth();
        double height = bFinca.getBoundsInLocal().getHeight();
        double maxX = bFinca.getBoundsInLocal().getMaxX();
        double maxY = bFinca.getBoundsInLocal().getMaxY();

        double qX = width / 10;
        double qY = height / 10;
        final int nCols = 25;
        final int nRows = 25;

        grid(minX, minY, width, height, bFinca);
    }

    public void previewShape(ArrayList<Double> shape) {
        int size = shape.size();
        for (int i = 0; i < size; i += 4) {
            if (shape.get(i + 2) != shape.get((i + 4) % size) && shape.get(i + 3) != shape.get(((i + 5) % (size)))) {
                Line line = new Line(shape.get(i + 2), shape.get(i + 3), shape.get(((i + 4) % (size))), shape.get(((i + 5) % (size))));
                line.setStrokeWidth(5);
                line.setStrokeType(StrokeType.CENTERED);
                line.setStrokeLineCap(StrokeLineCap.BUTT);
                line.setStroke(Color.RED.brighter());
                canvasP.getChildren().add(new Group(line));
                cShape.add(shape.get(i + 2));
                cShape.add(shape.get(i + 3));
                cShape.add(shape.get(((i + 4) % (size))));
                cShape.add(shape.get(((i + 5) % (size))));
            }
        }
        for (int i = 0; i < cShape.size() / 4; i++) {
            for (int j = 3; j == 0; j--) {
                shape.add(i * 4, (double) cShape.get(i * 4 + j));
            }
        }
        addBounds();
    }

    public void addBounds() {
        Line line1 = new Line();
        Line line2 = new Line();
        Polyline pol = new Polyline();
        int size = shape.size();
        for (int i = 0; i < size; i += 4) {
            line1 = new Line((double) shape.get(i % size), (double) shape.get((i + 1) % size), (double) shape.get((i + 2) % size), (double) shape.get((i + 3) % size));
            line2 = new Line((double) shape.get((i + 2) % size), (double) shape.get((i + 3) % size), (double) shape.get((i + 4) % size), (double) shape.get((i + 5) % size));

            pol.getPoints().add((double) shape.get(i % size));
            pol.getPoints().add((double) shape.get((i + 1) % size));
            pol.getPoints().add((double) shape.get((i + 2) % size));
            pol.getPoints().add((double) shape.get((i + 3) % size));

            pol.getPoints().add((double) shape.get((i + 2) % size));
            pol.getPoints().add((double) shape.get((i + 3) % size));
            pol.getPoints().add((double) shape.get((i + 4) % size));
            pol.getPoints().add((double) shape.get((i + 5) % size));
            
            bFinca = pol;
            //finca.getChildren().add(line1);
            //finca.getChildren().add(line2);
        }
    }

    public void drawline(int nClicks, MouseEvent event) {
        clicks++;
        Line line;
        if (clicks == 1) {
            System.out.println("clicks: " + clicks);
            xStart = event.getSceneX();
            yStart = event.getSceneY();
            shape.add(xStart);
            shape.add(yStart);
            System.out.println("xStart: " + xStart);
            System.out.println("yStart: " + yStart);
            Circle circ = new Circle(xStart, yStart, 4);
            circ.setStroke(Color.RED.brighter());
            canvasP.getChildren().add(new Group(circ));
        } else if (clicks == 2) {
            System.out.println("drawed: " + clicks);
            xEnd = event.getSceneX();
            yEnd = event.getSceneY();
            shape.add(xEnd);
            shape.add(yEnd);
            System.out.println("xEnd: " + xEnd);
            System.out.println("yEnd: " + yEnd);
            line = new Line(xStart, yStart, xEnd, yEnd);
            line.setStrokeWidth(5);
            line.setStrokeType(StrokeType.CENTERED);
            line.setStrokeLineCap(StrokeLineCap.BUTT);
            line.setStroke(Color.RED.brighter());
            Circle circ = new Circle(xEnd, yEnd, 4);
            circ.setStroke(Color.RED.brighter());
            canvasP.getChildren().add(new Group(line));
            canvasP.getChildren().add(new Group(circ));
            clicks = 0;
        }
    }

}
