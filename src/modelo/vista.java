/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class vista extends javax.swing.JFrame {
    String equis = "X";
    int contadorX;
    int contadorO;
    String jugadorX;
    String jugadorO;

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        nombreX();
        nombreO();
    }
    public void nombreX(){
        jugadorX = JOptionPane.showInputDialog("Inserte el nombre del Jugador de las X");
        jLabel1.setText(jugadorX);
    }
    public void nombreO(){
        jugadorO = JOptionPane.showInputDialog("Inserte el nombre del Jugador de los O");
        jLabel2.setText(jugadorO);
    }    
public void ganador(){
    String buno = jButton1.getText();
    String bdos = jButton2.getText();
    String btres = jButton3.getText();
    String bcuatro = jButton4.getText();
    String bcinco = jButton5.getText();
    String bseis = jButton6.getText();
    String bsiete = jButton7.getText();
    String bocho = jButton8.getText();
    String bnueve = jButton9.getText();
    
    if (buno.equals("X") && bdos.equals("X") && btres.equals("X")){
        victoriaX();
    }
    if (bcuatro.equals("X") && bcinco.equals("X") && bseis.equals("X")){
        victoriaX();
    }
    if (bsiete.equals("X") && bocho.equals("X") && bnueve.equals("X")){
        victoriaX();
    }
    if (buno.equals("X") && bcuatro.equals("X") && bsiete.equals("X")){
        victoriaX();
    }
    if (bdos.equals("X") && bcinco.equals("X") && bocho.equals("X")){
        victoriaX();
    }
    if (btres.equals("X") && bseis.equals("X") && bnueve.equals("X")){
        victoriaX();
    }    
    if (buno.equals("X") && bcinco.equals("X") && bnueve.equals("X")){
        victoriaX();
    }    
    if (btres.equals("X") && bcinco.equals("X") && bsiete.equals("X")){
        victoriaX();
    }   
    if (buno.equals("O") && bdos.equals("O") && btres.equals("O")){
        victoriaO();
    }
    if (bcuatro.equals("O") && bcinco.equals("O") && bseis.equals("O")){
        victoriaO();
    }
    if (bsiete.equals("O") && bocho.equals("O") && bnueve.equals("O")){
        victoriaO();
    }
    if (buno.equals("O") && bcuatro.equals("O") && bsiete.equals("O")){
        victoriaO();
    }
    if (bdos.equals("O") && bcinco.equals("O") && bocho.equals("O")){
        victoriaO();
    }
    if (btres.equals("O") && bseis.equals("O") && bnueve.equals("O")){
        victoriaO();
    }    
    if (buno.equals("O") && bcinco.equals("O") && bnueve.equals("O")){
        victoriaO();
    }    
    if (btres.equals("O") && bcinco.equals("O") && bsiete.equals("O")){
        victoriaO();
    }   
    
    
}
public void empate(){
    String buno = jButton1.getText();
    String bdos = jButton2.getText();
    String btres = jButton3.getText();
    String bcuatro = jButton4.getText();
    String bcinco = jButton5.getText();
    String bseis = jButton6.getText();
    String bsiete = jButton7.getText();
    String bocho = jButton8.getText();
    String bnueve = jButton9.getText();
    if (buno !="" && bdos != "" && btres !="" && bcuatro !=""
            && bcinco !="" && bseis !="" && bsiete !="" && bocho !="" && bnueve !="") {
        JOptionPane.showMessageDialog(null,"Empate");
        nuevoJuego();
    
    }
}
public void victoriaX(){
    JOptionPane.showMessageDialog(null,jugadorX,"Gana",1);
    nuevoJuego();
    contadorX +=1;
    String contadorX1 = String.valueOf(contadorX);
    jTextField1.setText(contadorX1);
}
public void victoriaO(){
    JOptionPane.showMessageDialog(null,jugadorO,"Gana",1);
    nuevoJuego();
    contadorO +=1;
    String contadorO1 = String.valueOf(contadorO);
    jTextField2.setText(contadorO1);
}
public void nuevoJuego(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setText("Reiniciar marcador");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador X");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jugador O");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(equis);
        if (equis.equals("X")) {
            equis = "O";
        }else{
            equis = "X";
        }
        ganador();
        empate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        contadorX = 0;
        contadorO = 0;
        String contadorX1 = String.valueOf(contadorX);
        jTextField1.setText(contadorX1);
        String contadorO1 = String.valueOf(contadorO);
        jTextField2.setText(contadorO1);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
