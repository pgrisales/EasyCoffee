package Frontera;

import Control.Produccion;
import Frontera.FramePrincipal;
import com.easycoffee.Arbol;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class AgregarArboles extends javax.swing.JPanel {

    private int IDlote;
    private String[] variedad;
    private ArrayList<Arbol> arbolesLote;
    private int idOrigen;   //Si es {1-viene de Registrar Lote ; 2-viene de Editar Lote}
    Produccion p;

    public AgregarArboles(int idOrigen) {
        initComponents();
        arbolesLote = new ArrayList<Arbol>();
        this.IDlote = -1;
        this.variedad = new String[]{"Típica", "Borbón", "Maragogipe", "Tabi", "Caturra", "Variedad Colombia"};
        variedadC.removeAllItems();
        for (int i = 0; i < this.variedad.length; i++) {
            variedadC.addItem(this.variedad[i]);
        }
        fechaSembrado.setCalendar(Calendar.getInstance());
        arbolesLote = new ArrayList<Arbol>();
        this.idOrigen = idOrigen;
        this.p = new Produccion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        variedadC = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numArboles = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechaSembrado = new com.toedter.calendar.JDateChooser();
        agregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 200));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));

        variedadC.setBackground(new java.awt.Color(255, 255, 255));
        variedadC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        variedadC.setForeground(new java.awt.Color(0, 0, 0));
        variedadC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la variedad de los árboles");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¿Cuántos árboles desea agregar?");

        numArboles.setBackground(new java.awt.Color(255, 255, 255));
        numArboles.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numArboles.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¿Cuando se sembraron?");

        fechaSembrado.setBackground(new java.awt.Color(51, 51, 51));
        fechaSembrado.setForeground(new java.awt.Color(255, 255, 255));

        agregar.setBackground(new java.awt.Color(102, 0, 0));
        agregar.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(variedadC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numArboles)
                    .addComponent(fechaSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variedadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numArboles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fechaSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (numArboles.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese cuantos árboles desea agregar");

        } else {
            if (Registro.isNumeric(numArboles.getText()) == false) {
                JOptionPane.showMessageDialog(null, "El número de árboles no se ha digitado de manera correcta, por favor intentelo de nuevo.");
            } else {
                if (IDlote == -1) {
                    IDlote = FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size();
                }
                String fechas = fechaSembrado.getCalendar().get(Calendar.DATE) + "/" + fechaSembrado.getCalendar().get(Calendar.MONTH) + "/" + fechaSembrado.getCalendar().get(Calendar.YEAR);

                for (int i = 0; i < Integer.parseInt(numArboles.getText()); i++) {
                    arbolesLote.add(new Arbol(IDlote, true, this.variedad[this.variedadC.getSelectedIndex()], fechas));
                }
            }
        }
    }//GEN-LAST:event_agregarActionPerformed

    public int getIDlote() {
        return IDlote;
    }

    public void setIDlote(int IDlote) {
        this.IDlote = IDlote;
    }

    public ArrayList<Arbol> getArbolesLote() {
        return arbolesLote;
    }

    public void setArboles(ArrayList<Arbol> lote) {
        this.arbolesLote = lote;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private com.toedter.calendar.JDateChooser fechaSembrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numArboles;
    private javax.swing.JComboBox<String> variedadC;
    // End of variables declaration//GEN-END:variables
}
