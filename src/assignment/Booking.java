package assignment;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {
    public Booking() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtMain = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtName = new javax.swing.JLabel();
        TxtSurname = new javax.swing.JLabel();
        TxtQuantity = new javax.swing.JLabel();
        TxtComments = new javax.swing.JLabel();
        TFName = new javax.swing.JTextField();
        TFContact = new javax.swing.JTextField();
        CBQuantity = new javax.swing.JComboBox<>();
        BtnSave = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        TxtContact = new javax.swing.JLabel();
        TFSurname = new javax.swing.JTextField();
        Comments = new javax.swing.JScrollPane();
        TAComments = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtMain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtMain.setText("Book Table ");

        TxtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtName.setText("Name:");

        TxtSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtSurname.setText("Surname:");

        TxtQuantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtQuantity.setText("Quantity:");

        TxtComments.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtComments.setText("Comments:");

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        TxtContact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtContact.setText("Contact:");

        TAComments.setColumns(20);
        TAComments.setRows(5);
        Comments.setViewportView(TAComments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtSurname)
                    .addComponent(TxtContact)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtComments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Comments))
                    .addComponent(TxtQuantity)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtName)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFContact, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TxtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TxtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtName)
                    .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSurname)
                            .addComponent(TFSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtContact)
                            .addComponent(TFContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtQuantity)
                            .addComponent(CBQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtComments)
                            .addComponent(Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //IF cancel button is clicked dispose the form
    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed
    
    //If save button is clicked run validateForm method to validate the inputs and ask the user to confirm the save
    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        validateForm();
    }//GEN-LAST:event_BtnSaveActionPerformed
    
    //Global variables such as TableNo, and date of which table is going to be booked and when.
    int TableNo;
    GregorianCalendar date;
    
    //Main method
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Create new instance of the class and run the openForm method to setup the form
                Booking b = new Booking();
                b.openFrame(0, new GregorianCalendar(2019,0,1));
            }
        });
    }
    
    //Method to validate form 
    private void validateForm(){
        //Boolean to check if inputs are correct, if one input is wrong set to false
        boolean con = true;
        //String to show the user if inputs are not valid
        String text = "";
        
        /*Run method to check if the Name and Surname TextFields only contains letters and Contact only contains digits and are all not empty
        if returned falce set the boolean con to false and add to the text the invalid input, Their Labels are also set to RED*/
        if (!validateTextField(TFName, "name")){
            text = "Name must contain only letters. ";
            con = false;
        }
        if (!validateTextField(TFSurname, "surname")){
            if (text.equals("")){
                text = "Surname must contain only letters. ";
            }else{
                text = "Name and Surname must contain only letters. ";
            }
            con = false;
        }
        if (!validateTextField(TFContact, "contact")){
            text += "Contacts must only contain digits. ";
            con = false;
        }
        
        //Check if comments section contains commas, this can break the split and not get the full comment when retrieving from file, so we disable it
        //This can be left empty as well.
        if (TAComments.getText().contains(",")){
            TxtComments.setForeground(Color.RED);
            con = false;
            text+="Comments cant include \",\".";
        }else{
            TxtComments.setForeground(Color.BLACK);
        }
        
        //If there were no invalid inputs the program will ask the user to confirm save.
        if (con){
            //Show dialog box to save file
            int save = JOptionPane.showConfirmDialog(null, "Save Booking?", "Save",JOptionPane.YES_NO_OPTION);
            //If yes is clicked run the method saveBooking to save the inputs to thew file and dispose of the form
            if (save == JOptionPane.YES_OPTION) {
                saveBooking();
                dispose();
            }
        }else{
            //If there were invalid input show dialog box with the invalid inputs.
            JOptionPane.showMessageDialog(null, text ,"Error:", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    /*Method to check if TextField inputs are correct,
    Takes the textField as tf to validate
    Takes String type to check what type of textfield is taking
    If the field type is contact, It check if its digits, if other checks if its letters
    the string type is also used to change the color of the labels corresponding to the textfields
    */
    private Boolean validateTextField(javax.swing.JTextField tf, String type){
        //Boolean to return
        boolean con = true;
        //Color to set labels
        Color c = Color.RED;
        //Check if it contains letters or numbers and is not left empty
        if (type.equals("contact") ? !tf.getText().matches("[0-9]+") : !tf.getText().matches("[a-zA-Z]+") || tf.getText().equals("")){
            con = false;
        }
        //If the input is not invalid make sure the label is colored black
        if (con){
            c = Color.BLACK;
        }
        //Check what type it is to change the labels color, If invalid input change to red if not change back to black.
        switch (type.toLowerCase()){
                case "name": TxtName.setForeground(c);
                case "surname": TxtSurname.setForeground(c);
                case "contact": TxtContact.setForeground(c);
                default: break;
        }
        //Return if the input is invalid or not.
        return con;
    }
    
    //Save the inputs from the user inside the the file using the FILIO class and appendtoTextFile method.
    private void saveBooking(){
        //String to write to the file
        String text = TableNo+","+TFName.getText()+","+TFSurname.getText()+","+TFContact.getText()+","+date.get(Calendar.DAY_OF_MONTH)+"/"+((date.get(Calendar.MONTH)+1) < 10 ? "0"+(date.get(Calendar.MONTH)+1):(date.get(Calendar.MONTH)+1))+"/"+date.get(Calendar.YEAR)+","+(CBQuantity.getSelectedIndex()+1)+","+TAComments.getText();
        FileIO.appendToTextFile("src/bookings.txt", text);
    }
    
    //Method to display form and, Set Title and set the 'X' Button to dispose only this form
    public void openFrame(int TableNo, GregorianCalendar date){
        //Set the tableNo and Date paremeters to this class global variables
        this.TableNo = TableNo;
        this.date = date;
        
        //Set the form in the middle of the screen
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Make a Booking");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Set the Top text on the form to which table and when.
        TxtMain.setText("Book table "+TableNo+" on "+date.get(Calendar.DAY_OF_MONTH)+"/"+((date.get(Calendar.MONTH)+1) < 10 ? "0"+(date.get(Calendar.MONTH)+1):(date.get(Calendar.MONTH)+1))+"/"+date.get(Calendar.YEAR));
        //Programatically add from 1-10 in the Quantity cambo Box
        for (int i = 1; i <= 10; i++){
            CBQuantity.addItem(i+"");
        }
        //Set the default number to '2' as selected by the cambo box
        CBQuantity.setSelectedIndex(1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> CBQuantity;
    private javax.swing.JScrollPane Comments;
    private javax.swing.JTextArea TAComments;
    private javax.swing.JTextField TFContact;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFSurname;
    private javax.swing.JLabel TxtComments;
    private javax.swing.JLabel TxtContact;
    private javax.swing.JLabel TxtMain;
    private javax.swing.JLabel TxtName;
    private javax.swing.JLabel TxtQuantity;
    private javax.swing.JLabel TxtSurname;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
