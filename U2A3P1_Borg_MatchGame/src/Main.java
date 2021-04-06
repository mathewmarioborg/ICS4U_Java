import javax.swing.JButton;

/*
    programmer: Mathew Borg
    Date: 2021-03-27
    Program Name: U2A3P1_Borg_MatchGame
    Program Discription: This profram uses arrays to simulate a matching game.
    A grid of cards will be displayed and the user is to select 2 cards at a time
    looking for a matching card. the goal of this game is to see how quickly
    the user can find all the matches. 
*/
public class Main extends javax.swing.JFrame {
    JButton[] btns = new JButton[20]; //creats btn array

    /**
     * Creates new form Main
     */
    public Main() { 
        initComponents();
        //Adds cardbtns to btns array
        btns[0] = btnCard1; 
        btns[1] = btnCard2; 
        btns[2] = btnCard3; 
        btns[3] = btnCard4; 
        btns[4] = btnCard5; 
        btns[5] = btnCard6; 
        btns[6] = btnCard7;
        btns[7] = btnCard8;
        btns[8] = btnCard9;
        btns[9] = btnCard10;
        btns[10] = btnCard11;
        btns[11] = btnCard12;
        btns[12] = btnCard13;
        btns[13] = btnCard14;
        btns[14] = btnCard15;
        btns[15] = btnCard16;
        btns[16] = btnCard17;
        btns[17] = btnCard18;
        btns[18] = btnCard19;
        btns[19] = btnCard20; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCard1 = new javax.swing.JButton();
        btnCard2 = new javax.swing.JButton();
        btnCard3 = new javax.swing.JButton();
        btnCard4 = new javax.swing.JButton();
        btnCard5 = new javax.swing.JButton();
        btnCard6 = new javax.swing.JButton();
        btnCard7 = new javax.swing.JButton();
        btnCard8 = new javax.swing.JButton();
        btnCard9 = new javax.swing.JButton();
        btnCard10 = new javax.swing.JButton();
        btnCard11 = new javax.swing.JButton();
        btnCard12 = new javax.swing.JButton();
        btnCard13 = new javax.swing.JButton();
        btnCard14 = new javax.swing.JButton();
        btnCard15 = new javax.swing.JButton();
        btnCard16 = new javax.swing.JButton();
        mainTitle = new javax.swing.JLabel();
        authorTitle = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnGuessAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        instructionBox = new javax.swing.JTextField();
        btnCard17 = new javax.swing.JButton();
        btnCard18 = new javax.swing.JButton();
        btnCard19 = new javax.swing.JButton();
        btnCard20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard1.setToolTipText("");
        btnCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard1ActionPerformed(evt);
            }
        });

        btnCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard2ActionPerformed(evt);
            }
        });

        btnCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard3ActionPerformed(evt);
            }
        });

        btnCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard4ActionPerformed(evt);
            }
        });

        btnCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard5ActionPerformed(evt);
            }
        });

        btnCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard6ActionPerformed(evt);
            }
        });

        btnCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard7ActionPerformed(evt);
            }
        });

        btnCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard8ActionPerformed(evt);
            }
        });

        btnCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard9ActionPerformed(evt);
            }
        });

        btnCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard10ActionPerformed(evt);
            }
        });

        btnCard11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard11ActionPerformed(evt);
            }
        });

        btnCard12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard12ActionPerformed(evt);
            }
        });

        btnCard13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard13ActionPerformed(evt);
            }
        });

        btnCard14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard14ActionPerformed(evt);
            }
        });

        btnCard15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard15ActionPerformed(evt);
            }
        });

        btnCard16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard16ActionPerformed(evt);
            }
        });

        mainTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 10, 10));
        mainTitle.setText("Matching Game");

        authorTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        authorTitle.setText("By: Mathew Borg");

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnGuessAgain.setText("Guess Again");
        btnGuessAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessAgainActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        instructionBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        instructionBox.setText("Click the Play button to start. Make sure to click Guess Again after each guess.");

        btnCard17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard17ActionPerformed(evt);
            }
        });

        btnCard18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard18ActionPerformed(evt);
            }
        });

        btnCard19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard19ActionPerformed(evt);
            }
        });

        btnCard20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardback.jpg"))); // NOI18N
        btnCard20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(authorTitle)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCard13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard16))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCard9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCard12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCard5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(mainTitle)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCard1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCard2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCard3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCard4)))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(instructionBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCard17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCard20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnPlay)
                        .addGap(47, 47, 47)
                        .addComponent(btnGuessAgain)
                        .addGap(50, 50, 50)
                        .addComponent(btnExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle)
                .addGap(5, 5, 5)
                .addComponent(authorTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCard4)
                    .addComponent(btnCard2)
                    .addComponent(btnCard1)
                    .addComponent(btnCard3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCard8)
                    .addComponent(btnCard6)
                    .addComponent(btnCard5)
                    .addComponent(btnCard7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCard12)
                    .addComponent(btnCard10)
                    .addComponent(btnCard9)
                    .addComponent(btnCard11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCard16)
                    .addComponent(btnCard14)
                    .addComponent(btnCard13)
                    .addComponent(btnCard15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCard17)
                    .addComponent(btnCard18)
                    .addComponent(btnCard19)
                    .addComponent(btnCard20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay)
                    .addComponent(btnGuessAgain)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instructionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exits program
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        CardDealer.deckinit(); //initalises card deck
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard1ActionPerformed
        CardDealer.cardClicked(1,instructionBox,btns); //calls cardClicked method  
    }//GEN-LAST:event_btnCard1ActionPerformed

    private void btnCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard2ActionPerformed
        CardDealer.cardClicked(2,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard2ActionPerformed

    private void btnCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard3ActionPerformed
        CardDealer.cardClicked(3,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard3ActionPerformed

    private void btnCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard4ActionPerformed
        CardDealer.cardClicked(4,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard4ActionPerformed

    private void btnCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard5ActionPerformed
        CardDealer.cardClicked(5,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard5ActionPerformed

    private void btnCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard6ActionPerformed
        CardDealer.cardClicked(6,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard6ActionPerformed

    private void btnCard7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard7ActionPerformed
        CardDealer.cardClicked(7,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard7ActionPerformed

    private void btnCard8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard8ActionPerformed
        CardDealer.cardClicked(8,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard8ActionPerformed

    private void btnCard9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard9ActionPerformed
        CardDealer.cardClicked(9,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard9ActionPerformed

    private void btnCard10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard10ActionPerformed
        CardDealer.cardClicked(10,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard10ActionPerformed

    private void btnCard11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard11ActionPerformed
        CardDealer.cardClicked(11,instructionBox,btns); //calls cardClicked method   
    }//GEN-LAST:event_btnCard11ActionPerformed

    private void btnCard12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard12ActionPerformed
        CardDealer.cardClicked(12,instructionBox,btns); //calls cardClicked method   
    }//GEN-LAST:event_btnCard12ActionPerformed

    private void btnCard13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard13ActionPerformed
        CardDealer.cardClicked(13,instructionBox,btns); //calls cardClicked method   
    }//GEN-LAST:event_btnCard13ActionPerformed

    private void btnCard14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard14ActionPerformed
        CardDealer.cardClicked(14,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard14ActionPerformed

    private void btnCard15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard15ActionPerformed
        CardDealer.cardClicked(15,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard15ActionPerformed

    private void btnCard16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard16ActionPerformed
        CardDealer.cardClicked(16,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard16ActionPerformed

    private void btnGuessAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessAgainActionPerformed
        //method to check for card pairs 
        CardDealer.checkPair(instructionBox,btns); 
    }//GEN-LAST:event_btnGuessAgainActionPerformed

    private void btnCard17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard17ActionPerformed
        CardDealer.cardClicked(17,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard17ActionPerformed

    private void btnCard18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard18ActionPerformed
        CardDealer.cardClicked(18,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard18ActionPerformed

    private void btnCard19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard19ActionPerformed
        CardDealer.cardClicked(19,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard19ActionPerformed

    private void btnCard20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard20ActionPerformed
        CardDealer.cardClicked(20,instructionBox,btns); //calls cardClicked method
    }//GEN-LAST:event_btnCard20ActionPerformed
    
    
    
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
    private javax.swing.JLabel authorTitle;
    private javax.swing.JButton btnCard1;
    private javax.swing.JButton btnCard10;
    private javax.swing.JButton btnCard11;
    private javax.swing.JButton btnCard12;
    private javax.swing.JButton btnCard13;
    private javax.swing.JButton btnCard14;
    private javax.swing.JButton btnCard15;
    private javax.swing.JButton btnCard16;
    private javax.swing.JButton btnCard17;
    private javax.swing.JButton btnCard18;
    private javax.swing.JButton btnCard19;
    private javax.swing.JButton btnCard2;
    private javax.swing.JButton btnCard20;
    private javax.swing.JButton btnCard3;
    private javax.swing.JButton btnCard4;
    private javax.swing.JButton btnCard5;
    private javax.swing.JButton btnCard6;
    private javax.swing.JButton btnCard7;
    private javax.swing.JButton btnCard8;
    private javax.swing.JButton btnCard9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuessAgain;
    private javax.swing.JButton btnPlay;
    private javax.swing.JTextField instructionBox;
    private javax.swing.JLabel mainTitle;
    // End of variables declaration//GEN-END:variables
}
