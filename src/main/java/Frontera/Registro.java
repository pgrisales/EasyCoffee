package Frontera;
import com.easycoffee.Administrador;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class Registro extends javax.swing.JPanel {
    private String error="";
    static String fondo = "../image/cafe.jpg";
    private String[] answerA=new String[3];
    
    public Registro() {
        
        initComponents();
        questions.removeAllItems();
        for(int i=0;i<FramePrincipal.preguntas.length;i++){
            questions.addItem(FramePrincipal.preguntas[i]);
        }
        
    }
    public  boolean Preguntas() {
        boolean b=true;
        for (int i = 0; i < 3; i++) {
            if(answerA[i]==null)
                b= false;
        }
        return b;
    }
    public static boolean isNumeric(String s){
	try {
		Integer.parseInt(s);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    public boolean datosCorrectos(){
        boolean b=true;
        String p=password.getText();
        String pc=passwordConfirm.getText();
        String nm=nombres.getText();
        String ap=apellidos.getText();
        
        if(p.equals("")==true||pc.equals("")==true||nm.equals("")==true||ap.equals("")==true){
                error="empty";
                b=false;       
        }
        else{
            if(isNumeric(cedula.getText())==false){
                error="cedulaIn";
                b=false;
            }
            else{
                if((p.equals(pc)==false)){
                    error="passwordIn";
                    b=false;
                }
                else if(Preguntas()==false){
                    error="answer";
                    b=false; 
                }
                else if((ap.length()<15&&ap.length()>3&&nm.length()<15&&nm.length()>3)==false){
                    error="nombreApellidoIn";
                    b=false;
                }
            }
        }
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registration = new javax.swing.JButton();
        apellidos = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        registration1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        passwordConfirm = new javax.swing.JPasswordField();
        check = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        inf = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        questions = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        saveAnswer = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 503));
        setMinimumSize(new java.awt.Dimension(900, 503));
        setPreferredSize(new java.awt.Dimension(900, 503));

        registration.setBackground(new java.awt.Color(102, 0, 0));
        registration.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("Registrar");
        registration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        apellidos.setBackground(new java.awt.Color(0, 0, 0));
        apellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(255, 255, 255));
        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        nombres.setBackground(new java.awt.Color(0, 0, 0));
        nombres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombres.setForeground(new java.awt.Color(255, 255, 255));
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));

        registration1.setBackground(new java.awt.Color(102, 0, 0));
        registration1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        registration1.setForeground(new java.awt.Color(255, 255, 255));
        registration1.setText("Cancelar");
        registration1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registration1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar contraseña");

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));

        passwordConfirm.setBackground(new java.awt.Color(0, 0, 0));
        passwordConfirm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passwordConfirm.setForeground(new java.awt.Color(255, 255, 255));

        check.setBackground(new java.awt.Color(0, 0, 0));
        check.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Mostrar");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 0, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear usuario administrador");

        inf.setBackground(new java.awt.Color(0, 153, 153));
        inf.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        inf.setForeground(new java.awt.Color(255, 255, 255));
        inf.setText("Información ");
        inf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pregunta de seguridad");

        questions.setBackground(new java.awt.Color(0, 0, 0));
        questions.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        questions.setForeground(new java.awt.Color(255, 255, 255));
        questions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        questions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Respuesta");

        answer.setBackground(new java.awt.Color(0, 0, 0));
        answer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(255, 255, 255));

        saveAnswer.setBackground(new java.awt.Color(153, 51, 0));
        saveAnswer.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        saveAnswer.setForeground(new java.awt.Color(255, 255, 255));
        saveAnswer.setText("Guardar respuesta");
        saveAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        saveAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(16, 16, 16)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(registration1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                            .addComponent(saveAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(answer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(inf))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registration1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        if(datosCorrectos() == true){
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            FramePrincipal.setAdmin(new Administrador(password.getText(),(long)Integer.parseInt(cedula.getText()), nombres.getText(), apellidos.getText(), true,answerA[0],answerA[1],answerA[2]));

        }else{
            switch(error){
                case "passwordIn":{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, intentelo.");
                    break;
                }
                case "NombreApellidoIn":{
                    JOptionPane.showMessageDialog(null, "Los nombres o apellidos no se han digitado de manera correcta, por favor intentelo de nuevo.");
                    break;
                }
                case "cedulaIn":{
                    JOptionPane.showMessageDialog(null, "la cedula no se ha digitado de manera correcta, por favor intentelo de nuevo.");
                    break;
                }
                case "empty" :{
                    JOptionPane.showMessageDialog(null, "Una de las casillas está vacia, por favor asegurese de rellenar todas las casillas");
                    break;
                }
                case "answer" :{
                    JOptionPane.showMessageDialog(null, "Por favor responda todas las preguntas de seguridad");
                    break;
                }
            }
        }
    }//GEN-LAST:event_registrationActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void registration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registration1ActionPerformed
        FramePrincipal.cambiarPanel(new Ingreso());
    }//GEN-LAST:event_registration1ActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()==true){
            password.setEchoChar((char)0);
            passwordConfirm.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('•');
            passwordConfirm.setEchoChar('•');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        JOptionPane.showMessageDialog(null, "El usuario que va a crear a continuación es el que tiene el control del programa. procure no olvidar la contraseña.");
    }//GEN-LAST:event_infActionPerformed

    private void saveAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAnswerActionPerformed
        if(answer.getText().equals(error))
             JOptionPane.showMessageDialog(null, "La casilla de respuesta está vacia, por favor asegurese de rellenarla");
        else{
            System.out.println(questions.getSelectedIndex());
            answerA[questions.getSelectedIndex()]=answer.getText();
        }
    }//GEN-LAST:event_saveAnswerActionPerformed

    private void questionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombres;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordConfirm;
    private javax.swing.JComboBox<String> questions;
    private javax.swing.JButton registration;
    private javax.swing.JButton registration1;
    private javax.swing.JButton saveAnswer;
    // End of variables declaration//GEN-END:variables
}
