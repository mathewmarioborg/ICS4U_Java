/**
    File Name:	U1A5P2_Borg_CARDS
    Programmer:	Mathew Borg
    Date:	2021-3-4
    Description:This program determine the suit and card number from a deck of cards.
 */
public class Main extends javax.swing.JFrame {
    
    private int eCard; //creats a int for number input
    private String inputString, numberString, colourString, suitString, valueString; // creats strings to display answers
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        enterNumber = new javax.swing.JLabel();
        enterCard = new javax.swing.JTextField();
        getCard = new javax.swing.JButton();
        outputNumber = new javax.swing.JTextField();
        outputColour = new javax.swing.JTextField();
        outputSuit = new javax.swing.JTextField();
        outputValue = new javax.swing.JTextField();
        cardValue = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        colour = new javax.swing.JLabel();
        suit = new javax.swing.JLabel();
        value = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(10, 10, 255));
        title.setText("Cards Program ");

        author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author.setText("By: Mathew Borg");

        enterNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterNumber.setText("Enter A Card Number");

        enterCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterCardActionPerformed(evt);
            }
        });

        getCard.setText("Get Card");
        getCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCardActionPerformed(evt);
            }
        });

        outputNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputNumberActionPerformed(evt);
            }
        });

        outputColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputColourActionPerformed(evt);
            }
        });

        outputSuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputSuitActionPerformed(evt);
            }
        });

        outputValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputValueActionPerformed(evt);
            }
        });

        cardValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cardValue.setText("Card Values");

        number.setText("Number");

        colour.setText("Colour");

        suit.setText("Suit");

        value.setText("Value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(number)
                            .addComponent(colour)
                            .addComponent(suit)
                            .addComponent(value))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputValue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputSuit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputColour, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(enterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(cardValue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(getCard)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author)
                .addGap(13, 13, 13)
                .addComponent(enterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colour))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputSuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterCardActionPerformed

    private void outputNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputNumberActionPerformed

    private void outputColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputColourActionPerformed

    private void outputSuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputSuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputSuitActionPerformed

    private void outputValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputValueActionPerformed

    private void getCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCardActionPerformed
        /**
        * Gets the text from our GUI input boxes and sets them to strings
        */
        inputString = enterCard.getText();
        
        /*
        * Passes the string data to the vareable ints we created
        */
        try{ //trys to get number data 
            eCard = Integer.parseInt(inputString);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            enterCard.setText("Enter Numbers Only");
            return;
        }if (eCard > 52){ //if number is grater them max deck value display Enter Valid Card Number and retry the program
            enterCard.setText("Enter Valid Card Number");
            return;
        }if (eCard <= 0){ //if number is negative or 0 display Enter Positive Numbers Only and retry the program
            enterCard.setText("Enter Positive Numbers Only");
            return;
        }
        
        String[][] cardValues = CardDeck.cardDeck(); //returns the deck of cards
        
        //sets text felds to there corasponding values (subtracts 1 bc a computer numbering is 0-51 not 1-52)
        outputNumber.setText("Number = " + inputString); 
        outputColour.setText("Colour = " + cardValues[eCard-1][2]);
        outputSuit.setText("Suit = " + cardValues[eCard-1][1]);        
        outputValue.setText("Value = " + cardValues[eCard-1][0]);
    }//GEN-LAST:event_getCardActionPerformed

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
    private javax.swing.JLabel cardValue;
    private javax.swing.JLabel colour;
    private javax.swing.JTextField enterCard;
    private javax.swing.JLabel enterNumber;
    private javax.swing.JButton getCard;
    private javax.swing.JLabel number;
    private javax.swing.JTextField outputColour;
    private javax.swing.JTextField outputNumber;
    private javax.swing.JTextField outputSuit;
    private javax.swing.JTextField outputValue;
    private javax.swing.JLabel suit;
    private javax.swing.JLabel title;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
