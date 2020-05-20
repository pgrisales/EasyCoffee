package Frontera;

import java.util.ArrayList;

/**
 *
 * @author Nivektakedown
 */
public class FramePrincipal extends javax.swing.JFrame {
    private static String panel;
    private static Registro registro;
    private static Ingreso ingreso;
    private static RecuperarContraseña recuperar;
    private static CambiarContraseña cambiar;
    private static InicioSistema inicio;
    private static boolean seInicio = false;

    public static boolean isSeInicio() {
        return seInicio;
    }

    public static void setSeInicio(boolean seInicio) {
        FramePrincipal.seInicio = seInicio;
    }
    
    public FramePrincipal() {
        this.recuperar = new RecuperarContraseña();
        this.cambiar = new CambiarContraseña();
        this.ingreso = new Ingreso();
        this.registro = new Registro();
        this.inicio = new InicioSistema();
        this.panel = "ingreso";
        initComponents();
        
        this.setTitle("Easy Coffee");
        this.setLocationRelativeTo(null);
    }
    public static void state(){
        System.out.println(panel);
        
        /*PanelPrincipal.setVisible(false);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(inicio);
        PanelPrincipal.setVisible(true);
        //panel = "ingreso";
        
        /*do{
            System.out.println(seInicio);
           
            PanelPrincipal.setVisible(false);
            PanelPrincipal.removeAll();
            PanelPrincipal.add(registro);
            PanelPrincipal.setVisible(true);
            panel = "registro";
            if(Registro.datosCorrectos() == true)){
                seInicio = true;
            }
        }while(seInicio == false);
        panel = "ingreso";*/
        switch(panel){
            case "ingreso":{
                 PanelPrincipal.setVisible(false);
                 PanelPrincipal.removeAll();
                 PanelPrincipal.add(ingreso);
                 PanelPrincipal.setVisible(true);
                break;
            }
            case "registro":{
                 PanelPrincipal.setVisible(false);
                 PanelPrincipal.removeAll();
                 PanelPrincipal.add(registro);
                 PanelPrincipal.setVisible(true);
                break;
            }
            case "recuperar":{
                 PanelPrincipal.setVisible(false);
                 PanelPrincipal.removeAll();
                 PanelPrincipal.add(recuperar);
                 PanelPrincipal.setVisible(true);
                break;
            }
            case "cambiar":{
                 PanelPrincipal.setVisible(false);
                 PanelPrincipal.removeAll();
                 PanelPrincipal.add(cambiar);
                 PanelPrincipal.setVisible(true);
                break;
            }
        }
    }

    public static String getPanel() {
        return panel;
    }

    public static void setPanel(String panel) {
        FramePrincipal.panel = panel;
        state();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");

        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
                state();
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}