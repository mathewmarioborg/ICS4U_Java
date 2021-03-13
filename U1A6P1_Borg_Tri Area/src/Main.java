/**
    File Name:	U1A5P2_Borg_Tri Area
    Programmer:	Mathew Borg
    Date:	2021-3-6
    Description: This program calculates the area of a triangle when all three sides are known.
 */
public class Main extends javax.swing.JFrame {
    private double eSideA, eSideB, eSideC; //creats a int for number input
    private String stringSideA, stringSideB, stringSideC; // creats strings to display answers

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
        sideA = new javax.swing.JLabel();
        sideB = new javax.swing.JLabel();
        sideC = new javax.swing.JLabel();
        enterSideA = new javax.swing.JTextField();
        enterSideB = new javax.swing.JTextField();
        enterSideC = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        triangleArea = new javax.swing.JLabel();
        outputTriangleArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 10, 10));
        title.setText("Triangle Area");

        author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author.setText("By: Mathew Borg");

        sideA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideA.setText("Enter Side A");

        sideB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideB.setText("Enter Side B");

        sideC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideC.setText("Enter Side C");

        enterSideA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterSideA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSideAActionPerformed(evt);
            }
        });

        enterSideB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterSideB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSideBActionPerformed(evt);
            }
        });

        enterSideC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterSideC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSideCActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        triangleArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        triangleArea.setText("Triangle Area:");

        outputTriangleArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputTriangleArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTriangleAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sideA)
                                    .addComponent(sideB)
                                    .addComponent(sideC))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enterSideA, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(enterSideB)
                                    .addComponent(enterSideC)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(triangleArea)
                            .addComponent(Calculate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(outputTriangleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sideA, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterSideA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterSideB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterSideC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideC, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triangleArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputTriangleArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        /**
        * Gets the text from our GUI input boxes and sets them to strings
        */
        stringSideA = enterSideA.getText();
        stringSideB = enterSideB.getText();
        stringSideC = enterSideC.getText();
        /*
        * Passes the string data to the vareable ints we created
        * For Box A
        */
        try{ //trys to get number data 
            eSideA = Double.parseDouble(stringSideA);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            enterSideA.setText("Enter Numbers Only");
            return;
        }if (eSideA <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            enterSideA.setText("Positive Numbers Only");
            return;
        }
        //For Box B
        try{ //trys to get number data 
            eSideB = Double.parseDouble(stringSideB);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            enterSideB.setText("Enter Numbers Only");
            return;
        }if (eSideB <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            enterSideB.setText("Positive Numbers Only");
            return;
        }
        //For Box C
        try{ //trys to get number data 
            eSideC = Double.parseDouble(stringSideC);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            enterSideC.setText("Enter Numbers Only");
            return;
        }if (eSideC <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            enterSideC.setText("Positive Numbers Only");
            return;
        }

        boolean checkSum = AreaCalculations.isValid(eSideA,eSideB,eSideC); //returns true or false based on the input values
        
        //if checksum is true run area calculation and setText its value else setText sum of two sides must be greater the third side
        if (checkSum == true){ 
            double areaCalculations = AreaCalculations.area(eSideA,eSideB,eSideC);
            outputTriangleArea.setText("Total Area = " + areaCalculations);
        }else{
            outputTriangleArea.setText("sum of two sides must be greater the third side");
        }

    }//GEN-LAST:event_CalculateActionPerformed

    private void enterSideAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSideAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSideAActionPerformed

    private void enterSideBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSideBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSideBActionPerformed

    private void enterSideCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSideCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSideCActionPerformed

    private void outputTriangleAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTriangleAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputTriangleAreaActionPerformed

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
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel author;
    private javax.swing.JTextField enterSideA;
    private javax.swing.JTextField enterSideB;
    private javax.swing.JTextField enterSideC;
    private javax.swing.JTextField outputTriangleArea;
    private javax.swing.JLabel sideA;
    private javax.swing.JLabel sideB;
    private javax.swing.JLabel sideC;
    private javax.swing.JLabel title;
    private javax.swing.JLabel triangleArea;
    // End of variables declaration//GEN-END:variables
}
