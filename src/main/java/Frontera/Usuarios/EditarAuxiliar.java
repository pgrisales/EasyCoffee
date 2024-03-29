package Frontera.Usuarios;

import Control.ControlUsuarios;
import DAO.PersonaDAO;
import Frontera.FramePrincipal;
import Frontera.FramePrincipal;
import com.easycoffee.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author GAR
 */
public class EditarAuxiliar extends javax.swing.JPanel {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ControlUsuarios cambios = new ControlUsuarios();
    private int cedula;
    private static int count = 1;
    private String ruta;
    
    public EditarAuxiliar(int cedula) {
        initComponents();
        usuariosC.removeAllItems();
        if(FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares() != null){
            for(Usuario u: FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares()){
                usuarios.add(u);
                usuariosC.addItem(u.getNombre()+" "+u.getApellido());
             }
        }
        this.cedula = cedula;
        
        //updateUsuarios(usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuariosC = new javax.swing.JComboBox<>();
        nombresL = new javax.swing.JLabel();
        apellidosL = new javax.swing.JLabel();
        cedulaL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        activarB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nLotesL = new javax.swing.JLabel();
        imgUsu = new javax.swing.JLabel();
        actualizar = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        usuariosC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuariosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosCActionPerformed(evt);
            }
        });

        nombresL.setForeground(new java.awt.Color(255, 255, 255));

        apellidosL.setForeground(new java.awt.Color(255, 255, 255));

        cedulaL.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informacion");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombres");

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellidos");

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cedula");

        estadoL.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado");

        activarB.setBackground(new java.awt.Color(102, 0, 0));
        activarB.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        activarB.setForeground(new java.awt.Color(255, 255, 255));
        activarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lotes asignados");

        nLotesL.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        nLotesL.setForeground(new java.awt.Color(255, 255, 255));

        imgUsu.setBackground(new java.awt.Color(0, 0, 0));
        imgUsu.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        imgUsu.setForeground(new java.awt.Color(255, 255, 255));
        imgUsu.setPreferredSize(new java.awt.Dimension(200, 200));
        imgUsu.setVerifyInputWhenFocusTarget(false);

        actualizar.setBackground(new java.awt.Color(102, 0, 0));
        actualizar.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar foto");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuariosC, 0, 143, Short.MAX_VALUE)
                    .addComponent(activarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombresL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellidosL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cedulaL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(estadoL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nLotesL, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(estadoL, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombresL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidosL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuariosC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(activarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nLotesL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosCActionPerformed
        showInfo();
        if(usuariosC.getSelectedIndex() > -1 && usuarios.size() > 0 ){
            if(FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares().get(usuariosC.getSelectedIndex()).getImagen()!= null){
                imgUsu.setText("");
                ImageIcon imagen = FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares().get(usuariosC.getSelectedIndex()).getImagen();
                imgUsu.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
            }else{
                imgUsu.setIcon(null);
                imgUsu.setText("NO HAY IMÁGEN");
            }
        }
    }//GEN-LAST:event_usuariosCActionPerformed

    private void activarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarBActionPerformed
        updateUsuarios(usuarios);
        if(usuarios.get(usuariosC.getSelectedIndex()).isEstado()){
            usuarios.get(usuariosC.getSelectedIndex()).setEstado(false);
            cambios.setEstadoPersona(usuarios.get(usuariosC.getSelectedIndex()).getCedula(), false);
        }else{
            usuarios.get(usuariosC.getSelectedIndex()).setEstado(true);
            cambios.setEstadoPersona(usuarios.get(usuariosC.getSelectedIndex()).getCedula(), true);
        }
        showEstado();
        
    }//GEN-LAST:event_activarBActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        JFileChooser j = new JFileChooser();
        j.setDialogTitle("Buscar imágen");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg");
        j.setFileFilter(filter);
        String ruta = "";
        int ap = j.showOpenDialog(this);
        FileInputStream fi = null;
        if(ap == JFileChooser.APPROVE_OPTION){
            ruta = j.getSelectedFile().getAbsolutePath();
            
            imgUsu.setText(null);
            ImageIcon imagen = new ImageIcon(ruta);
            imgUsu.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imgUsu.getWidth(), imgUsu.getHeight(), Image.SCALE_SMOOTH)));
            ControlUsuarios u = new ControlUsuarios();
            FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares().get(usuariosC.getSelectedIndex()).setImagen(imagen);
           try {
               u.registrarFotoUsuario(FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares().get(usuariosC.getSelectedIndex()).getCedula().intValue(), ruta);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(EditarAuxiliar.class.getName()).log(Level.SEVERE, null, ex);
               ex.printStackTrace();
           }
        }
        
    }//GEN-LAST:event_actualizarActionPerformed
     
    private void updateUsuarios(ArrayList<Usuario> usuarios){
        usuarios = FramePrincipal.getSistem().getUsers();
    }
    private void showEstado(){
        String estado = "";
        if(usuarios.get(usuariosC.getSelectedIndex()).isEstado()){
            estado = "Activo";
            activarB.setText("Desactivar");
        }else{
            estado = "Inactivo";
            activarB.setText("Activar");
        }
        estadoL.setText(estado);
        FramePrincipal.cambiarPanel376(this);
    }
   
    private void showInfo(){
        if(usuariosC.getSelectedIndex() > -1 && usuarios.size() > 0){
            showEstado();
            nombresL.setText(usuarios.get(usuariosC.getSelectedIndex()).getNombre());
            apellidosL.setText(usuarios.get(usuariosC.getSelectedIndex()).getApellido());
            cedulaL.setText(String.valueOf(usuarios.get(usuariosC.getSelectedIndex()).getCedula()));
            //System.out.println(usuarios.get(usuariosC.getSelectedIndex()).getIdLotes());
            //System.out.println(usuarios.get(usuariosC.getSelectedIndex()).getIdLotes().size());
            if(usuarios.get(usuariosC.getSelectedIndex()).getIdLotes() != null){
                if(usuarios.get(usuariosC.getSelectedIndex()).getIdLotes().size() > 0){
                    nLotesL.setText(String.valueOf(usuarios.get(usuariosC.getSelectedIndex()).getIdLotes().size()));
                }else{
                        nLotesL.setText("No tiene lotes asignados");
                }
            }
        }
        //System.out.println(usuariosC.getSelectedIndex());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarB;
    private javax.swing.JToggleButton actualizar;
    private javax.swing.JLabel apellidosL;
    private javax.swing.JLabel cedulaL;
    private javax.swing.JLabel estadoL;
    private javax.swing.JLabel imgUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nLotesL;
    private javax.swing.JLabel nombresL;
    private javax.swing.JComboBox<String> usuariosC;
    // End of variables declaration//GEN-END:variables
}
