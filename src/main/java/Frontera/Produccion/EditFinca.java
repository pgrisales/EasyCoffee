package Frontera.Produccion;

import Frontera.MenuSeleccion;
import Frontera.FramePrincipal;
import Frontera.Usuarios.EditarAuxiliar;
import Frontera.Produccion.RegistrarLote;
import Frontera.Produccion.AsignarLotes;
import Frontera.Usuarios.RegistrarTrabajador;
import Frontera.Usuarios.AgregarAuxiliar;
import Frontera.Produccion.EditarLote;
import Frontera.FramePrincipal;
import WebS.Mapa;
import com.easycoffee.Lote;
import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Nivektakedown
 */
public class EditFinca extends javax.swing.JPanel {
    private String[] unidades = {"km^2", "m^2", "hec"};
    private int cedula;
    public EditFinca(int cedula) {
        initComponents();
        this.cedula=cedula;
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
    
    public void verLote(java.awt.event.ActionEvent event, int lote){
        JOptionPane.showConfirmDialog(this, new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(),lote));
        //FramePrincipal.cambiarPanel376(new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(),lote));
        
        /*
        
        JOptionPane.showMessageDialog(this, ventanaArboles);
        this.arboles = ventanaArboles.getArbolesLote();
//        System.out.println(arboles);
        for (int i = 0; i < arboles.size(); i++) {
            FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(this.lotesC.getSelectedIndex()).addArbol(arboles.get(i));
        }
        this.lotes = FramePrincipal.getSistem().getAdmin().getFinca().getLotes();
        numArboles.setText(arboles.size() + "");
        numeroArboles();
        FramePrincipal.cambiarPanel376(this);
        */
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
        jSeparator1 = new javax.swing.JToolBar.Separator();
        editLote = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        asignarLoteB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        mapB = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        tam = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        volver = new javax.swing.JToggleButton();

        setDoubleBuffered(false);
        setMaximumSize(new java.awt.Dimension(900, 127));
        setMinimumSize(new java.awt.Dimension(900, 127));
        setPreferredSize(new java.awt.Dimension(900, 127));
        setRequestFocusEnabled(false);

        changeName.setBackground(new java.awt.Color(102, 0, 0));
        changeName.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        changeName.setForeground(new java.awt.Color(255, 255, 255));
        changeName.setText("Cambiar nombre");
        changeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        changeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tamaño de la finca:");

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(700, 27));
        jToolBar1.setMinimumSize(new java.awt.Dimension(685, 27));
        jToolBar1.setPreferredSize(new java.awt.Dimension(685, 27));

        agregarLote.setBackground(new java.awt.Color(102, 0, 0));
        agregarLote.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        agregarLote.setForeground(new java.awt.Color(255, 255, 255));
        agregarLote.setText("Agregar lote");
        agregarLote.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white), null));
        agregarLote.setFocusable(false);
        agregarLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregarLote.setMaximumSize(new java.awt.Dimension(180, 25));
        agregarLote.setMinimumSize(new java.awt.Dimension(76, 25));
        agregarLote.setPreferredSize(new java.awt.Dimension(100, 25));
        agregarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        agregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(agregarLote);
        jToolBar1.add(jSeparator1);

        editLote.setBackground(new java.awt.Color(102, 0, 0));
        editLote.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        editLote.setForeground(new java.awt.Color(255, 255, 255));
        editLote.setText("Editar lote");
        editLote.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white), null));
        editLote.setMaximumSize(new java.awt.Dimension(180, 25));
        editLote.setMinimumSize(new java.awt.Dimension(76, 25));
        editLote.setPreferredSize(new java.awt.Dimension(76, 25));
        editLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(editLote);
        jToolBar1.add(jSeparator3);

        asignarLoteB.setBackground(new java.awt.Color(102, 0, 0));
        asignarLoteB.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        asignarLoteB.setForeground(new java.awt.Color(255, 255, 255));
        asignarLoteB.setText("Asignar lote");
        asignarLoteB.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white), null));
        asignarLoteB.setFocusable(false);
        asignarLoteB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignarLoteB.setMaximumSize(new java.awt.Dimension(180, 25));
        asignarLoteB.setMinimumSize(new java.awt.Dimension(100, 25));
        asignarLoteB.setPreferredSize(new java.awt.Dimension(100, 25));
        asignarLoteB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignarLoteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarLoteBActionPerformed(evt);
            }
        });
        jToolBar1.add(asignarLoteB);
        jToolBar1.add(jSeparator2);

        mapB.setBackground(new java.awt.Color(102, 0, 0));
        mapB.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        mapB.setForeground(new java.awt.Color(255, 255, 255));
        mapB.setText("Ver lotes");
        mapB.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white), null));
        mapB.setFocusable(false);
        mapB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mapB.setMaximumSize(new java.awt.Dimension(180, 25));
        mapB.setMinimumSize(new java.awt.Dimension(100, 25));
        mapB.setPreferredSize(new java.awt.Dimension(100, 25));
        mapB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mapB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapBActionPerformed(evt);
            }
        });
        jToolBar1.add(mapB);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator7);

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

        volver.setBackground(new java.awt.Color(0, 153, 153));
        volver.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(name)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(561, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(changeName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(changeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(name)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tam)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameActionPerformed

        FramePrincipal.getSistem().getAdmin().getFinca().setNombreFinca(JOptionPane.showInputDialog("Ingrese el nombre de la finca "));
        name.setText(FramePrincipal.getSistem().getAdmin().getFinca().getNombreFinca());
        FramePrincipal.cambiarPanel127(new EditFinca(cedula));
    }//GEN-LAST:event_changeNameActionPerformed

    private void agregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLoteActionPerformed
        RegistrarLote lote = new RegistrarLote(new ArrayList<Lote>());
        agregarLote.setBackground(new Color(152, 51, 0));
        editLote.setBackground(new Color(102, 0, 0));
        asignarLoteB.setBackground(new Color(102, 0, 0));
        FramePrincipal.cambiarPanel376(lote);
    }//GEN-LAST:event_agregarLoteActionPerformed

    private void editLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLoteActionPerformed
        FramePrincipal.cambiarPanel376(new EditarLote(FramePrincipal.getSistem().getAdmin().getFinca().getLotes(),0));
        agregarLote.setBackground(new Color(102, 0, 0));
        editLote.setBackground(new Color(152, 51, 0));
        asignarLoteB.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_editLoteActionPerformed

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

    private void asignarLoteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarLoteBActionPerformed
        editLote.setBackground(new Color(102, 0, 0));
        agregarLote.setBackground(new Color(102, 0, 0));
        asignarLoteB.setBackground(new Color(152, 51, 0));
        FramePrincipal.cambiarPanel376(new AsignarLotes());
    }//GEN-LAST:event_asignarLoteBActionPerformed

    private void mapBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapBActionPerformed
       
        //WebS.Mapa1.init();
        Mapa map = new Mapa();
        JPanel panel = new JPanel();
        panel.setSize(900, 580);
        panel.setBackground(new Color(0, 0, 0, 0));
        panel.add(WebS.Mapa1.fx());
        FramePrincipal.asdf(panel);
        
        /*Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });*/
        
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });
        //FramePrincipal.asdf(WebS.Mapa1.fx());
        
        /*Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //FramePrincipal.cambiarPanel376(WebS.Mapa1.fxContainer);
                
            }
       });
        /*
        try {
            Mapa.iniciar();
        } catch (URISyntaxException ex) {
            Logger.getLogger(EditFinca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(EditFinca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditFinca.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_mapBActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        FramePrincipal.menuPanelPrincipal(false);
        FramePrincipal.cambiarPanel127(new MenuSeleccion((int) cedula));
        javax.swing.JPanel panelj = new javax.swing.JPanel();
        FramePrincipal.cambiarPanel376(panelj);
        FramePrincipal.menuDoublePanel(true);
    }//GEN-LAST:event_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarLote;
    private javax.swing.JButton asignarLoteB;
    private javax.swing.JToggleButton changeName;
    private javax.swing.JButton editLote;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton mapB;
    private javax.swing.JLabel name;
    private javax.swing.JLabel tam;
    private javax.swing.JToggleButton volver;
    // End of variables declaration//GEN-END:variables
}
