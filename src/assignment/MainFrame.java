package assignment;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnTable1 = new javax.swing.JButton();
        BtnTable2 = new javax.swing.JButton();
        BtnTable3 = new javax.swing.JButton();
        BtnTable4 = new javax.swing.JButton();
        BtnTable5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMRefresh = new javax.swing.JMenuItem();
        JMExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTable1ActionPerformed(evt);
            }
        });

        BtnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTable2ActionPerformed(evt);
            }
        });

        BtnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTable3ActionPerformed(evt);
            }
        });

        BtnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTable4ActionPerformed(evt);
            }
        });

        BtnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTable5ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Year:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Month:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Get Bookings");

        jMenu1.setText("File");

        JMRefresh.setText("Refresh Bookings");
        JMRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRefreshActionPerformed(evt);
            }
        });
        jMenu1.add(JMRefresh);

        JMExit.setText("Exit");
        JMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMExitActionPerformed(evt);
            }
        });
        jMenu1.add(JMExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        JMAbout.setText("About");
        JMAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMAboutActionPerformed(evt);
            }
        });
        jMenu2.add(JMAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(BtnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable1ActionPerformed
        
    }//GEN-LAST:event_BtnTable1ActionPerformed

    private void BtnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable2ActionPerformed
        
    }//GEN-LAST:event_BtnTable2ActionPerformed

    private void BtnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable3ActionPerformed
        
    }//GEN-LAST:event_BtnTable3ActionPerformed

    private void BtnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable4ActionPerformed
        
    }//GEN-LAST:event_BtnTable4ActionPerformed

    private void BtnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable5ActionPerformed
        
    }//GEN-LAST:event_BtnTable5ActionPerformed

    private void JMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMExitActionPerformed
        int exit = JOptionPane.showConfirmDialog(null, "Exit Program?", "Exit",JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_JMExitActionPerformed

    private void JMRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRefreshActionPerformed
        setup();
    }//GEN-LAST:event_JMRefreshActionPerformed

    private void JMAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMAboutActionPerformed
        AboutFrame af = new AboutFrame();
        af.openFrame();
    }//GEN-LAST:event_JMAboutActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setup();
            }
        });
    }
    
    //Attributes
    ArrayList<Integer> tableNumbers = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    ArrayList<String> contacts = new ArrayList<>();
    ArrayList<GregorianCalendar> dates = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();
    
    ArrayList<String> filteredBookings = new ArrayList<>();
    
    public void setup(){
        this.setVisible(true);
        this.setTitle("Restaurant Manager");
        
    }
    
    private void loadBookings(){
        
    }
    
    private void filterBookings(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTable1;
    private javax.swing.JButton BtnTable2;
    private javax.swing.JButton BtnTable3;
    private javax.swing.JButton BtnTable4;
    private javax.swing.JButton BtnTable5;
    private javax.swing.JMenuItem JMAbout;
    private javax.swing.JMenuItem JMExit;
    private javax.swing.JMenuItem JMRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
