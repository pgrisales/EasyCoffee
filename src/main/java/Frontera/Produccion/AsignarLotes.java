package Frontera.Produccion;

import DAO.DAOManager;
import DAO.LoteDAO;
import DAO.UsuarioDAO;
import Frontera.FramePrincipal;
import com.easycoffee.Lote;
import com.easycoffee.Usuario;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author GAR
 */
public class AsignarLotes extends javax.swing.JPanel {

    private UsuarioDAO usuariodao;
    private LoteDAO lotedao;
    private DAOManager permisos = new DAOManager();
    private String error = "";
    static String fondo = "../image/cafe.jpg";
    private String[] answerA = new String[3];
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    DefaultListModel modL = new DefaultListModel();
    //DefaultListModel modU = new DefaultListModel();

    public AsignarLotes() {
        initComponents();
        usuariosC.removeAllItems();
        if (FramePrincipal.getSistem().getUsers() != null) {
            for (Usuario u : FramePrincipal.getSistem().getUsers()) {
                usuariosC.addItem(u.getNombre() + " " + u.getApellido());
                usuarios.add(u);
            }
        }
        lotesC.removeAll();
        if (FramePrincipal.getSistem().getLotes() != null) {
            for (Lote l : FramePrincipal.getSistem().getLotes()) {
                System.out.println(l.getIdLote());
                modL.addElement(Long.toString(l.getIdLote()));
            }
            lotesC.setModel(modL);
        }
//        System.out.println(usuariosC.getSelectedIndex());
//        System.out.println(usuarios.get(usuariosC.getSelectedIndex()).getCedula());
        //System.out.println(usuariodao.obtener();
    }

    public void darPermisos(Usuario usuario, int loteId) {
        permisos.getPermisosDAO().insertar(usuario, loteId);
        usuario.getIdLotes().add(loteId);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asignar = new javax.swing.JButton();
        usuariosC = new javax.swing.JComboBox<>();
        lotesC = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(900, 376));

        asignar.setBackground(new java.awt.Color(102, 0, 0));
        asignar.setForeground(new java.awt.Color(255, 255, 255));
        asignar.setText("Asignar");
        asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarActionPerformed(evt);
            }
        });

        usuariosC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuariosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosCActionPerformed(evt);
            }
        });

        lotesC.setBackground(new java.awt.Color(0, 0, 0));
        lotesC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lotesC.setForeground(new java.awt.Color(255, 255, 255));
        lotesC.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(usuariosC, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(asignar)))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(usuariosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asignar)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarActionPerformed

        for (String s : lotesC.getSelectedValuesList()) {
            darPermisos(usuarios.get(usuariosC.getSelectedIndex()), Integer.valueOf(s));
//            System.out.println("SELECT VALUES OF LOTE " + s);
        }

    }//GEN-LAST:event_asignarActionPerformed

    private void usuariosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariosCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignar;
    private javax.swing.JList<String> lotesC;
    private javax.swing.JComboBox<String> usuariosC;
    // End of variables declaration//GEN-END:variables
}
