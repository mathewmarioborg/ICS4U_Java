/**
    File Name:	U2A1P1_Borg_SumElements
    Programmer:	Mathew Borg
    Date:	2021-3-20
    Description:This program that has the ability to store and display Integer values in an array
 */
import java.util.*;

public class Main extends javax.swing.JFrame {
    
    ArrayList <Integer> numbers = new ArrayList(); //creats a ArrayList <Integer> for all of the integer values

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        enterIntNumber = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        list = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        sumAll = new javax.swing.JButton();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArray = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputSum = new javax.swing.JTextArea();
        inputInteger = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(10, 10, 255));
        title.setText("Sums Elements");

        author.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        author.setText("By: Mathew Borg");

        enterIntNumber.setText("Enter Integer:");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        list.setText("List");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        sumAll.setText("Sum All");
        sumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllActionPerformed(evt);
            }
        });

        sumEven.setText("Sum Even");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setText("Sum Odd");
        sumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddActionPerformed(evt);
            }
        });

        outputArray.setColumns(20);
        outputArray.setRows(5);
        outputArray.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        outputArray.setName(""); // NOI18N
        jScrollPane1.setViewportView(outputArray);
        outputArray.getAccessibleContext().setAccessibleParent(null);

        outputSum.setColumns(20);
        outputSum.setRows(5);
        jScrollPane3.setViewportView(outputSum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumOdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumEven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(sumAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterIntNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(author)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputInteger))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterIntNumber)
                    .addComponent(inputInteger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)
                        .addGap(36, 36, 36)
                        .addComponent(sumAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumEven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumOdd))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String sTemp; //creats temp string
        Integer newNum; //creats newNum Integer
        
        try{ //trys to get number data 
            sTemp = inputInteger.getText(); //gets text from feild and stores in eTemp string
            newNum = Integer.parseInt(sTemp); //passes sTemp string to newNum var
        }catch (NumberFormatException e){ //if there are no numbers it will display Numbers Only!! and retry the program
            inputInteger.setText("Numbers Only!!");
            return;
        }if (newNum <= 0){ //if number is negative or 0 display Enter Number!! and retry the program
            inputInteger.setText("Enter Number!!");
            return;
        }

        numbers.add(newNum); //adds newNum Integer to numbers ArrayList
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String sTemp; //creats temp string
        Integer newNum; //creats newNum Integer
        
        try{ //trys to get number data 
            sTemp = inputInteger.getText(); //gets text from feild and stores in eTemp string
            newNum = Integer.parseInt(sTemp); //passes sTemp string to newNum var
        }catch (NumberFormatException e){ //if there are no numbers it will display Numbers Only!! and retry the program
            inputInteger.setText("Numbers Only!!");
            return;
        }if (newNum <= 0){ //if number is negative or 0 display Enter Number!! Only and retry the program
            inputInteger.setText("Enter Number!!");
            return;
        }
        
        numbers.remove(newNum); //removes newNum Integer to numbers ArrayList
    }//GEN-LAST:event_removeActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        Integer iNumbers; //creats Integer iNumbers
        String outputString="", sNumbers; //creats Strings outputString="" and sNumbers
        
        Iterator <Integer> stepper = numbers.iterator(); //creats a iterator 
        for (int i = 0; i < numbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray.setText("The ArrayList Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
    }//GEN-LAST:event_listActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0); // exits program
    }//GEN-LAST:event_exitActionPerformed

    private void sumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllActionPerformed
        String sTemp, outputString="", sNumbers; //creats temp, outputString="" and sNumbers string
        Integer iNumbers; //creats Integer iNumbers
        Integer sumAll = SumCalculator.sumCalculator(numbers); //gets the sum value for all numbers in the string
        
        sTemp = Integer.toString(sumAll); //sets the temp string to the value of the Integer
        outputSum.setText(sTemp); //sets output text feild to the value of sTemp
        
        Iterator <Integer> stepper = numbers.iterator(); //creats a iterator 
        for (int i = 0; i < numbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray.setText("The ArrayList Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString

    }//GEN-LAST:event_sumAllActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        String sTemp, outputString="", sNumbers; //creats temp, outputString="" and sNumbers string
        Integer iNumbers; //creats Integer iNumbers
        Integer sumEven = SumCalculator.sumEvenCalculator(numbers); //gets the sum value for the even numbers in the string
        ArrayList <Integer> evenNumbers = SumCalculator.findEvenCalculator(numbers); //sends numbers arraylist to findEvenCaluclator
        
        sTemp = Integer.toString(sumEven); //sets the temp string to the value of the Integer
        outputSum.setText(sTemp); //sets output text feild to the value of sTemp
        
        Iterator <Integer> stepper = evenNumbers.iterator(); //creats a iterator 
        for (int i = 0; i < evenNumbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray.setText("The Even Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
        
        
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddActionPerformed
        String sTemp, outputString="", sNumbers; //creats temp, outputString="" and sNumbers string
        Integer iNumbers; //creats Integer iNumbers
        Integer sumOdd = SumCalculator.sumOddCalculator(numbers); //gets the sum value for the odd numbers in the string
        ArrayList <Integer> oddNumbers = SumCalculator.findOddCalculator(numbers); //sends numbers arraylist to findOddCaluclator
        
        sTemp = Integer.toString(sumOdd); //sets the temp string to the value of the Integer
        outputSum.setText(sTemp); //sets output text feild to the value of sTemp
        
        Iterator <Integer> stepper = oddNumbers.iterator(); //creats a iterator 
        for (int i = 0; i < oddNumbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray.setText("The Odd Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
        
    }//GEN-LAST:event_sumOddActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel author;
    private javax.swing.JLabel enterIntNumber;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputInteger;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton list;
    private javax.swing.JTextArea outputArray;
    private javax.swing.JTextArea outputSum;
    private javax.swing.JButton remove;
    private javax.swing.JButton sumAll;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
