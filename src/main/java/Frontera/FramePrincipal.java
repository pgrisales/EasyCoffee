package Frontera;

import Control.InicializarSistema;
import WebS.PrecioCafe;
import static WebS.PrecioCafe.getInstance;
import com.easycoffee.Administrador;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Nivektakedown
 */
public class FramePrincipal extends javax.swing.JFrame {

    private static String panel;
    public static InicializarSistema sistem = new InicializarSistema();
    public static String[] preguntas = {"¿Cuál es el nombre de tu primera mascota?", "¿Cuál es tu comida favorita?", "¿Quíen era el héroe de tu infancia?"};
    static private Fondo fondo;
    private Ingreso ingreso = new Ingreso();
    PrecioCafe precioCafe;

    public FramePrincipal() throws IOException {
        this.precioCafe = WebS.PrecioCafe.getInstance();
        fondo = new Fondo(ingreso, "../image/318763,xcitefun-cocora-valley-7.jpg");
        this.setContentPane(fondo);
        initComponents();
        this.setTitle("Easy Coffee");
        this.setLocationRelativeTo(null);
        cambiarPanel(ingreso);

    }

    public static InicializarSistema getSistem() {
        return sistem;
    }

    public static void setSistem(InicializarSistema sistem) {
        FramePrincipal.sistem = sistem;
    }

    public static void cambiarPanel(JPanel panel) {
        //fondo = new Fondo(panel, panel.fondo);
        panel.setOpaque(false);
        PanelPrincipal.setVisible(false);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel);
        PanelPrincipal.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");

        PanelPrincipal.setFocusTraversalPolicyProvider(true);
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setRequestFocusEnabled(false);
        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FramePrincipal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                PanelPrincipal.setOpaque(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
