
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Himagaran
 */
public class NewJFrame extends javax.swing.JFrame {

    String[] words = {"hello", "java", "letter", "hangman", "components", "orange"};
    int num = (int) (Math.random() * 6);
    public int count1 = 0;
    public int correctCount = 0;

    public String word = words[num].toLowerCase();

    ImageIcon man1 = new ImageIcon(getClass().getResource("Head.png"));
    ImageIcon man2 = new ImageIcon(getClass().getResource("Body.png"));
    ImageIcon man3 = new ImageIcon(getClass().getResource("Left hand.png"));
    ImageIcon man4 = new ImageIcon(getClass().getResource("Right hand.png"));
    ImageIcon man5 = new ImageIcon(getClass().getResource("Left leg.png"));
    ImageIcon man6 = new ImageIcon(getClass().getResource("Full.png"));

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        HideLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        char6 = new javax.swing.JLabel();
        char4 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        char5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        display = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        char1 = new javax.swing.JLabel();
        char7 = new javax.swing.JLabel();
        char8 = new javax.swing.JLabel();
        char9 = new javax.swing.JLabel();
        char10 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        tlcount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        igcount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Incorrect guess  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 221, -1, -1));

        char6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char6.setText("X");
        jPanel2.add(char6, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 80, -1, -1));

        char4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char4.setText("X");
        jPanel2.add(char4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 80, -1, -1));

        char2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char2.setText("X");
        jPanel2.add(char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 80, -1, -1));

        char3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char3.setText("X");
        jPanel2.add(char3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 80, -1, -1));

        char5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char5.setText("X");
        jPanel2.add(char5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Try Letter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        display.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        display.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 394, -1, -1));

        input.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel2.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 149, 60, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rope stand.png"))); // NOI18N
        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 62, 242, 344));

        char1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char1.setText("X");
        jPanel2.add(char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, -1, -1));

        char7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char7.setText("X");
        jPanel2.add(char7, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 80, -1, -1));

        char8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char8.setText("X");
        jPanel2.add(char8, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 80, -1, -1));

        char9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char9.setText("X");
        jPanel2.add(char9, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 80, -1, -1));

        char10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        char10.setText("X");
        jPanel2.add(char10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        Heading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 102, 0));
        Heading.setText("Welcome to the Hangman Game!");
        jPanel2.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 22, 499, 26));

        tlcount.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tlcount.setForeground(new java.awt.Color(255, 0, 0));
        tlcount.setText("7");
        jPanel2.add(tlcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 30, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Tries left");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        igcount.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        igcount.setForeground(new java.awt.Color(255, 0, 0));
        igcount.setText("0");
        jPanel2.add(igcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 20));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] arr = new char[10];

        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }
        int count = 0;
        try {

            char letter = input.getText().charAt(0);
            if (Character.isLetter(letter)) {
                for (int i = 0; i < word.length(); i++) {
                    if (letter == arr[i]) {
                        switch (i) {
                            case 0:
                                char1.setText("" + letter);
                                break;
                            case 1:
                                char2.setText("" + letter);
                                break;
                            case 2:
                                char3.setText("" + letter);
                                break;
                            case 3:
                                char4.setText("" + letter);
                                break;
                            case 4:
                                char5.setText("" + letter);
                                break;
                            case 5:
                                char6.setText("" + letter);
                                break;
                            case 6:
                                char7.setText("" + letter);
                                break;
                            case 7:
                                char8.setText("" + letter);
                                break;
                            case 8:
                                char9.setText("" + letter);
                                break;
                            case 9:
                                char10.setText("" + letter);
                                break;
                            default:
                                break;
                        }
                        correctCount++;
                    } else {
                        count++;
                    }

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Incorrect input", "Type in a letter", JOptionPane.WARNING_MESSAGE);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Type in a letter\nText Field empty", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if (count == word.length()) {
            count = 0;
            count1++;
            igcount.setText("" + (count1));
        }
        tlcount.setText("" + (7 - (count1)));

        input.setText("");
        if (correctCount == word.length()) {
            Heading.setText("Congratulations!");
            JOptionPane.showMessageDialog(rootPane, "Game won!", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if (count1 == 1) {
            jButton2.setIcon(man1);
        } else if (count1 == 2) {
            jButton2.setIcon(man2);
        } else if (count1 == 3) {
            jButton2.setIcon(man3);
        } else if (count1 == 4) {
            jButton2.setIcon(man4);
        } else if (count1 == 5) {
            jButton2.setIcon(man5);
        } else if (count1 == 6) {
            jButton2.setIcon(man6);
        } else if (count1 == 7) {
            Heading.setText("The guess word was " + "\"" + word + "\"");
            JOptionPane.showMessageDialog(rootPane, "You've lost!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char10;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel char4;
    private javax.swing.JLabel char5;
    private javax.swing.JLabel char6;
    private javax.swing.JLabel char7;
    private javax.swing.JLabel char8;
    private javax.swing.JLabel char9;
    private javax.swing.JLabel display;
    private javax.swing.JLabel igcount;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel tlcount;
    // End of variables declaration//GEN-END:variables

    private void HideLabel() {
        switch (word.length()) {
            case 4:
                char5.setVisible(false);
                char6.setVisible(false);
                char7.setVisible(false);
                char8.setVisible(false);
                char9.setVisible(false);
                char10.setVisible(false);
                break;
            case 5:
                char6.setVisible(false);
                char7.setVisible(false);
                char8.setVisible(false);
                char9.setVisible(false);
                char10.setVisible(false);
                break;
            case 6:
                char7.setVisible(false);
                char8.setVisible(false);
                char9.setVisible(false);
                char10.setVisible(false);
                break;
            case 7:
                char8.setVisible(false);
                char9.setVisible(false);
                char10.setVisible(false);
                break;

            default:
                break;
        }
    }
}
