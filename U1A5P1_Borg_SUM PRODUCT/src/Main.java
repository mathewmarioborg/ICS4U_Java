/**
    File Name:	U1A5P1_Borg_SUM PRODUCT 
    Programmer:	Mathew Borg
    Date:	2021-3-1
    Description:This program calculates the sum and product of the numbers
 */
public class Main extends javax.swing.JFrame {
    
    private int eNumber; //creats a int for number input
    private String inputString, sumString, productString; // creats strings to display answers
    
    private SumCalculator sC = new SumCalculator();  // Gives us access to the SumCalculator class
    
    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Author = new javax.swing.JLabel();
        Enter = new javax.swing.JLabel();
        Answer = new javax.swing.JLabel();
        Input = new javax.swing.JLabel();
        Sum = new javax.swing.JLabel();
        Product = new javax.swing.JLabel();
        enterNumber = new javax.swing.JTextField();
        answerInput = new javax.swing.JTextField();
        answerSum = new javax.swing.JTextField();
        answerProduct = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 100, 0));

        Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(10, 255, 10));
        Title.setText("SUM & PRODUCT");

        Author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Author.setText("By: Mathew Borg");

        Enter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Enter.setText("Enter A Number");

        Answer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Answer.setText("Answer");

        Input.setText("Input");

        Sum.setText("Sum");

        Product.setText("Product");

        enterNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberActionPerformed(evt);
            }
        });

        answerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerInputActionPerformed(evt);
            }
        });

        answerSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerSumActionPerformed(evt);
            }
        });

        answerProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerProductActionPerformed(evt);
            }
        });

        calculateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Sum)
                                .addComponent(Product)
                                .addComponent(Input))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(Answer)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(answerInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(answerSum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(answerProduct, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Title)
                            .addGap(27, 27, 27)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Enter))
                            .addComponent(Author))
                        .addGap(102, 102, 102))))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(enterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Answer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNumberActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
         /**
         * Gets the text from our GUI input boxes and sets them to strings
         */
        inputString = enterNumber.getText();
        
        /*
        * Passes the string data to the vareable ints we created
        */
        try{ //trys to get number data 
            eNumber = Integer.parseInt(inputString);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            enterNumber.setText("Enter Numbers Only");
            return;
        }if (eNumber < 0){ //if number is negative display Enter Positive Numbers Only and retry the program
            enterNumber.setText("Enter Positive Numbers Only");
            return;
        }
        
        sC.sumCalculator(eNumber); //Passes the vareables to my rootCalculations method
      
        //sets the vars fom SumCalculator class to strings
        sumString = Double.toString(sC.sum);
        productString = Double.toString(sC.product);
        
        //sets the number, sum and product filds to there answers
        answerInput.setText("Number = " + inputString);
        answerSum.setText("Sum = " + sumString);
        answerProduct.setText("Product = " + productString);


    }//GEN-LAST:event_calculateButtonActionPerformed

    private void answerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerInputActionPerformed

    private void answerSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerSumActionPerformed

    private void answerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerProductActionPerformed

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
    private javax.swing.JLabel Answer;
    private javax.swing.JLabel Author;
    private javax.swing.JLabel Enter;
    private javax.swing.JLabel Input;
    private javax.swing.JLabel Product;
    private javax.swing.JLabel Sum;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField answerInput;
    private javax.swing.JTextField answerProduct;
    private javax.swing.JTextField answerSum;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField enterNumber;
    // End of variables declaration//GEN-END:variables
}
