package Frontera;

import Frontera.Usuarios.AgregarAuxiliar;
import Frontera.FramePrincipal;
import Frontera.FramePrincipal;
import Frontera.Usuarios.AgregarAuxiliar;
import Frontera.Usuarios.EditarAuxiliar;
import Frontera.Usuarios.ListarUsuarios;
import Frontera.Usuarios.RegistrarTrabajador;
import java.awt.Color;

/**
 *
 * @author Camilo Vargas
 */
public class MenuUsuarios extends javax.swing.JPanel {

    
     int cedula;
    public MenuUsuarios(int cedula) {
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        addAux = new javax.swing.JButton();
        AddTra = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/userN.png"))); // NOI18N
        jButton2.setText("Editar Usuarios");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setMaximumSize(new java.awt.Dimension(190, 52));
        jButton2.setMinimumSize(new java.awt.Dimension(180, 52));
        jButton2.setPreferredSize(new java.awt.Dimension(210, 52));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/userC.png"))); // NOI18N
        jButton3.setText("Listar Usuarios");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setMaximumSize(new java.awt.Dimension(190, 52));
        jButton3.setMinimumSize(new java.awt.Dimension(180, 52));
        jButton3.setPreferredSize(new java.awt.Dimension(210, 52));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        addAux.setBackground(new java.awt.Color(102, 0, 0));
        addAux.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addAux.setForeground(new java.awt.Color(255, 255, 255));
        addAux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/AddAux.png"))); // NOI18N
        addAux.setText("Agregar Auxiliar");
        addAux.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addAux.setMaximumSize(new java.awt.Dimension(190, 52));
        addAux.setMinimumSize(new java.awt.Dimension(180, 52));
        addAux.setPreferredSize(new java.awt.Dimension(210, 52));
        addAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuxActionPerformed(evt);
            }
        });

        AddTra.setBackground(new java.awt.Color(102, 0, 0));
        AddTra.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        AddTra.setForeground(new java.awt.Color(255, 255, 255));
        AddTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/AddTra.png"))); // NOI18N
        AddTra.setText("Agregar Trabajador");
        AddTra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddTra.setMaximumSize(new java.awt.Dimension(190, 52));
        AddTra.setMinimumSize(new java.awt.Dimension(190, 52));
        AddTra.setPreferredSize(new java.awt.Dimension(210, 52));
        AddTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setBackground(new Color(152, 51, 0));
        jButton3.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(new EditarAuxiliar(cedula));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton2.setBackground(new Color(102, 0, 0));
        jButton3.setBackground(new Color(152, 51, 0));
        FramePrincipal.cambiarPanel376(new ListarUsuarios(cedula));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuxActionPerformed
        FramePrincipal.cambiarPanel376(new AgregarAuxiliar());
    }//GEN-LAST:event_addAuxActionPerformed

    private void AddTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTraActionPerformed
       FramePrincipal.cambiarPanel376(new RegistrarTrabajador(cedula));
       
    }//GEN-LAST:event_AddTraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTra;
    private javax.swing.JButton addAux;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
