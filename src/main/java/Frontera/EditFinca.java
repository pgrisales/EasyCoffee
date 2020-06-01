package Frontera;

import com.easycoffee.Lote;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class EditFinca extends javax.swing.JPanel {
    private String[] unidades = {"km^2", "m^2", "hec"};

    public EditFinca() {
        initComponents();
        name.setText(FramePrincipal.getSistem().getAdmin().getFinca().getNombreFinca());
        double tamaño=0;
        for (int i = 0; i <FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            tamaño=tamaño+FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
        }
        this.jComboBox1.removeAllItems();
        for (int i = 0; i < unidades.length; i++) {
            jComboBox1.addItem(unidades[i]);
        }
        if(this.jComboBox1.getSelectedIndex()==0)
            tam.setText((long)tamaño/1000000+"");
        if(this.jComboBox1.getSelectedIndex()==1)
            tam.setText((long)tamaño+"");
        if(this.jComboBox1.getSelectedIndex()==2)
            tam.setText((long)tamaño/10000+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeName = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        agregarLote = new javax.swing.JButton();
        editLote = new javax.swing.JButton();
        AddTrabajador = new javax.swing.JButton();
        addAux = new javax.swing.JButton();
        asignarLotesB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        tam = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDoubleBuffered(false);
        setMaximumSize(new java.awt.Dimension(900, 127));
        setMinimumSize(new java.awt.Dimension(900, 127));
        setPreferredSize(new java.awt.Dimension(900, 127));
        setRequestFocusEnabled(false);

        changeName.setBackground(new java.awt.Color(102, 0, 0));
        changeName.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        changeName.setForeground(new java.awt.Color(255, 255, 255));
        changeName.setText("Cambiar nombre");
        changeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tamaño de la finca:");

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        editLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLoteActionPerformed(evt);
            }
        });
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

        asignarLotesB.setBackground(new java.awt.Color(102, 0, 0));
        asignarLotesB.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        asignarLotesB.setForeground(new java.awt.Color(255, 255, 255));
        asignarLotesB.setText("Asignar lotes");
        asignarLotesB.setFocusable(false);
        asignarLotesB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignarLotesB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignarLotesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarLotesBActionPerformed(evt);
            }
        });
        jToolBar1.add(asignarLotesB);

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Finca:");

        name.setBackground(new java.awt.Color(222, 222, 222));
        name.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("0");

        tam.setForeground(new java.awt.Color(255, 255, 255));
        tam.setText("0");

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(name)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(changeName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(name))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tam)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameActionPerformed

        FramePrincipal.getSistem().getAdmin().getFinca().setNombreFinca(JOptionPane.showInputDialog("Ingrese el nombre de la finca "));
        name.setText(FramePrincipal.getSistem().getAdmin().getFinca().getNombreFinca());
        FramePrincipal.cambiarPanel127(new EditFinca());
    }//GEN-LAST:event_changeNameActionPerformed

    private void agregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLoteActionPerformed
        RegistrarLote lote = new RegistrarLote(new ArrayList<Lote>());
        agregarLote.setBackground(new Color(152, 51, 0));
        AddTrabajador.setBackground(new Color(102, 0, 0));
        addAux.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(lote);
    }//GEN-LAST:event_agregarLoteActionPerformed

    private void editLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLoteActionPerformed
        FramePrincipal.cambiarPanel376(new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes()));
    }//GEN-LAST:event_editLoteActionPerformed

    private void AddTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrabajadorActionPerformed
        AddTrabajador.setBackground(new Color(152, 51, 0));
        agregarLote.setBackground(new Color(102, 0, 0));
        addAux.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(new RegistrarTrabajador());

    }//GEN-LAST:event_AddTrabajadorActionPerformed

    private void addAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuxActionPerformed
        addAux.setBackground(new Color(152, 51, 0));
        AddTrabajador.setBackground(new Color(102, 0, 0));
        agregarLote.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(new AgregarAuxiliar());
    }//GEN-LAST:event_addAuxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        double tamaño=0;
        for (int i = 0; i <FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            tamaño=tamaño+FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
        }
        if(this.jComboBox1.getSelectedIndex()==0)
            tam.setText((long)tamaño/1000000+"");
        if(this.jComboBox1.getSelectedIndex()==1)
            tam.setText((long)tamaño+"");
        if(this.jComboBox1.getSelectedIndex()==2)
            tam.setText((long)tamaño/10000+"");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void asignarLotesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarLotesBActionPerformed
        agregarLote.setBackground(new Color(152, 51, 0));
        AddTrabajador.setBackground(new Color(102, 0, 0));
        addAux.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(new AsignarLotes());
    }//GEN-LAST:event_asignarLotesBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrabajador;
    private javax.swing.JButton addAux;
    private javax.swing.JButton agregarLote;
    private javax.swing.JButton asignarLotesB;
    private javax.swing.JToggleButton changeName;
    private javax.swing.JButton editLote;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel tam;
    // End of variables declaration//GEN-END:variables
}
