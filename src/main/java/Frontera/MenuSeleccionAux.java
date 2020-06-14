package Frontera;

import javax.swing.ImageIcon;

/**
 *
 * @author Camilo Vargas
 */
public class MenuSeleccionAux extends javax.swing.JPanel {

    static String fondo = "../image/cafe.jpg";

    private int cedula;

    public MenuSeleccionAux(int cedula) {
        initComponents();
        this.cedula = cedula;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        produccion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        verPerfil = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();

        setMaximumSize(new java.awt.Dimension(900, 127));
        setMinimumSize(new java.awt.Dimension(900, 127));
        setPreferredSize(new java.awt.Dimension(900, 127));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido A EasyCoffe App");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor seleccione la Acción que desea realizar");

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);

        produccion.setBackground(new java.awt.Color(102, 0, 0));
        produccion.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        produccion.setForeground(new java.awt.Color(255, 255, 255));
        produccion.setText("Producción");
        produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produccionActionPerformed(evt);
            }
        });
        jToolBar1.add(produccion);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator2);

        verPerfil.setBackground(new java.awt.Color(102, 0, 0));
        verPerfil.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        verPerfil.setForeground(new java.awt.Color(255, 255, 255));
        verPerfil.setText("Ver Perfil");
        verPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPerfilActionPerformed(evt);
            }
        });
        jToolBar1.add(verPerfil);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)))
                .addContainerGap(359, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void verPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPerfilActionPerformed
        FramePrincipal.cambiarPanel376(new PerfilUsuario(cedula));
    }//GEN-LAST:event_verPerfilActionPerformed

    private void produccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produccionActionPerformed
        FramePrincipal.cambiarPanel376(new MenuProduccion(cedula));
    }//GEN-LAST:event_produccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton produccion;
    private javax.swing.JButton verPerfil;
    // End of variables declaration//GEN-END:variables
}
