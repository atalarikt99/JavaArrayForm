/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
public class FormDokter extends javax.swing.JFrame {

    /**
     * Creates new form FormDokter
     */
    public FormDokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtalamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtusia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtjenis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtgol = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtstatus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtkewar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtwaktu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtspesial = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Humnst777 Blk BT", 1, 24)); // NOI18N
        jLabel1.setText("Pekerja Terbaik");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 230, 60);

        jLabel2.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        jLabel2.setText("Daftar Pekerja");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 100, 120, 40);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sergei Ivanovich", "Rasyid Hakam", "Deepak Pranatham" }));
        jconadokt.setToolTipText("");
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(220, 100, 140, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        jPanel1.setLayout(null);

        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 40, 30);

        jtxtnama.setEditable(false);
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(150, 30, 210, 30);

        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 50, 30);

        jtxtalamat.setEditable(false);
        jPanel1.add(jtxtalamat);
        jtxtalamat.setBounds(150, 70, 210, 30);

        jLabel6.setText("Usia");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 110, 50, 30);

        jtxtusia.setEditable(false);
        jPanel1.add(jtxtusia);
        jtxtusia.setBounds(150, 110, 210, 30);

        jLabel7.setText("Jenis Kelamin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 150, 110, 30);

        jtxtjenis.setEditable(false);
        jPanel1.add(jtxtjenis);
        jtxtjenis.setBounds(150, 150, 210, 30);

        jLabel8.setText("Golongan Darah");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 190, 110, 30);

        jtxtgol.setEditable(false);
        jPanel1.add(jtxtgol);
        jtxtgol.setBounds(150, 190, 210, 30);

        jLabel9.setText("Tingkat");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 230, 70, 30);

        jtxtstatus.setEditable(false);
        jPanel1.add(jtxtstatus);
        jtxtstatus.setBounds(150, 230, 210, 30);

        jLabel10.setText("Kewarganegaraan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 270, 130, 30);

        jtxtkewar.setEditable(false);
        jPanel1.add(jtxtkewar);
        jtxtkewar.setBounds(150, 270, 210, 30);

        jLabel11.setText("Jam Kerja");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 310, 90, 30);

        jtxtwaktu.setEditable(false);
        jPanel1.add(jtxtwaktu);
        jtxtwaktu.setBounds(150, 310, 210, 30);

        jLabel12.setText("Peran");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 350, 100, 30);

        jtxtspesial.setEditable(false);
        jPanel1.add(jtxtspesial);
        jtxtspesial.setBounds(150, 350, 210, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 180, 400, 400);

        setBounds(0, 0, 512, 643);
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
        if(jconadokt.getSelectedItem().equals("Sergei Ivanovich")){ 
            jtxtnama.setText("Sergei Ivanovich "); 
            jtxtalamat.setText("Jl. Surabaya 16, Malang"); 
            jtxtusia.setText("28 Tahun"); 
            jtxtjenis.setText("Laki-Laki"); 
            jtxtgol.setText("A"); 
            jtxtstatus.setText("Divisi 3 "); 
            jtxtkewar.setText("Rusia"); 
            jtxtspesial.setText("Pimpinan Pemrograman"); 
            jtxtwaktu.setText(" Pagi (07.00-15.00)"); 
        } 
        else if(jconadokt.getSelectedItem().equals("Rasyid Hakam")){ 
            jtxtnama.setText("Rasyid Hakam"); 
            jtxtalamat.setText("Jl. Veteran 3, Malang"); 
            jtxtusia.setText("23 Tahun"); 
            jtxtjenis.setText("Laki-Laki"); 
            jtxtgol.setText("O"); 
            jtxtstatus.setText("Divisi 1");
            jtxtkewar.setText("Indonesia"); 
            jtxtspesial.setText("Desainer"); 
            jtxtwaktu.setText(" Sore (16.00-22.00)"); 
        } 
        else if(jconadokt.getSelectedItem().equals("Deepak Pranatham")){ 
            jtxtnama.setText("Deepak Pranatham "); 
            jtxtalamat.setText("Jl. Bandung 9, Malang"); 
            jtxtusia.setText("23 Tahun"); 
            jtxtjenis.setText("Laki-Laki"); 
            jtxtgol.setText("B"); 
            jtxtstatus.setText("Divisi 2"); 
            jtxtkewar.setText("India"); 
            jtxtspesial.setText("Konsultan"); 
            jtxtwaktu.setText(" Malam (22.00-06.00)"); 
        } 
    }//GEN-LAST:event_jconadoktActionPerformed

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
            java.util.logging.Logger.getLogger(FormDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
