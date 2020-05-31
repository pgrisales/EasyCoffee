/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import com.easycoffee.Lote;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class RegistroFinca extends javax.swing.JPanel {
    
    private ArrayList<Lote> lotesA;
    private String[] lotes=new String[]{};
     
    public RegistroFinca() {
        initComponents();
        lotesC.removeAllItems();
        for (int i = 0; i < lotes.length; i++) {
            lotesC.addItem(lotes[i]);
        }
        editLote.setEnabled(false);
        lotesA= new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        registrar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        agregarLote = new javax.swing.JButton();
        editLote = new javax.swing.JButton();
        AddTrabajador = new javax.swing.JButton();
        addAux = new javax.swing.JButton();
        lotesC = new javax.swing.JComboBox<>();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setMaximumSize(new java.awt.Dimension(900, 127));
        setMinimumSize(new java.awt.Dimension(900, 127));
        setPreferredSize(new java.awt.Dimension(900, 127));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el nombre de la finca:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tamaño de la finca:");

        jLabel6.setText("cargar suma de areas de lotes");

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lotes registrados:");

        jToolBar1.setRollover(true);

        agregarLote.setBackground(new java.awt.Color(102, 0, 0));
        agregarLote.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        agregarLote.setForeground(new java.awt.Color(255, 255, 255));
        agregarLote.setText("Agregar lote");
        agregarLote.setFocusable(false);
        agregarLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        agregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(agregarLote);

        editLote.setBackground(new java.awt.Color(102, 0, 0));
        editLote.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        editLote.setForeground(new java.awt.Color(255, 255, 255));
        editLote.setText("Editar lote");
        editLote.setFocusable(false);
        editLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(editLote);

        AddTrabajador.setBackground(new java.awt.Color(102, 0, 0));
        AddTrabajador.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        AddTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        AddTrabajador.setText("Agregar trabajador");
        AddTrabajador.setFocusable(false);
        AddTrabajador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddTrabajador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrabajadorActionPerformed(evt);
            }
        });
        jToolBar1.add(AddTrabajador);

        addAux.setBackground(new java.awt.Color(102, 0, 0));
        addAux.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        addAux.setForeground(new java.awt.Color(255, 255, 255));
        addAux.setText("Agregar auxiliar");
        addAux.setFocusable(false);
        addAux.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addAux.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuxActionPerformed(evt);
            }
        });
        jToolBar1.add(addAux);

        lotesC.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        lotesC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lotesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotesCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(434, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(registrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "Puedes modificar los datos registrados accediendo a editar finca en la barra de tareas.");
        FramePrincipal.menuDoublePanel(false);  
        FramePrincipal.cambiarPanel(new RegistrarProduccion());
        FramePrincipal.menuPanelPrincipal(true);
    }//GEN-LAST:event_registrarActionPerformed

    public static JComboBox<String> getLotesC() {
        return lotesC;
    }

    public void setLotesC(JComboBox<String> lotesC) {
        this.lotesC = lotesC;
    }

    private void lotesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotesCActionPerformed
        editLote.setEnabled(true);
    }//GEN-LAST:event_lotesCActionPerformed

    private void agregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLoteActionPerformed
        RegistrarLote lote=new RegistrarLote(lotesA);
        lotesA=lote.getLotes();
        FramePrincipal.cambiarPanel376(lote);
    }//GEN-LAST:event_agregarLoteActionPerformed

    private void AddTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrabajadorActionPerformed
        FramePrincipal.cambiarPanel376(new RegistrarTrabajador());
    }//GEN-LAST:event_AddTrabajadorActionPerformed

    private void addAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuxActionPerformed
        FramePrincipal.cambiarPanel376(new AgregarAuxiliar());
    }//GEN-LAST:event_addAuxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrabajador;
    private javax.swing.JButton addAux;
    private javax.swing.JButton agregarLote;
    private javax.swing.JButton editLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private static javax.swing.JComboBox<String> lotesC;
    private javax.swing.JTextField name;
    private javax.swing.JToggleButton registrar;
    // End of variables declaration//GEN-END:variables
}
