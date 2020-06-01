package Frontera;

import DAO.LoteDAO;
import DAO.PermisosDAO;
import DAO.UsuarioDAO;
import com.easycoffee.Lote;
import com.easycoffee.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author GAR
 */
public class AsignarLotes extends javax.swing.JPanel {
    
    private UsuarioDAO usuariodao;
    private LoteDAO lotedao;
    private PermisosDAO permisos;
    private String error = "";
    static String fondo = "../image/cafe.jpg";
    private String[] answerA = new String[3];
    private ArrayList<Usuario> usuarios;
    
    DefaultListModel mod = new DefaultListModel();

    public AsignarLotes() {
        
        for(Usuario u: FramePrincipal.getSistem().getUsers()){
            cUsuarios.addItem(u.getNombre()+" "+u.getApellido());
            usuarios.add(u);
            
        }
        for(Lote l: FramePrincipal.getSistem().getLotes()){
            mod.addElement(Long.toString(l.getIdLote()));
        }
        initComponents();
    }
    
    public void darPermisos(Usuario usuario, int loteId){
        permisos.insertar(usuario, loteId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asignar = new javax.swing.JButton();
        cUsuarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        cLotes = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(900, 376));

        asignar.setBackground(new java.awt.Color(102, 0, 0));
        asignar.setText("Asignar");
        asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarActionPerformed(evt);
            }
        });

        cUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUsuariosActionPerformed(evt);
            }
        });

        cLotes.setModel(mod);
        jScrollPane1.setViewportView(cLotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(cUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(asignar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(asignar)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarActionPerformed

        for(String s: cLotes.getSelectedValuesList()){
            darPermisos(usuariodao.obtener(usuarios.get(cUsuarios.getSelectedIndex()).getCedula()) , Integer.valueOf(s));
        }
        
    }//GEN-LAST:event_asignarActionPerformed

    private void cUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUsuariosActionPerformed
        
    }//GEN-LAST:event_cUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignar;
    private javax.swing.JList<String> cLotes;
    private javax.swing.JComboBox<String> cUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
