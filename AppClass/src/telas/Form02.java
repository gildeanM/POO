
package telas;

public class Form02 extends javax.swing.JFrame {

  
    public Form02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Despesas Pessoais");
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(51, 48, 0, 0);

        jLabel2.setText("Nome: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 50, 50, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 50, 64, 22);

        jLabel3.setText("Apelido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 60, 16);

        jLabel4.setText("Departamento:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 100, 16);

        jLabel5.setText("Data:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(87, 190, 40, 16);

        jLabel6.setText("Quantia:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 240, 60, 16);

        jLabel7.setText("Descrição:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 290, 60, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 90, 64, 22);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(150, 140, 72, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 190, 64, 22);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(150, 240, 64, 22);

        jCheckBox1.setText("Recebido?");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(250, 240, 90, 20);

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 290, 218, 77);

        jButton1.setText("OK");
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 400, 90, 23);

        jButton2.setText("Limpar");
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 400, 93, 23);

        jButton3.setText("Cancelar");
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 400, 84, 23);

        setSize(new java.awt.Dimension(448, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
