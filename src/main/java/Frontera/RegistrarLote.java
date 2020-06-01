/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Frontera.*;
import com.easycoffee.Arbol;
import com.easycoffee.Lote;
import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Control.Produccion;

public class RegistrarLote extends javax.swing.JPanel {
    private ArrayList<Lote> lotes;
    private Lote lote;
    private String[] unidades = {"km^2", "m^2", "hec"};
    private AgregarArboles loTe =new AgregarArboles(); 
    
    public RegistrarLote(ArrayList<Lote> lotes) {
        initComponents();
        arboles=new ArrayList<Arbol>();
        fechaAbonado.setCalendar(Calendar.getInstance());
        fechaDesyerbado.setCalendar(Calendar.getInstance());
        lote=null;
        
        this.lotes=lotes;
        this.jComboBox1.removeAllItems();
        for (int i = 0; i < unidades.length; i++) {
            jComboBox1.addItem(unidades[i]);
        }
        loteID.setText(lotes.size()+"");
        loTe.setArboles(arboles);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loteID = new javax.swing.JLabel();
        fechaAbonado = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaDesyerbado = new com.toedter.calendar.JDateChooser();
        areaLote = new javax.swing.JTextField();
        addArboles = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numArboles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 366));
        setMinimumSize(new java.awt.Dimension(900, 366));
        setPreferredSize(new java.awt.Dimension(900, 376));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Cuando fue la última vez que abonó el lote?");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Cuando fue la última vez que desyerbo el lote?");

        loteID.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        loteID.setForeground(new java.awt.Color(255, 255, 255));
        loteID.setText("0");

        fechaAbonado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese el tamaño del lote");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lote #");

        fechaDesyerbado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        areaLote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        addArboles.setBackground(new java.awt.Color(0, 102, 0));
        addArboles.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        addArboles.setForeground(new java.awt.Color(255, 255, 255));
        addArboles.setText("Agregar árboles");
        addArboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArbolesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Árboles en el lote:");

        numArboles.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        numArboles.setForeground(new java.awt.Color(255, 255, 255));
        numArboles.setText("0");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Típica", "0"},
                {"Borbón", "0"},
                {"Maragogipe", "0"},
                {"Tabi", "0"},
                {"Caturra", "0"},
                {"Variedad Colombia", "0"}
            },
            new String [] {
                "Variedad", "Cantidad de Arboles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        save.setBackground(new java.awt.Color(102, 0, 0));
        save.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addArboles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechaDesyerbado, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(fechaAbonado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(areaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loteID)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(numArboles)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(loteID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(areaLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(fechaAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(fechaDesyerbado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(numArboles))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addArboles, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public ArrayList<Arbol> getArboles() {
        return arboles;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
    ArrayList<Arbol> arboles;
    
    public void setArboles(ArrayList<Arbol> arboles) {
        this.arboles = arboles;
    }
    public void numeroArboles(){
        int[] numero=new int[6];
        for (int i = 0; i <this.arboles.size(); i++) {
            switch(this.arboles.get(i).getVariedad()){
                case "Típica":{
                    numero[0]++;
                    break;
                }
                case "Borbón":{
                    numero[1]++;
                    break;
                }
                case "Maragogipe":{
                    numero[2]++;
                    break;
                }
                case "Tabi":{
                    numero[3]++;
                    break;
                }
                case "Caturra":{
                    numero[4]++;
                    break;
                }
                case "Variedad Colombia":{
                    numero[5]++;
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            this.jTable1.setValueAt(numero[i], i, 1);
        }
    }
    private void addArbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArbolesActionPerformed
        
        JFrame frame = new JFrame();
        frame.setSize(500, 250); // Set the size of the window
        frame.add(loTe);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_addArbolesActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(this.areaLote.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Las casilla de tamaño está vacia, por favor asegurese de rellenarla");
        else{
            if(Registro.isNumeric(areaLote.getText())){
                int area =Integer.parseInt( areaLote.getText());//swe guarda en metros
                if(jComboBox1.getSelectedIndex()==0)
                    area=area*1000000;
                if(jComboBox1.getSelectedIndex()==2)
                    area=area*10000;
                String fechabonado=fechaAbonado.getCalendar().get(Calendar.HOUR_OF_DAY)+"/"+fechaAbonado.getCalendar().get(Calendar.MINUTE)+"/"+fechaAbonado.getCalendar().get(Calendar.SECOND);
                String fechadesyerbado=fechaDesyerbado.getCalendar().get(Calendar.HOUR_OF_DAY)+"/"+fechaDesyerbado.getCalendar().get(Calendar.MINUTE)+"/"+fechaDesyerbado.getCalendar().get(Calendar.SECOND);
                lote=new Lote((long)lotes.size(),area, fechadesyerbado, fechabonado, true);
                lote.setArbolesVivos(loTe.getLote());
                FramePrincipal.getSistem().getAdmin().getFinca().getLotes().add(lote);
                Produccion p = new Produccion();
                p.RegistrarLoteBD(lote);
                p.RegistrarArbolesVivos(lote);
            }
            else{
                JOptionPane.showMessageDialog(this, "El tamaño del lote no se ha de manera correcta, por favor intentelo de nuevo.");
            }
        }
       
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FramePrincipal.cambiarPanel376(this);
        this.arboles=loTe.getLote();
        numArboles.setText(arboles.size()+"");
        numeroArboles();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArboles;
    private javax.swing.JTextField areaLote;
    private com.toedter.calendar.JDateChooser fechaAbonado;
    private com.toedter.calendar.JDateChooser fechaDesyerbado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loteID;
    private javax.swing.JLabel numArboles;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
