package assignment;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

public class ReviewBookings extends javax.swing.JFrame {
    public ReviewBookings() {
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
        BtnClose = new javax.swing.JButton();
        TxtContact = new javax.swing.JLabel();
        TName = new javax.swing.JLabel();
        TSurname = new javax.swing.JLabel();
        TContact = new javax.swing.JLabel();
        TQuantity = new javax.swing.JLabel();
        TComment = new javax.swing.JLabel();

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

        BtnClose.setText("Close");
        BtnClose.setToolTipText("");
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        TxtContact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtContact.setText("Contact:");

        TName.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtSurname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TSurname))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TContact))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtComments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TComment))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TQuantity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TName))
                    .addComponent(TxtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(TName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSurname)
                    .addComponent(TSurname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtContact)
                    .addComponent(TContact))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQuantity)
                    .addComponent(TQuantity))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtComments)
                    .addComponent(TComment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //If close button is clicked dispose of the form.
    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCloseActionPerformed

    //Main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Crearte new instance of class and run the method to setup form
                ReviewBookings rb = new ReviewBookings();
                rb.openFrame(0, new GregorianCalendar(), "", "", "", 0, "");
            }
        });
    }
    
    /*Main method to setup Form, Shows form, Sets the correct title, and makes it so it only disposes this form instead of exiting program
    TableNo, date, Name, Surname, Contact, Quantity, Comments are paremetes to display on the form
    */
    public void openFrame(int TableNo, GregorianCalendar date, String Name, String Surname, String Contact, int Quantity, String Comments){
        this.setVisible(true);
        this.setTitle("Review Booking");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        TxtMain.setText("Table "+TableNo+" booked on "+date.get(Calendar.DAY_OF_MONTH)+"/"+((date.get(Calendar.MONTH)+1) < 10 ? "0"+(date.get(Calendar.MONTH)+1):(date.get(Calendar.MONTH)+1))+"/"+date.get(Calendar.YEAR));
        TName.setText(Name);
        TSurname.setText(Surname);
        TContact.setText(Contact);
        TQuantity.setText(Quantity+"");
        TComment.setText(Comments);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClose;
    private javax.swing.JLabel TComment;
    private javax.swing.JLabel TContact;
    private javax.swing.JLabel TName;
    private javax.swing.JLabel TQuantity;
    private javax.swing.JLabel TSurname;
    private javax.swing.JLabel TxtComments;
    private javax.swing.JLabel TxtContact;
    private javax.swing.JLabel TxtMain;
    private javax.swing.JLabel TxtName;
    private javax.swing.JLabel TxtQuantity;
    private javax.swing.JLabel TxtSurname;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
