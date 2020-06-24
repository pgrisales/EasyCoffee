package Frontera;

import Frontera.Produccion.EditFinca;
import Frontera.Usuarios.Ingreso;
import Frontera.Produccion.RegistroFinca;
import Control.InicializarSistema;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

/**
 *
 * @author Nivektakedown
 */
public class FramePrincipal extends javax.swing.JFrame {

    private static int cedula;

    public static int getCedula() {
        return cedula;
    }

    public static void setCedula(int cedula) {
        FramePrincipal.cedula = cedula;
    }
    private static String panel;
    public static InicializarSistema sistem = new InicializarSistema();
    public static String[] preguntas = {"¿Cuál es el nombre de tu primera mascota?", "¿Cuál es tu comida favorita?", "¿Quíen era el héroe de tu infancia?"};
    private static Fondo fondo;
    private Ingreso ingreso = new Ingreso();

    public FramePrincipal() {
        fondo = new Fondo(ingreso, "../image/318763,xcitefun-cocora-valley-7.jpg");
        this.setContentPane(fondo);
        initComponents();
        this.setTitle("Easy Coffee");
        this.setLocationRelativeTo(null);
        cambiarPanel(ingreso);
        menu.setVisible(false);
        jPanel127.setVisible(false);
        jPanel376.setVisible(false);
    }

    public static void menuVisible(boolean b) {
        menu.setVisible(b);
    }

    public static void menuPanelPrincipal(boolean b) {
        PanelPrincipal.setVisible(b);
    }

    public static void menuDoublePanel(boolean b) {
        jPanel127.setVisible(b);
        jPanel376.setVisible(b);
    }

    public static void cambiarPanel127(JPanel panel) {
        //fondo = new Fondo(panel, panel.fondo);
        panel.setOpaque(false);
        jPanel127.setVisible(false);
        jPanel127.removeAll();
        jPanel127.add(panel);
        jPanel127.setVisible(true);
        jPanel127.setBackground(new Color(0, 0, 0, 0));
    }

    public static void cambiarPanel376(JPanel panel) {
        //fondo = new Fondo(panel, panel.fondo);
        panel.setOpaque(false);

        jPanel376.setVisible(false);
        jPanel376.removeAll();
        jPanel376.add(panel);
        jPanel376.setVisible(true);
        jPanel376.setBackground(new Color(0, 0, 0, 0));
    }

    public static InicializarSistema getSistem() {
        return sistem;
    }

    public static void setSistem(InicializarSistema sistem) {
        FramePrincipal.sistem = sistem;
    }

    public static void setFondo(Fondo fondo) {
        FramePrincipal.fondo = fondo;
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

        jPanel376 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelPrincipal = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");

        jPanel376.setMaximumSize(new java.awt.Dimension(900, 376));
        jPanel376.setMinimumSize(new java.awt.Dimension(900, 376));
        jPanel376.setPreferredSize(new java.awt.Dimension(900, 376));
        jPanel376.setRequestFocusEnabled(false);
        jPanel376.setLayout(new java.awt.BorderLayout());

        jPanel127.setEnabled(false);
        jPanel127.setFocusTraversalPolicyProvider(true);
        jPanel127.setMaximumSize(new java.awt.Dimension(900, 127));
        jPanel127.setMinimumSize(new java.awt.Dimension(900, 127));
        jPanel127.setPreferredSize(new java.awt.Dimension(900, 127));
        jPanel127.setRequestFocusEnabled(false);
        jPanel127.setLayout(new java.awt.BorderLayout());
        jPanel127.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        PanelPrincipal.setEnabled(false);
        PanelPrincipal.setFocusTraversalPolicyProvider(true);
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(900, 503));
        PanelPrincipal.setRequestFocusEnabled(false);
        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        menu.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Editar finca");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menu.add(jMenu2);

        jMenu3.setText("Produccion");
        menu.add(jMenu3);

        jMenu4.setText("Perfil");

        jMenuItem5.setText("Cerrar sesión");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        menu.add(jMenu4);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel376, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel376, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FramePrincipal.menuPanelPrincipal(false);
        javax.swing.JPanel panelj = new javax.swing.JPanel();
        if (FramePrincipal.getSistem().getAdmin().getFinca().getNombreFinca().equals("") == false) {
            FramePrincipal.cambiarPanel127(new EditFinca((int) FramePrincipal.getCedula()));
        } else {
            FramePrincipal.cambiarPanel127(new RegistroFinca((int) FramePrincipal.getCedula()));
        }
        FramePrincipal.cambiarPanel376(panelj);
        FramePrincipal.menuDoublePanel(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FramePrincipal.menuDoublePanel(false);
        FramePrincipal.cambiarPanel(new Ingreso());
        FramePrincipal.menuPanelPrincipal(true);
        FramePrincipal.menuVisible(false);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
                PanelPrincipal.setOpaque(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private static javax.swing.JPanel jPanel127;
    private static javax.swing.JPanel jPanel376;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
