package Frontera.Produccion;

import Frontera.Usuarios.*;
import Frontera.FramePrincipal;
import com.easycoffee.ImgTabla;
import com.easycoffee.Usuario;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Diego Felipe Lopez Avila
 */
public class Plagas extends javax.swing.JPanel {

    private int cedula;
    ArrayList<Usuario> users= FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares();
    
    private void PropiedadesTabla(){
        tabla.setDefaultRenderer(Object.class, new ImgTabla());
        String titulos[] = {"Nombre","Foto","Descripción","Tratamiento"};
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        for(int i=0; i<users.size();i++){
            String estado;
            if(users.get(i).isEstado()){
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            ImageIcon imagen = users.get(i).getImagen();
            
            model.addRow(new Object[]{users.get(i).getCedula(),
                new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))),
                users.get(i).getNombre(),
                users.get(i).getApellido(),
                estado});
        }
        
        tabla.setRowHeight(100);
        tabla.setModel(model);
        TableColumn columna = tabla.getColumn("Foto");
        columna.setPreferredWidth(100);
        columna = tabla.getColumn("Cédula");
        columna.setPreferredWidth(90);
        columna = tabla.getColumn("Nombre");
        columna.setPreferredWidth(90);
        columna = tabla.getColumn("Apellido");
        columna.setPreferredWidth(90);
        columna = tabla.getColumn("Estado");
        columna.setPreferredWidth(40);
    }
    
    public Plagas(int cedula) {
        initComponents();
        PropiedadesTabla();
        this.cedula = cedula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nLotesL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        nLotesL.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        nLotesL.setForeground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(153, 153, 153));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.red, new java.awt.Color(0, 0, 0)));
        tabla.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setEnabled(false);
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        tabla.setMaximumSize(new java.awt.Dimension(690, 690));
        tabla.setMinimumSize(new java.awt.Dimension(0, 0));
        tabla.setPreferredSize(new java.awt.Dimension(690, 690));
        tabla.setRowMargin(3);
        tabla.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabla);

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recargar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        jToggleButton1.setBackground(new java.awt.Color(102, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jToggleButton1.setText("Añadir plaga");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nLotesL, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(nLotesL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        FramePrincipal.cambiarPanel376(new CrearPlaga(cedula));
    }//GEN-LAST:event_jToggleButton1ActionPerformed
     
   
   
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nLotesL;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
