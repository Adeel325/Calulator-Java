/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeel.calculator.java;

/**
 *
 * @author User
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        mSqrtButton = new javax.swing.JButton();
        mSquareButton = new javax.swing.JButton();
        mOneByXButton = new javax.swing.JButton();
        mPercentageButton = new javax.swing.JButton();
        mClearButton = new javax.swing.JButton();
        mBackButton = new javax.swing.JButton();
        mDivisionButton = new javax.swing.JButton();
        mCancelEntryButton = new javax.swing.JButton();
        mEightButton = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        mMultiplicationButton = new javax.swing.JButton();
        mSevenButton = new javax.swing.JButton();
        mFiveButton = new javax.swing.JButton();
        mSixButton = new javax.swing.JButton();
        mSubtractionButton = new javax.swing.JButton();
        mFourButton = new javax.swing.JButton();
        mTwoButton = new javax.swing.JButton();
        mThreeButton = new javax.swing.JButton();
        mAdditionButton = new javax.swing.JButton();
        mOneButton = new javax.swing.JButton();
        mZeroButton = new javax.swing.JButton();
        mDotButton = new javax.swing.JButton();
        mEqualButton = new javax.swing.JButton();
        mPlusMinusButton = new javax.swing.JButton();
        mResultTextField = new javax.swing.JTextField();
        mTempLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mSqrtButton.setBackground(new java.awt.Color(255, 255, 255));
        mSqrtButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mSqrtButton.setText("sqrt");

        mSquareButton.setBackground(new java.awt.Color(255, 255, 255));
        mSquareButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mSquareButton.setText("x^2");

        mOneByXButton.setBackground(new java.awt.Color(255, 255, 255));
        mOneByXButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mOneByXButton.setText("1/x");

        mPercentageButton.setBackground(new java.awt.Color(255, 255, 255));
        mPercentageButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mPercentageButton.setText("%");

        mClearButton.setBackground(new java.awt.Color(255, 255, 255));
        mClearButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mClearButton.setText("C");
        mClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClearButtonActionPerformed(evt);
            }
        });

        mBackButton.setBackground(new java.awt.Color(255, 255, 255));
        mBackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mBackButton.setText("<--");
        mBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBackButtonActionPerformed(evt);
            }
        });

        mDivisionButton.setBackground(new java.awt.Color(255, 255, 255));
        mDivisionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mDivisionButton.setText("/");

        mCancelEntryButton.setBackground(new java.awt.Color(255, 255, 255));
        mCancelEntryButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mCancelEntryButton.setText("CE");
        mCancelEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCancelEntryButtonActionPerformed(evt);
            }
        });

        mEightButton.setBackground(new java.awt.Color(255, 255, 255));
        mEightButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mEightButton.setText("8");
        mEightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEightButtonActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("9");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        mMultiplicationButton.setBackground(new java.awt.Color(255, 255, 255));
        mMultiplicationButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mMultiplicationButton.setText("*");

        mSevenButton.setBackground(new java.awt.Color(255, 255, 255));
        mSevenButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mSevenButton.setText("7");
        mSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSevenButtonActionPerformed(evt);
            }
        });

        mFiveButton.setBackground(new java.awt.Color(255, 255, 255));
        mFiveButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mFiveButton.setText("5");
        mFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFiveButtonActionPerformed(evt);
            }
        });

        mSixButton.setBackground(new java.awt.Color(255, 255, 255));
        mSixButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mSixButton.setText("6");
        mSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSixButtonActionPerformed(evt);
            }
        });

        mSubtractionButton.setBackground(new java.awt.Color(255, 255, 255));
        mSubtractionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mSubtractionButton.setText("-");

        mFourButton.setBackground(new java.awt.Color(255, 255, 255));
        mFourButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mFourButton.setText("4");
        mFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFourButtonActionPerformed(evt);
            }
        });

        mTwoButton.setBackground(new java.awt.Color(255, 255, 255));
        mTwoButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mTwoButton.setText("2");
        mTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTwoButtonActionPerformed(evt);
            }
        });

        mThreeButton.setBackground(new java.awt.Color(255, 255, 255));
        mThreeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mThreeButton.setText("3");
        mThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mThreeButtonActionPerformed(evt);
            }
        });

        mAdditionButton.setBackground(new java.awt.Color(255, 255, 255));
        mAdditionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mAdditionButton.setText("+");

        mOneButton.setBackground(new java.awt.Color(255, 255, 255));
        mOneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mOneButton.setText("1");
        mOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOneButtonActionPerformed(evt);
            }
        });

        mZeroButton.setBackground(new java.awt.Color(255, 255, 255));
        mZeroButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mZeroButton.setText("0");
        mZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mZeroButtonActionPerformed(evt);
            }
        });

        mDotButton.setBackground(new java.awt.Color(255, 255, 255));
        mDotButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mDotButton.setText(".");
        mDotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDotButtonActionPerformed(evt);
            }
        });

        mEqualButton.setBackground(new java.awt.Color(255, 255, 255));
        mEqualButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mEqualButton.setText("=");

        mPlusMinusButton.setBackground(new java.awt.Color(255, 255, 255));
        mPlusMinusButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mPlusMinusButton.setText("+-");

        mResultTextField.setEditable(false);
        mResultTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mResultTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mResultTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mResultTextFieldActionPerformed(evt);
            }
        });

        mTempLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mTempLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mPlusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mEqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mAdditionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mFourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mSixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mSubtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mSevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mEightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mCancelEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mDivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mPercentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mSqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mOneByXButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(mResultTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mTempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mSqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mOneByXButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mPercentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mCancelEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mSevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mSixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mSubtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mFourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mAdditionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mEqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mPlusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mResultTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mResultTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mResultTextFieldActionPerformed

    private void mOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOneButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "1");
    }//GEN-LAST:event_mOneButtonActionPerformed

    private void mZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mZeroButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "0");
    }//GEN-LAST:event_mZeroButtonActionPerformed

    private void mDotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDotButtonActionPerformed
        // TODO add your handling code here:
        if(!this.isDecimal){
            this.mResultTextField.setText(this.mResultTextField.getText() + ".");
            this.isDecimal = true;
        }
        
    }//GEN-LAST:event_mDotButtonActionPerformed

    private void mTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTwoButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "2");
    }//GEN-LAST:event_mTwoButtonActionPerformed

    private void mThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mThreeButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "3");
    }//GEN-LAST:event_mThreeButtonActionPerformed

    private void mFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFourButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "4");
    }//GEN-LAST:event_mFourButtonActionPerformed

    private void mFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFiveButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "5");
    }//GEN-LAST:event_mFiveButtonActionPerformed

    private void mSixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSixButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "6");
    }//GEN-LAST:event_mSixButtonActionPerformed

    private void mSevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSevenButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "7");
    }//GEN-LAST:event_mSevenButtonActionPerformed

    private void mEightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEightButtonActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "8");
    }//GEN-LAST:event_mEightButtonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.mResultTextField.setText(this.mResultTextField.getText() + "9");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void mClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClearButtonActionPerformed
        // TODO add your handling code here:
        mResultTextField.setText("");
        mTempLabel.setText("");
    }//GEN-LAST:event_mClearButtonActionPerformed

    private void mCancelEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCancelEntryButtonActionPerformed
        // TODO add your handling code here:
        mResultTextField.setText("");
    }//GEN-LAST:event_mCancelEntryButtonActionPerformed

    private void mBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBackButtonActionPerformed
        // TODO add your handling code here:
        String value = mResultTextField.getText();
        int length = value.length();
        if(length > 0){
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length - 1);
            this.mResultTextField.setText(builder.toString());
        }
    }//GEN-LAST:event_mBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    //  Variablea
    private boolean isDecimal = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton mAdditionButton;
    private javax.swing.JButton mBackButton;
    private javax.swing.JButton mCancelEntryButton;
    private javax.swing.JButton mClearButton;
    private javax.swing.JButton mDivisionButton;
    private javax.swing.JButton mDotButton;
    private javax.swing.JButton mEightButton;
    private javax.swing.JButton mEqualButton;
    private javax.swing.JButton mFiveButton;
    private javax.swing.JButton mFourButton;
    private javax.swing.JButton mMultiplicationButton;
    private javax.swing.JButton mOneButton;
    private javax.swing.JButton mOneByXButton;
    private javax.swing.JButton mPercentageButton;
    private javax.swing.JButton mPlusMinusButton;
    private javax.swing.JTextField mResultTextField;
    private javax.swing.JButton mSevenButton;
    private javax.swing.JButton mSixButton;
    private javax.swing.JButton mSqrtButton;
    private javax.swing.JButton mSquareButton;
    private javax.swing.JButton mSubtractionButton;
    private javax.swing.JLabel mTempLabel;
    private javax.swing.JButton mThreeButton;
    private javax.swing.JButton mTwoButton;
    private javax.swing.JButton mZeroButton;
    // End of variables declaration//GEN-END:variables
}
