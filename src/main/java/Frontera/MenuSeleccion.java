package Frontera;

import Frontera.Produccion.RegistrarAvanceDiario;
import Frontera.Produccion.RegistrarLote;
import Frontera.Produccion.EditFinca;
import Frontera.Produccion.EditFinca;
import Frontera.FramePrincipal;
import Frontera.FramePrincipal;
import Frontera.Usuarios.Ingreso;
import com.easycoffee.Lote;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Vargas
 */
public class MenuSeleccion extends javax.swing.JPanel {
    
    static String fondo = "../image/cafe.jpg";
    
    private static int cedula;
    
    public MenuSeleccion(int cedula) {
        initComponents();
        this.cedula = cedula;
        this.ListaNotificaciones.removeAllItems();
        for (int i = 0; i < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            String s=FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getFechaDesyerbado();
            String ss[]=s.split("/");
            Calendar c=Calendar.getInstance();
            c.set(Calendar.DATE, Integer.parseInt(ss[0]));
            c.set(Calendar.MONTH, Integer.parseInt(ss[1]));
            c.set(Calendar.YEAR, Integer.parseInt(ss[2]));
            c.add(Calendar.DATE, FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getFrecDesyer());
            if(c.compareTo(Calendar.getInstance())<0){
                this.ListaNotificaciones.addItem("El lote "+i+" está listo para desyerbarse");
            }
        }
        for (int i = 0; i < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            int cont=0;
                if(FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getArbolesVivos().size()!=0){
                    for (int j = 0; j < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getArbolesVivos().size(); j++) {
                        Calendar c=Calendar.getInstance();
                        String s=FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getArbolesVivos().get(j).getFechaDeSembrado();
                        String ss[]=s.split("-");
                        //System.out.println(ss.length);
                        if(ss.length==1){
                            ss=s.split("/");
                            //System.out.println("asdad");
                            //System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
                            c.set(Calendar.DATE, Integer.parseInt(ss[0]));
                            c.set(Calendar.MONTH, Integer.parseInt(ss[1]));
                            c.set(Calendar.YEAR, Integer.parseInt(ss[2]));
                            c.add(Calendar.YEAR, 8);
                        }
                        else{
                            //System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
                            c.set(Calendar.DATE, Integer.parseInt(ss[0]));
                            c.set(Calendar.MONTH, Integer.parseInt(ss[1]));
                            c.set(Calendar.YEAR, Integer.parseInt(ss[2]));
                            c.add(Calendar.YEAR, 8);
                        }
                        //System.out.println("dia"+c.get(Calendar.DATE)+"mes"+c.get(Calendar.MONTH)+"año"+c.get(Calendar.YEAR));
                        if(c.compareTo(Calendar.getInstance())<0){
                           cont++;
                        }
                    }
                    
                    
                }
            if(cont!=0)
                this.ListaNotificaciones.addItem("El lote "+i+" Tiene "+cont+" árboles listos para renovarse.");
        }
        this.ListaNotificaciones.setVisible(false);
        FramePrincipal.cambiarPanel127(this);
    }
    public static int getCedula(){
        return cedula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        usuarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        produccion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        finanzas = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        estadisticas = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        gfinca = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ListaNotificaciones = new javax.swing.JComboBox<>();
        notific = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 127));
        setMinimumSize(new java.awt.Dimension(900, 127));
        setPreferredSize(new java.awt.Dimension(900, 127));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido A EasyCoffe App");

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);

        usuarios.setBackground(new java.awt.Color(102, 0, 0));
        usuarios.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        usuarios.setForeground(new java.awt.Color(255, 255, 255));
        usuarios.setText("Gestión Usuarios");
        usuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        usuarios.setMaximumSize(new java.awt.Dimension(180, 25));
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(usuarios);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator6);

        produccion.setBackground(new java.awt.Color(102, 0, 0));
        produccion.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        produccion.setForeground(new java.awt.Color(255, 255, 255));
        produccion.setText("Producción");
        produccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        produccion.setMaximumSize(new java.awt.Dimension(180, 25));
        produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produccionActionPerformed(evt);
            }
        });
        jToolBar1.add(produccion);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator5);

        finanzas.setBackground(new java.awt.Color(102, 0, 0));
        finanzas.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        finanzas.setForeground(new java.awt.Color(255, 255, 255));
        finanzas.setText("Administracion Contable");
        finanzas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        finanzas.setMaximumSize(new java.awt.Dimension(180, 25));
        finanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finanzasActionPerformed(evt);
            }
        });
        jToolBar1.add(finanzas);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);

        estadisticas.setBackground(new java.awt.Color(102, 0, 0));
        estadisticas.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        estadisticas.setForeground(new java.awt.Color(255, 255, 255));
        estadisticas.setText("Reportes y Estadísticas");
        estadisticas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        estadisticas.setMaximumSize(new java.awt.Dimension(180, 25));
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });
        jToolBar1.add(estadisticas);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator8);

        gfinca.setBackground(new java.awt.Color(102, 0, 0));
        gfinca.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        gfinca.setForeground(new java.awt.Color(255, 255, 255));
        gfinca.setText("Gestion Finca");
        gfinca.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        gfinca.setFocusable(false);
        gfinca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gfinca.setMaximumSize(new java.awt.Dimension(180, 25));
        gfinca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gfincaActionPerformed(evt);
            }
        });
        jToolBar1.add(gfinca);

        cerrar.setBackground(new java.awt.Color(0, 153, 153));
        cerrar.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("Cerrar sesión ");
        cerrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por favor seleccione la Acción que desea realizar");

        ListaNotificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        notific.setBackground(new java.awt.Color(153, 102, 0));
        notific.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        notific.setForeground(new java.awt.Color(255, 255, 255));
        notific.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-alarma-50.png"))); // NOI18N
        notific.setText("Mostrar notificaciones");
        notific.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), null));
        notific.setMaximumSize(new java.awt.Dimension(190, 52));
        notific.setMinimumSize(new java.awt.Dimension(180, 52));
        notific.setPreferredSize(new java.awt.Dimension(210, 52));
        notific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ListaNotificaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notific, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        FramePrincipal.cambiarPanel376(new MenuUsuarios(cedula));
        usuarios.setBackground(new Color(152, 51, 0));
        produccion.setBackground(new Color(102, 0, 0));
        finanzas.setBackground(new Color(102, 0, 0));
        estadisticas.setBackground(new Color(102, 0, 0));
        gfinca.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_usuariosActionPerformed

    private void produccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produccionActionPerformed
        FramePrincipal.cambiarPanel376(new MenuProduccion(cedula));
        produccion.setBackground(new Color(152, 51, 0));
        usuarios.setBackground(new Color(102, 0, 0));
        finanzas.setBackground(new Color(102, 0, 0));
        estadisticas.setBackground(new Color(102, 0, 0));
        gfinca.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_produccionActionPerformed

    private void finanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finanzasActionPerformed
        FramePrincipal.cambiarPanel376(new MenuAdministrativo(cedula));
        finanzas.setBackground(new Color(152, 51, 0));
        produccion.setBackground(new Color(102, 0, 0));
        usuarios.setBackground(new Color(102, 0, 0));
        estadisticas.setBackground(new Color(102, 0, 0));
        gfinca.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_finanzasActionPerformed

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        FramePrincipal.cambiarPanel376(new RegistrarAvanceDiario(this.cedula));
        estadisticas.setBackground(new Color(152, 51, 0));
        produccion.setBackground(new Color(102, 0, 0));
        finanzas.setBackground(new Color(102, 0, 0));
        usuarios.setBackground(new Color(102, 0, 0));
        gfinca.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_estadisticasActionPerformed

    private void gfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gfincaActionPerformed
        FramePrincipal.cambiarPanel127(new EditFinca(cedula));
        FramePrincipal.cambiarPanel376(new RegistrarLote(new ArrayList<Lote>()));
        gfinca.setBackground(new Color(152, 51, 0));
        produccion.setBackground(new Color(102, 0, 0));
        finanzas.setBackground(new Color(102, 0, 0));
        estadisticas.setBackground(new Color(102, 0, 0));
        usuarios.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_gfincaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
       int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Confirmación", JOptionPane.YES_NO_OPTION);
       if(resp == JOptionPane.YES_OPTION){
            FramePrincipal.menuDoublePanel(false);
            FramePrincipal.cambiarPanel(new Ingreso());
            FramePrincipal.menuPanelPrincipal(true);
       }
    }//GEN-LAST:event_cerrarActionPerformed

    private void notificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificActionPerformed
        if(this.ListaNotificaciones.isVisible()==true)
            this.ListaNotificaciones.setVisible(false);
        else
            this.ListaNotificaciones.setVisible(true);
        FramePrincipal.cambiarPanel127(this);
            
    }//GEN-LAST:event_notificActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaNotificaciones;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton estadisticas;
    private javax.swing.JButton finanzas;
    private javax.swing.JButton gfinca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton notific;
    private javax.swing.JButton produccion;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}
