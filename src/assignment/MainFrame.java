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
    
    //Table 1 button runs open Table method
    private void BtnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable1ActionPerformed
        openTable(1);
    }//GEN-LAST:event_BtnTable1ActionPerformed
    //Table 2 button runs open Table method
    private void BtnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable2ActionPerformed
        openTable(2);
    }//GEN-LAST:event_BtnTable2ActionPerformed
    //Table 3 button runs open Table method
    private void BtnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable3ActionPerformed
        openTable(3);
    }//GEN-LAST:event_BtnTable3ActionPerformed
    //Table 4 button runs open Table method
    private void BtnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable4ActionPerformed
        openTable(4);
    }//GEN-LAST:event_BtnTable4ActionPerformed
    //Table 5 button runs open Table method
    private void BtnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTable5ActionPerformed
        openTable(5);
    }//GEN-LAST:event_BtnTable5ActionPerformed
    //File>Exit from menu button, Askes user to confirm exit
    private void JMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMExitActionPerformed
        int exit = JOptionPane.showConfirmDialog(null, "Exit Program?", "Exit",JOptionPane.YES_NO_OPTION);
        //If user presses yes again the program exits
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_JMExitActionPerformed
    
    //File>Refresh Bookings menu button, Refreshes the whole program by running setup method
    private void JMRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRefreshActionPerformed
        setup();
    }//GEN-LAST:event_JMRefreshActionPerformed
    
    //Help>About menu button, opens the JFrame About to display the user what the program is about
    private void JMAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMAboutActionPerformed
        AboutFrame af = new AboutFrame();
        af.openFrame();
    }//GEN-LAST:event_JMAboutActionPerformed
    //When the Month combobox is updates it updates the day combo box depending on the new month and year
    private void CBMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBMonthItemStateChanged
        updateDays(Integer.parseInt(CBYear.getSelectedItem().toString()),CBMonth.getSelectedIndex());
    }//GEN-LAST:event_CBMonthItemStateChanged
    //When the Year combobox is updates it updates the day combo box depending on the new month and year
    private void CBYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBYearItemStateChanged
        updateDays(Integer.parseInt(CBYear.getSelectedItem().toString()),CBMonth.getSelectedIndex());
    }//GEN-LAST:event_CBYearItemStateChanged
    //When the Get Booking buttons is clicked, it updates the icons with the new date.
    private void BtnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookingsActionPerformed
        filterBookings(Integer.parseInt(CBYear.getSelectedItem().toString()), CBMonth.getSelectedIndex(), CBDay.getSelectedIndex()+1);
    }//GEN-LAST:event_BtnBookingsActionPerformed
    //Main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            //Creates new instance of class and run the main method to setup form
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setup();
            }
        });
    }
    
    //Attributes needed to store bookings
    ArrayList<Integer> tableNumbers = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    ArrayList<String> contacts = new ArrayList<>();
    ArrayList<GregorianCalendar> dates = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();
    
    //ArrayLists to store filtered bookings with the dates the user chose
    ArrayList<Integer> filteredBookings = new ArrayList<>();
    ArrayList<Integer> filteredTables = new ArrayList<>();
    //Date of when the user clicks on getBooking button
    GregorianCalendar lastBookingDate = new GregorianCalendar();
    
    //Stores the table buttons in arraylist for easier update of icons
    ArrayList<JButton> buttons = new ArrayList<>();
    
    //Main method to setup the whole program and form
    public void setup(){
        //Sets the form to the center of screen, Sets the correct Title and makes the form visible
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Restaurant Manager");
        
        //Clears Booking ArrayLists so they dont keep doubles when users clicks resresh bookings
        tableNumbers.clear();
        names.clear();
        surnames.clear();
        contacts.clear();
        dates.clear();
        quantities.clear();
        comments.clear();
        
        //Add buttons to ArrayList to update icons easy
        buttons.clear();
        buttons.add(BtnTable1);
        buttons.add(BtnTable2);
        buttons.add(BtnTable3);
        buttons.add(BtnTable4);
        buttons.add(BtnTable5);
        
        //Set the months comboBox with the months
        String[] months = new DateFormatSymbols().getMonths();//Get all months and store them inside list
        DefaultComboBoxModel MnModel = new DefaultComboBoxModel(months);//Create a new model for combobox with months
        CBMonth.setModel(MnModel);//Set the model to the comboBox
        CBMonth.removeItemAt(12);//Remove empty space
        
        //Update Year ComboBox with the 2 upcoming years
        Calendar cal = new GregorianCalendar();
        String[] years = {String.valueOf(cal.get(Calendar.YEAR)+1),String.valueOf(cal.get(Calendar.YEAR)+2)};
        DefaultComboBoxModel YrModel = new DefaultComboBoxModel(years);
        CBYear.setModel(YrModel);
        
        //Method to update the days combobox depending on the year and month chosen
        updateDays(Integer.valueOf(years[0]), 0);
        
        //Method to load bookings from file to arrayLists
        loadBookings();
        
        //method to get the bookings that the dates are chosen on
        filterBookings(Integer.parseInt(years[0]), 0, 1);
    }
    
    //Updates day combo box.
    private void updateDays(int year, int month){
        CBDay.removeAllItems();//Clears combo box
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);//Set the calendar to the chosen year and month
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
            //Gets the maximum days in the current month and add from 1- maximum days to combobox
            CBDay.addItem(i+"");
        }
    }
    
    //Gets bookings from file and fills arrayLists
    private void loadBookings(){
        String contents = FileIO.readTextFile("src/Bookings.txt");//Contents from the File
        String[] consplit = contents.split("\n");//Splits the contents into lines
        for (String line : consplit){
            String[] i = line.split(",");//Splits each linbe where there is a comma
            //Add items to arrayLists
            tableNumbers.add(Integer.parseInt(i[0]));
            names.add(i[1]);
            surnames.add(i[2]);
            contacts.add(i[3]);
            //Get the date from string and store it inside a gregorian calendar
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
            //Checks if booking has a comment, If it does add the comment if it doesnt add empty string
            if (i.length >= 7){
                comments.add(i[6]);
            }else{
                comments.add("");
            }
        }
    }
    
    //Method to filter bookings to the current chosen date
    private void filterBookings(int year, int month, int day){
        //Sets the date of lastBookingDate to the paremeters gotten
        lastBookingDate.set(year, month, day);
        //Clears ArrayLists
        filteredBookings.clear();
        filteredTables.clear();
        int i = 0;
        //Goes trough each date and checks if it mathes to the date given, If it does add it to ArrayLists and add the Table number to filteredTables
        for (GregorianCalendar c : dates){
            if (c.get(Calendar.YEAR)==lastBookingDate.get(Calendar.YEAR) && c.get(Calendar.DAY_OF_YEAR) == lastBookingDate.get(Calendar.DAY_OF_YEAR)){
                filteredBookings.add(i);
                filteredTables.add(tableNumbers.get(i));
            }
            i++;
        }
        //Runs method to update icons with the chosen date
        updateIcons();
    }
    
    //Updates icons depending on the chosen date
    private void updateIcons(){
        int i = 0;//Current table
        int av = 0;//Available tables
        int seats = 0;//Seats taken
        //Go trough every table button and check if its booked or not, If it is Set the icon to red else, set the table icon green and add 1 to available tables
        for (JButton btn : buttons){
            i++;
            if (filteredTables.contains(i)){
                btn.setIcon(new ImageIcon("src/assignment/Images/table"+i+"_booked.png")); 
            }else{
                av++;
                btn.setIcon(new ImageIcon("src/assignment/Images/table"+i+"_available.png")); 
            }
        }
        //Go trough every Booking on the date and add the seats booked to display on the text
        for (int l : filteredBookings){
            seats+=quantities.get(l);
        }
        //Displays tables available and seats taken
        TxtTables.setText(av+" tables availble on chosen date. "+seats+" seats are already taken.");
    }
    
    //Method runs when table buttons are clicked, Takes table number as parameter
    private void openTable(int table){
        //Checks if table is booked
        if (filteredTables.contains(table)){
            ReviewBookings rb = new ReviewBookings();
            int num = 0;
            //If it table is booked, Get the index for other arrayLists to get information about booking.
            for (int i : filteredBookings){
                if (tableNumbers.get(i).equals(table)){
                    num = i;
                    break;
                }
            }
            //Calls method to open Review Booking with information about booking.
            rb.openFrame(table, lastBookingDate, names.get(num), surnames.get(num), contacts.get(num), quantities.get(num), comments.get(num));
        }else{
            //If the table is available Open Booking Form for the user to book.
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
