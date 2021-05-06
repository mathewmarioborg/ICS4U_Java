import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
    programmer:         Mathew Borg
    Date:               2021-04-20
    Program Name:       U2A4P1_Borg_3M
    Program Discription:This program will except an undetermined number of 
                        integer inputs of values from 0 to 100 then calculates 
                        the mean, median and mode of the data entered.
*/
public class Main extends javax.swing.JFrame {
    ArrayList <Double> doubleData = new ArrayList(); //creates Array List

    /**
     * Creates new form Main
     */
    public Main() {
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

        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        inputAdd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputList = new javax.swing.JTextArea();
        outputCalculations = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 10, 10));
        title.setText("3M");

        author.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        author.setText("By: Mathew Borg");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        outputList.setEditable(false);
        outputList.setColumns(20);
        outputList.setRows(5);
        outputList.setFocusCycleRoot(true);
        jScrollPane1.setViewportView(outputList);

        outputCalculations.setEditable(false);
        outputCalculations.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(title))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRemove)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCalculate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear))
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputAdd))
                                    .addComponent(author))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(outputCalculations)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(title)
                .addGap(1, 1, 1)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputCalculations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String sTemp = ""; //creats temp string
        Double dTemp = 0.0; //creats temp Double
        
        try{ //trys to convert string input to interger
            sTemp = inputAdd.getText(); //sets string to inputAdd value
            dTemp = Double.parseDouble(sTemp); //changes sting to Double
        }catch(NumberFormatException e){ //if letters are typed in
            inputAdd.setText("Numbers Only!!"); //sets text to Numbers Only
            return;
        }if(dTemp < 0){ //if value is less than 0
            inputAdd.setText("Positive Numbers!!"); //set text to positive numbers only
            return;
        }if(dTemp > 100){ //if value is greater then 100 
            inputAdd.setText("Max Num is 100!!"); //set Text to output max number is 100
            return;
        }
        inputAdd.setText(""); //clears input feild 
        
        doubleData.add(dTemp); //adds nTemp to arrayList
        
        listArray(); //lists the array
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(doubleData.size() > 0){ //checks the size of the array list
            doubleData.remove(doubleData.size() - 1); //removes the size of the list -1
        }
        listArray(); //lists the array
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if(doubleData.isEmpty()){ //if no data found in arraylist
            JOptionPane.showMessageDialog(null, "No Data Found Please Add New Number With The Add Button"); // creates a pop up box with no values found
            return; //retry program
        }else{ //else
        double mean = MeanMedianModeCalculator.meanCalculator(doubleData); //create double and send doubleData to method 
        double median = MeanMedianModeCalculator.medianCalculator(doubleData); //create double and send doubleData to method 
        ArrayList mode = MeanMedianModeCalculator.modeCalculator(doubleData); //create Arraylist and send doubleData to method 
        
        outputCalculations.setText("Mean: " + mean + " Median: " + median + " Mode: " + mode); //output mean median and mode to outputCalculations
        }
    }//GEN-LAST:event_btnCalculateActionPerformed
    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        doubleData.clear(); //clears data in array list
        listArray(); //lists the array
        outputCalculations.setText(""); //clears outputCalculations
    }//GEN-LAST:event_btnClearActionPerformed
    
    /*
    Function:   listArray
    Purpose:    This method prints the arraylist and checks if there is data found
    Parameters: n/a
    Return:     void 
    */
    private void listArray(){
        String sTemp = ""; //Create temp string
        for (int x = 0; x <= doubleData.size() - 1; x++) { //for loop to initalise ArrayList
            //adds text and the data stored in integerData to sTemp
            sTemp = sTemp + "Integer: " + doubleData.get(x) + "\n" + "\n";
        }
        //if nothing found in arraylist
        if (doubleData.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Data Found Please Add New Number With The Add Button"); // creates a pop up box with no values found
            outputList.setText(""); //clears text
            return; //retry program
        } else {
            outputList.setText(sTemp);//prints sTemp
        }
    }
    
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
    private javax.swing.JLabel author;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTextField inputAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outputCalculations;
    private javax.swing.JTextArea outputList;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
