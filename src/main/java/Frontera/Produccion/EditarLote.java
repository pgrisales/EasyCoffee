package Frontera.Produccion;

import Frontera.Usuarios.Registro;
import Frontera.Produccion.AgregarArbolesMuertos;
import Frontera.Produccion.AgregarArboles;
import Control.Produccion;
import Frontera.FramePrincipal;
import com.easycoffee.Arbol;
import com.easycoffee.Lote;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class EditarLote extends javax.swing.JPanel {

    private ArrayList<Arbol> arboles;
    private ArrayList<Lote> lotes;
    private Lote lote;
    private String[] unidades = {"km^2", "m^2", "hec"};
    private AgregarArboles ventanaArboles;
    private Produccion p;

    public EditarLote(ArrayList<Lote> lotes, int idLote) {
        initComponents();

        p = new Produccion();
        fechaAbonado.setCalendar(Calendar.getInstance());
        fechaDesyerbado.setCalendar(Calendar.getInstance());
        this.jComboBox1.removeAllItems();

//fechaAbonado.getCalendar().get(Calendar.DATE) + "/" + fechaAbonado.getCalendar().get(Calendar.MONTH) + "/" + fechaAbonado.getCalendar().get(Calendar.YEAR);
        for (int i = 0; i < unidades.length; i++) {
            jComboBox1.addItem(unidades[i]);
        }
        loteID.setText(lotes.size() + ""); //es aca siks
        lotesC.removeAllItems();
        double tamaño = 0;
        for (int i = 0; i < FramePrincipal.getSistem().getAdmin().getFinca().getLotes().size(); i++) {
            lotesC.addItem(i + "");
            tamaño = tamaño + FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(i).getAreaTotal();
        }
        
        //lotesC.setSelectedIndex(0);
        lotesC.setSelectedIndex(idLote);
        this.frec.removeAllItems();
        this.frec.addItem("días");
        this.frec.addItem("meses");
//        loteID.setText(lotesC.getSelectedItem().toString
        loteSelec();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        loteID = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        fechaAbonado = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaDesyerbado = new com.toedter.calendar.JDateChooser();
        areaLote = new javax.swing.JTextField();
        addArboles = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numArboles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lotesC = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        RegisArbolM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        numArbolesRec = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        frect = new javax.swing.JTextField();
        frec = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Típica", "0", "0"},
                {"Borbón", "0", "0"},
                {"Maragogipe", "0", "0"},
                {"Tabi", "0", "0"},
                {"Caturra", "0", "0"},
                {"Variedad Colombia", "0", "0"}
            },
            new String [] {
                "Variedad", "Cantidad de Arboles vivos", "Cantidad de Arboles muertos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Cuando fue la última vez que desyerbo el lote?");

        loteID.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        loteID.setForeground(new java.awt.Color(255, 255, 255));
        loteID.setText("0");

        save.setBackground(new java.awt.Color(102, 0, 0));
        save.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        fechaAbonado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tamaño del lote");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lote #");

        fechaDesyerbado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        areaLote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        areaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaLoteActionPerformed(evt);
            }
        });

        addArboles.setBackground(new java.awt.Color(0, 102, 0));
        addArboles.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        addArboles.setForeground(new java.awt.Color(255, 255, 255));
        addArboles.setText("Agregar árboles");
        addArboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArbolesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Árboles en el lote:");

        numArboles.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        numArboles.setForeground(new java.awt.Color(255, 255, 255));
        numArboles.setText("0");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Cuando fue la última vez que abonó el lote?");

        lotesC.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        lotesC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lotesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotesCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lotes registrados:");

        RegisArbolM.setBackground(new java.awt.Color(102, 0, 0));
        RegisArbolM.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        RegisArbolM.setForeground(new java.awt.Color(255, 255, 255));
        RegisArbolM.setText("Registrar arbol muerto");
        RegisArbolM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisArbolMActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de árboles recomendada:");

        numArbolesRec.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        numArbolesRec.setForeground(new java.awt.Color(255, 255, 255));
        numArbolesRec.setText("0");

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Cada cuanto desyerba el lote?");

        frect.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        frect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frectActionPerformed(evt);
            }
        });

        frec.setBackground(new java.awt.Color(0, 0, 0));
        frec.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        frec.setForeground(new java.awt.Color(255, 255, 255));
        frec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        frec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addArboles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(96, 96, 96)
                                .addComponent(RegisArbolM, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(numArboles)))
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loteID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(1, 1, 1)
                                        .addComponent(frect, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaAbonado, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(fechaDesyerbado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(frec, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(numArbolesRec)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lotesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numArbolesRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loteID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(numArboles))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(frect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addArboles, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisArbolM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (this.areaLote.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Las casilla de tamaño está vacia, por favor asegurese de rellenarla");
        } else {
                int area = Integer.parseInt(areaLote.getText());
                if (area>=0) {
                    if (Registro.isNumeric(areaLote.getText()) && Registro.isNumeric(this.frect.getText())) {//swe guarda en metros
                    if (jComboBox1.getSelectedIndex() == 0) {
                        area = area * 1000000;
                    }
                    if (jComboBox1.getSelectedIndex() == 2) {
                        area = area * 10000;
                    }
                    lote.setAreaTotal(area);
                    int frecDesy = Integer.parseInt(this.frect.getText());
                    if (this.frec.getSelectedIndex() == 1) {
                        frecDesy = frecDesy * 30;
                    }
                    lote.setFrecDesyer(frecDesy);
                    String fechabonado = fechaAbonado.getCalendar().get(Calendar.DATE) + "/" + fechaAbonado.getCalendar().get(Calendar.MONTH) + "/" + fechaAbonado.getCalendar().get(Calendar.YEAR);
                    lote.setFechaAbonado(fechabonado);
                    String fechadesyerbado = fechaDesyerbado.getCalendar().get(Calendar.DATE) + "/" + fechaDesyerbado.getCalendar().get(Calendar.MONTH) + "/" + fechaDesyerbado.getCalendar().get(Calendar.YEAR);
                    lote.setFechaDesyerbado(fechadesyerbado);
                } else {
                    JOptionPane.showMessageDialog(this, "El tamaño del lote o la frecuencia de desyerbado no se ha de manera correcta, por favor intentelo de nuevo.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El tamaño del lote o la frecuencia de desyerbado no se ha de manera correcta, por favor intentelo de nuevo.");
            }
        }
        FramePrincipal.cambiarPanel127(new EditFinca(1));
        
    }//GEN-LAST:event_saveActionPerformed
    public void setCAlendar() {
        String s = lote.getFechaAbonado();
        String ss[] = s.split("/");
        Calendar c = Calendar.getInstance();
//        System.out.println(s);
//        System.out.println(ss[2]);
        c.set(Calendar.DATE, Integer.parseInt(ss[0]));
        c.set(Calendar.MONTH, Integer.parseInt(ss[1]));
        c.set(Calendar.YEAR, Integer.parseInt(ss[2]));
        fechaAbonado.setCalendar(c);
        s = lote.getFechaDesyerbado();
        ss = s.split("/");
        c.set(Calendar.DATE, Integer.parseInt(ss[0]));
        c.set(Calendar.MONTH, Integer.parseInt(ss[1]));
        c.set(Calendar.YEAR, Integer.parseInt(ss[2]));
        fechaDesyerbado.setCalendar(c);
    }

    public void setArboles(ArrayList<Arbol> arboles) {
        this.arboles = arboles;
    }

    public void numeroArboles() {
        int[] numero = new int[6];
        int[] numeroM = new int[6];
        for (int i = 0; i < this.arboles.size(); i++) {
            switch (this.arboles.get(i).getVariedad()) {
                case "Típica": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[0]++;
                    } else {
                        numeroM[0]++;
                    }
                    break;
                }
                case "Borbón": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[1]++;
                    } else {
                        numeroM[1]++;
                    }
                    break;
                }
                case "Maragogipe": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[2]++;
                    } else {
                        numeroM[2]++;
                    }
                    break;
                }
                case "Tabi": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[3]++;
                    } else {
                        numeroM[3]++;
                    }
                    break;
                }
                case "Caturra": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[4]++;
                    } else {
                        numeroM[4]++;
                    }
                    break;
                }
                case "Variedad Colombia": {
                    if (this.arboles.get(i).isEstadoArbolVivo() == true) {
                        numero[5]++;
                    } else {
                        numeroM[5]++;
                    }
                    break;
                }
            }
            numArboles.setText((numero[0] + numero[1] + numero[2] + numero[3] + numero[4] + numero[5]) + "");
        }
        for (int i = 0; i < 6; i++) {
            this.jTable1.setValueAt(numero[i], i, 1);
            this.jTable1.setValueAt(numeroM[i], i, 2);
        }
    }

    public void setAreaLote() {
        int area = (int) lote.getAreaTotal();
        if (jComboBox1.getSelectedIndex() == 0) {
            area = area / 1000000;
        }
        if (jComboBox1.getSelectedIndex() == 2) {
            area = area / 10000;
        }
        this.areaLote.setText("" + area);
        this.numArbolesRec.setText("desde " + (int) lote.optimoEconomico()[0] + " hasta " + (int) lote.optimoEconomico()[1]);
    }

    public void loteSelec() {
        if (this.lotesC.getSelectedIndex() != -1) {
            this.ventanaArboles = new AgregarArboles(lotesC.getSelectedIndex());
            ventanaArboles.setIDlote(this.lotesC.getSelectedIndex());
            loteID.setText(this.lotesC.getSelectedItem().toString());
            lote = FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(this.lotesC.getSelectedIndex());
            arboles = lote.getArbolesVivos();
            setAreaLote();
            numeroArboles();
            setCAlendar();
            int frecDes = lote.getFrecDesyer();
            if (this.frec.getSelectedIndex() == 1) {
                frecDes = frecDes / 30;
            }
            this.frect.setText(frecDes + "");
        }
    }

    private void addArbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArbolesActionPerformed

        JOptionPane.showMessageDialog(this, ventanaArboles);
        this.arboles = ventanaArboles.getArbolesLote();
        for (int i = 0; i < arboles.size(); i++) {
            FramePrincipal.getSistem().getAdmin().getFinca().getLotes().get(this.lotesC.getSelectedIndex()).addArbol(arboles.get(i));
            
        }
        this.lotes = FramePrincipal.getSistem().getAdmin().getFinca().getLotes();
        numArboles.setText(arboles.size() + "");
        numeroArboles();
        FramePrincipal.cambiarPanel376(this);
    }//GEN-LAST:event_addArbolesActionPerformed

    private void lotesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotesCActionPerformed
        loteSelec();
    }//GEN-LAST:event_lotesCActionPerformed

    private void areaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaLoteActionPerformed

    }//GEN-LAST:event_areaLoteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        loteSelec();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void RegisArbolMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisArbolMActionPerformed
        AgregarArbolesMuertos agregar = new AgregarArbolesMuertos(lote);
        JOptionPane.showMessageDialog(this, agregar);
        this.lote = agregar.getLote();
        int numeroArboles = 0;
        for (int i = 0; i < arboles.size(); i++) {
            if (lote.getArbolesVivos().get(i).isEstadoArbolVivo() == true) {
                numeroArboles++;
            }
        }
        numArboles.setText(numeroArboles + "");
        numeroArboles();
        FramePrincipal.cambiarPanel376(this);
    }//GEN-LAST:event_RegisArbolMActionPerformed

    private void frectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frectActionPerformed

    private void frecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecActionPerformed
        loteSelec();
    }//GEN-LAST:event_frecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisArbolM;
    private javax.swing.JButton addArboles;
    private javax.swing.JTextField areaLote;
    private com.toedter.calendar.JDateChooser fechaAbonado;
    private com.toedter.calendar.JDateChooser fechaDesyerbado;
    private javax.swing.JComboBox<String> frec;
    private javax.swing.JTextField frect;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loteID;
    private static javax.swing.JComboBox<String> lotesC;
    private javax.swing.JLabel numArboles;
    private javax.swing.JLabel numArbolesRec;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
