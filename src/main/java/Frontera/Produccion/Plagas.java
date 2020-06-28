package Frontera.Produccion;

import Frontera.Usuarios.*;
import Frontera.FramePrincipal;
import com.easycoffee.ImgTabla;
import com.easycoffee.Plaga;
import com.easycoffee.Usuario;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Diego Felipe Lopez Avila
 */
public class Plagas extends javax.swing.JPanel {

    private int cedula;
    ArrayList<Plaga> plagas= FramePrincipal.getSistem().getAdmin().getFinca().getPlagas();
    
    private void PropiedadesTabla(){
        tabla.setDefaultRenderer(Object.class, new ImgTabla());
        String titulos[] = {"Nombre de la plaga","Foto","Descripción","Tratamiento"};
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        for(int i=0; i<plagas.size();i++){
            
            ImageIcon imagen = plagas.get(i).getImagen();
            
            model.addRow(new Object[]{plagas.get(i).getNombrePlaga(),
                new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))),
                plagas.get(i).getDescripcionPlaga(),
                plagas.get(i).getTratamientoPlaga()
            });
        }
        
        tabla.setRowHeight(100);
        tabla.setModel(model);
        TableColumn columna = tabla.getColumn("Foto");
        columna.setPreferredWidth(100);
        columna = tabla.getColumn("Nombre de la plaga");
        columna.setPreferredWidth(90);
        columna = tabla.getColumn("Descripción");
        columna.setPreferredWidth(300);
        columna = tabla.getColumn("Tratamiento");
        columna.setPreferredWidth(300);
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
        añadir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JToggleButton();
        nombre = new javax.swing.JTextField();
        recargar = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        nLotesL.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        nLotesL.setForeground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(102, 102, 102));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        tabla.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tabla.setMinimumSize(new java.awt.Dimension(100, 100));
        tabla.setRowHeight(100);
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

        añadir.setBackground(new java.awt.Color(102, 0, 0));
        añadir.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        añadir.setForeground(new java.awt.Color(255, 255, 255));
        añadir.setText("Añadir plaga");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de plaga:");

        buscar.setBackground(new java.awt.Color(102, 0, 0));
        buscar.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));

        recargar.setBackground(new java.awt.Color(102, 0, 0));
        recargar.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        recargar.setForeground(new java.awt.Color(255, 255, 255));
        recargar.setText("Recargar");
        recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(176, 176, 176)
                .addComponent(nLotesL, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nLotesL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(769, 769, 769)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        FramePrincipal.cambiarPanel376(new CrearPlaga(cedula));
    }//GEN-LAST:event_añadirActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(!nombre.getText().equals("")){
        tabla.setDefaultRenderer(Object.class, new ImgTabla());
        String titulos[] = {"Nombre","Foto","Descripción","Tratamiento"};
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        for(int i=0; i<plagas.size();i++){
            if(plagas.get(i).getNombrePlaga().equals(nombre.getText())){
                ImageIcon imagen = plagas.get(i).getImagen();

                model.addRow(new Object[]{plagas.get(i).getNombrePlaga(),
                    new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))),
                    plagas.get(i).getDescripcionPlaga(),
                    plagas.get(i).getTratamientoPlaga()
                });
            }
        }
        
        tabla.setRowHeight(100);
        tabla.setModel(model);
        TableColumn columna = tabla.getColumn("Foto");
        columna.setPreferredWidth(100);
        columna = tabla.getColumn("Nombre");
        columna.setPreferredWidth(90);
        columna = tabla.getColumn("Descripción");
        columna.setPreferredWidth(300);
        columna = tabla.getColumn("Tratamiento");
        columna.setPreferredWidth(300);
        }else{
            JOptionPane.showMessageDialog(null, "No ingresó el nombre de la plaga.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarActionPerformed
        PropiedadesTabla();
    }//GEN-LAST:event_recargarActionPerformed
     
   
   
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton añadir;
    private javax.swing.JToggleButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nLotesL;
    private javax.swing.JTextField nombre;
    private javax.swing.JToggleButton recargar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
