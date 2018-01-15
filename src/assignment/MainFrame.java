package assignment;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
        CBMonth = new javax.swing.JComboBox<>();
        CBYear = new javax.swing.JComboBox<>();
        CBDay = new javax.swing.JComboBox<>();
        BtnBookings = new javax.swing.JButton();
        TxtTables = new javax.swing.JLabel();
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

        CBMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBMonthItemStateChanged(evt);
            }
        });

        CBYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBYearItemStateChanged(evt);
            }
        });

        BtnBookings.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnBookings.setText("Get Bookings");
        BtnBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookingsActionPerformed(evt);
            }
        });

        TxtTables.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(BtnBookings))
                            .addComponent(CBDay, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TxtTables, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
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
                .addComponent(BtnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtTables, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable1ActionPerformed
        openTable(1);
    }//GEN-LAST:event_BtnTable1ActionPerformed

    private void BtnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable2ActionPerformed
        openTable(2);
    }//GEN-LAST:event_BtnTable2ActionPerformed

    private void BtnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable3ActionPerformed
        openTable(3);
    }//GEN-LAST:event_BtnTable3ActionPerformed

    private void BtnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable4ActionPerformed
        openTable(4);
    }//GEN-LAST:event_BtnTable4ActionPerformed

    private void BtnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable5ActionPerformed
        openTable(5);
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

    private void CBMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBMonthItemStateChanged
        updateDays(Integer.parseInt(CBYear.getSelectedItem().toString()),CBMonth.getSelectedIndex());
    }//GEN-LAST:event_CBMonthItemStateChanged

    private void CBYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBYearItemStateChanged
        updateDays(Integer.parseInt(CBYear.getSelectedItem().toString()),CBMonth.getSelectedIndex());
    }//GEN-LAST:event_CBYearItemStateChanged

    private void BtnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookingsActionPerformed
        filterBookings(Integer.parseInt(CBYear.getSelectedItem().toString()), CBMonth.getSelectedIndex(), CBDay.getSelectedIndex()+1);
    }//GEN-LAST:event_BtnBookingsActionPerformed
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
    
    ArrayList<Integer> filteredBookings = new ArrayList<>();
    ArrayList<Integer> filteredTables = new ArrayList<>();
    
    GregorianCalendar lastBookingDate = new GregorianCalendar();
    
    ArrayList<JButton> buttons = new ArrayList<>();
    
    public void setup(){
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Restaurant Manager");
        
        tableNumbers.clear();
        names.clear();
        surnames.clear();
        contacts.clear();
        dates.clear();
        quantities.clear();
        comments.clear();
        
        buttons.clear();
        buttons.add(BtnTable1);
        buttons.add(BtnTable2);
        buttons.add(BtnTable3);
        buttons.add(BtnTable4);
        buttons.add(BtnTable5);
        
        String[] months = new DateFormatSymbols().getMonths();
        DefaultComboBoxModel MnModel = new DefaultComboBoxModel(months);
        CBMonth.setModel(MnModel);
        CBMonth.removeItemAt(12);
        
        Calendar cal = new GregorianCalendar();
        String[] years = {String.valueOf(cal.get(Calendar.YEAR)+1),String.valueOf(cal.get(Calendar.YEAR)+2)};
        DefaultComboBoxModel YrModel = new DefaultComboBoxModel(years);
        CBYear.setModel(YrModel);
        
        updateDays(Integer.valueOf(years[0]), 0);
        
        loadBookings();
        
        filterBookings(Integer.parseInt(years[0]), 0, 1);
    }
    
    private void updateDays(int year, int month){
        CBDay.removeAllItems();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
            CBDay.addItem(i+"");
        }
    }
    
    private void loadBookings(){
        String contents = FileIO.readTextFile("src/Bookings.txt");
        String[] consplit = contents.split("\n");
        for (String line : consplit){
            String[] i = line.split(",");
            tableNumbers.add(Integer.parseInt(i[0]));
            names.add(i[1]);
            surnames.add(i[2]);
            contacts.add(i[3]);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
            Date date;
            GregorianCalendar c = new GregorianCalendar();
            try{
                date = df.parse(i[4]);
            }catch(ParseException e){
                date = new Date();
            }
            c.setTime(date);
            dates.add(c);
            quantities.add(Integer.parseInt(i[5]));
            if (i.length >= 7){
                comments.add(i[6]);
            }else{
                comments.add("");
            }
        }
    }
    
    private void filterBookings(int year, int month, int day){
        lastBookingDate.set(year, month, day);
        filteredBookings.clear();
        filteredTables.clear();
        int i = 0;
        for (GregorianCalendar c : dates){
            if (c.get(Calendar.YEAR)==lastBookingDate.get(Calendar.YEAR) && c.get(Calendar.DAY_OF_YEAR) == lastBookingDate.get(Calendar.DAY_OF_YEAR)){
                filteredBookings.add(i);
                filteredTables.add(tableNumbers.get(i));
            }
            i++;
        }
        updateIcons();
    }
    
    private void updateIcons(){
        int i = 0;
        int av = 0;
        int seats = 0;
        for (JButton btn : buttons){
            i++;
            if (filteredTables.contains(i)){
                btn.setIcon(new ImageIcon("src/assignment/Images/table"+i+"_booked.png")); 
            }else{
                av++;
                btn.setIcon(new ImageIcon("src/assignment/Images/table"+i+"_available.png")); 
            }
        }
        
        for (int l : filteredBookings){
            seats+=quantities.get(l);
        }
        TxtTables.setText(av+" tables availble on chosen date. "+seats+" seats are already taken.");
    }
    
    private void openTable(int table){
        if (filteredTables.contains(table)){
            ReviewBookings rb = new ReviewBookings();
            int num = 0;
            for (int i : filteredBookings){
                if (tableNumbers.get(i).equals(table)){
                    num = i;
                    break;
                }
            }
            rb.openFrame(table, lastBookingDate, names.get(num), surnames.get(num), contacts.get(num), quantities.get(num), comments.get(num));
        }else{
            Booking b = new Booking();
            b.openFrame(table, lastBookingDate);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBookings;
    private javax.swing.JButton BtnTable1;
    private javax.swing.JButton BtnTable2;
    private javax.swing.JButton BtnTable3;
    private javax.swing.JButton BtnTable4;
    private javax.swing.JButton BtnTable5;
    private javax.swing.JComboBox<String> CBDay;
    private javax.swing.JComboBox<String> CBMonth;
    private javax.swing.JComboBox<String> CBYear;
    private javax.swing.JMenuItem JMAbout;
    private javax.swing.JMenuItem JMExit;
    private javax.swing.JMenuItem JMRefresh;
    private javax.swing.JLabel TxtTables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
