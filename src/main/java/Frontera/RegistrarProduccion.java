package Frontera;

import Frontera.MenuProduccion;
import com.easycoffee.Lote;
import Control.*;
import Frontera.FramePrincipal;
import Frontera.Ingreso;
import com.easycoffee.Trabajador;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class RegistrarProduccion extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProduccion
     */
    private String[] unidades = {"Kg", "Lb", "Arrobas"};
    private String error = "";
    private int cedula;

    public RegistrarProduccion(int cedula) {
        initComponents();
        Calendar c = Calendar.getInstance();
        this.cedula = cedula;
        trabajadores.removeAllItems();
        trabajadores.addItem("-Seleccione el trabajador-");
        for (int i = 0; i < FramePrincipal.sistem.getAdmin().getFinca().getTrabajadores().size(); i++) {
            Trabajador x = FramePrincipal.sistem.getAdmin().getFinca().getTrabajadores().get(i);
            trabajadores.addItem(x.getCedula().intValue() + " - " + x.getNombre() + " " + x.getApellido());
        }
        lotes.removeAllItems();
        lotes.addItem("-Seleccione el lote-");
        for (int i = 0; i < FramePrincipal.sistem.getAdmin().getFinca().getLotes().size(); i++) {
            Lote y = FramePrincipal.sistem.getAdmin().getFinca().getLotes().get(i);
            lotes.addItem(y.getIdLote().toString());
        }
        unidad.removeAllItems();
        unidad.addItem("-");
        for (int i = 0; i < unidades.length; i++) {
            unidad.addItem(unidades[i]);
        }
    }

    private boolean validarDatos() {
        boolean b = true;
        if (trabajadores.getSelectedItem().toString().equals("-Seleccione el trabajador-")) {
            error = "1";
            b = false;
        } else if (lotes.getSelectedItem().toString().equals("-Seleccione el lote-")) {
            error = "2";
            b = false;
        } else if (unidad.getSelectedItem().toString().equals("-")) {
            error = "3";
            b = false;
        } else if (cantidad.getText().equals("")) {
            error = "4";
            b = false;
        }
        return b;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trabajadores = new javax.swing.JComboBox<>();
        lotes = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        unidad = new javax.swing.JComboBox<>();
        aniadir = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar producción a trabajador");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar trabajador:");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionar lote:");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar cantidad:");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Unidades:");

        trabajadores.setBackground(new java.awt.Color(255, 255, 255));
        trabajadores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadoresActionPerformed(evt);
            }
        });

        lotes.setBackground(new java.awt.Color(255, 255, 255));
        lotes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lotes.setForeground(new java.awt.Color(0, 0, 0));
        lotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotesActionPerformed(evt);
            }
        });

        cantidad.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        unidad.setBackground(new java.awt.Color(255, 255, 255));
        unidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        unidad.setForeground(new java.awt.Color(0, 0, 0));
        unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });

        aniadir.setBackground(new java.awt.Color(153, 51, 0));
        aniadir.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        aniadir.setForeground(new java.awt.Color(255, 255, 255));
        aniadir.setText("Añadir");
        aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(102, 0, 0));
        volver.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(386, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lotes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(trabajadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniadir)
                    .addComponent(volver))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
        boolean ingresados = false;
        if (!validarDatos()) {
            switch (error) {
                case "1": {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado un trabajador.");
                    break;
                }
                case "2": {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado un lote.");
                    break;
                }
                case "3": {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado una unidad.");
                    break;
                }
                case "4": {
                    JOptionPane.showMessageDialog(null, "No ha ingresado la cantidad.");
                    break;
                }
            }
        } else {
            float arrobas = 0;
            switch (unidad.getSelectedItem().toString()) {

                case "Kg": {
                    arrobas = (float) (Float.parseFloat(cantidad.getText()) / 11.339);
                    break;
                }
                case "Lb": {
                    arrobas = (float) ((Float.parseFloat(cantidad.getText()) / 11.339) * 0.436);
                    break;
                }
                case "Arrobas": {
                    arrobas = (Float.parseFloat(cantidad.getText()));
                    break;
                }
            }
            Produccion p = new Produccion();
            p.RegistrarProduccionBD(arrobas, FramePrincipal.sistem.getAdmin().getFinca().getLotes().get(lotes.getSelectedIndex() - 1).getIdLote().intValue(),
                    FramePrincipal.sistem.getAdmin().getFinca().getTrabajadores().get(trabajadores.getSelectedIndex() - 1).getCedula().intValue());
            JOptionPane.showMessageDialog(null, "Jornada Añadida");
            ingresados = true;
        }
        if (cedula == FramePrincipal.getSistem().getAdmin().getCedula().intValue()) {
            FramePrincipal.cambiarPanel376(new RegistrarProduccion(cedula));
        } else {
            FramePrincipal.cambiarPanel(new RegistrarProduccion(cedula));
        }
    }//GEN-LAST:event_aniadirActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        if (cedula == FramePrincipal.getSistem().getAdmin().getCedula().intValue()) {
            FramePrincipal.cambiarPanel376(new MenuProduccion(cedula));
        } else {
            FramePrincipal.cambiarPanel(new Ingreso());
            FramePrincipal.menuPanelPrincipal(true);
            FramePrincipal.menuVisible(false);
        }

    }//GEN-LAST:event_volverActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void trabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadoresActionPerformed

    }//GEN-LAST:event_trabajadoresActionPerformed

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadActionPerformed

    private void lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadir;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> lotes;
    private javax.swing.JComboBox<String> trabajadores;
    private javax.swing.JComboBox<String> unidad;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
