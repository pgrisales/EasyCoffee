package Frontera;

import Control.ControlUsuarios;
import com.easycoffee.Lote;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class RegistroFinca extends javax.swing.JPanel {

    private String[] lotes = new String[]{};
    private String[] unidades = {"km^2", "m^2", "hec"};
    private int cedula;
    private ControlUsuarios c;

    public RegistroFinca(int cedula) {
        initComponents();
        this.cedula = cedula;
        double tamaño = 0;
        this.jComboBox1.removeAllItems();
        this.c = new ControlUsuarios();
        for (int i = 0; i < unidades.length; i++) {
            jComboBox1.addItem(unidades[i]);
        }
        for (int i = 0; i < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            tamaño = tamaño + FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
        }
        if (this.jComboBox1.getSelectedIndex() == 0) {
            tam.setText((long) tamaño / 1000000 + "");
        }
        if (this.jComboBox1.getSelectedIndex() == 2) {
            tam.setText((long) tamaño / 10000 + "");
        }
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
        tam = new javax.swing.JLabel();
        terminarRegistro = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jToolBar1 = new javax.swing.JToolBar();
        agregarLote = new javax.swing.JButton();
        addAux = new javax.swing.JButton();
        AddTrabajador = new javax.swing.JButton();
        editLote = new javax.swing.JButton();
        asignarLotesB = new javax.swing.JButton();

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

        registrar.setBackground(new java.awt.Color(102, 0, 0));
        registrar.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tamaño de la finca:");

        tam.setForeground(new java.awt.Color(255, 255, 255));
        tam.setText("0");

        terminarRegistro.setBackground(new java.awt.Color(102, 0, 0));
        terminarRegistro.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        terminarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        terminarRegistro.setText("Terminar Registro");
        terminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarRegistroActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        agregarLote.setBackground(new java.awt.Color(102, 0, 0));
        agregarLote.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        agregarLote.setForeground(new java.awt.Color(255, 255, 255));
        agregarLote.setText("Agregar lote");
        agregarLote.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        agregarLote.setFocusable(false);
        agregarLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        agregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(agregarLote);

        addAux.setBackground(new java.awt.Color(102, 0, 0));
        addAux.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addAux.setForeground(new java.awt.Color(255, 255, 255));
        addAux.setText("Agregar auxiliar");
        addAux.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addAux.setFocusable(false);
        addAux.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addAux.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuxActionPerformed(evt);
            }
        });
        jToolBar1.add(addAux);

        AddTrabajador.setBackground(new java.awt.Color(102, 0, 0));
        AddTrabajador.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        AddTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        AddTrabajador.setText("Agregar trabajador");
        AddTrabajador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AddTrabajador.setFocusable(false);
        AddTrabajador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddTrabajador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrabajadorActionPerformed(evt);
            }
        });
        jToolBar1.add(AddTrabajador);

        editLote.setBackground(new java.awt.Color(102, 0, 0));
        editLote.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        editLote.setForeground(new java.awt.Color(255, 255, 255));
        editLote.setText("Editar lote");
        editLote.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editLote.setFocusable(false);
        editLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(editLote);

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

        jLayeredPane1.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(registrar))
                    .addComponent(name))
                .addGap(229, 229, 229)
                .addComponent(terminarRegistro)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tam)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(terminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "Puedes modificar los datos registrados accediendo a editar finca en la barra de tareas.");
        if (name.getText().equals("")) {
            JOptionPane.showMessageDialog(jMenu1, "Por favor ingresa un Nombre para la Finca.");
        } else {
            FramePrincipal.getSistem().getAdmin().getFinca().setNombreFinca(name.getText());
            c.almacenarFinca(FramePrincipal.getSistem().getAdmin().getFinca());
            FramePrincipal.menuDoublePanel(true);
            FramePrincipal.cambiarPanel127(new EditFinca(cedula));
            FramePrincipal.menuPanelPrincipal(false);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void agregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLoteActionPerformed
        RegistrarLote lote = new RegistrarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes());
        agregarLote.setBackground(new Color(152, 51, 0));
        AddTrabajador.setBackground(new Color(102, 0, 0));
        addAux.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(lote);

    }//GEN-LAST:event_agregarLoteActionPerformed

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

    private void editLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLoteActionPerformed
        FramePrincipal.cambiarPanel376(new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(), 0));
    }//GEN-LAST:event_editLoteActionPerformed

    private void terminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarRegistroActionPerformed
        if (FramePrincipal.sistem.getAdmin().getFinca().getNombreFinca().equals("")) {
            JOptionPane.showMessageDialog(jMenu1, "La Finca NO tiene un Nombre Registrado, por favor ingresa uno.");
        } else {
            FramePrincipal.cambiarPanel127(new MenuSeleccion(cedula));
            javax.swing.JPanel panelj = new javax.swing.JPanel();
            FramePrincipal.cambiarPanel376(panelj);
        }
    }//GEN-LAST:event_terminarRegistroActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        double tamaño = 0;
        for (int i = 0; i < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            tamaño = tamaño + FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
        }
        if (this.jComboBox1.getSelectedIndex() == 0) {
            tam.setText((long) tamaño / 1000000 + "");
        }
        if (this.jComboBox1.getSelectedIndex() == 1) {
            tam.setText((long) tamaño + "");
        }
        if (this.jComboBox1.getSelectedIndex() == 2) {
            tam.setText((long) tamaño / 10000 + "");
        }
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
    private javax.swing.JButton editLote;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField name;
    private javax.swing.JToggleButton registrar;
    private javax.swing.JLabel tam;
    private javax.swing.JToggleButton terminarRegistro;
    // End of variables declaration//GEN-END:variables
}
