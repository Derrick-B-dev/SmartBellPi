import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;
import java.awt.Color;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * Description
 *
 * @version 1.0 from 01/06/2021
 * @author
 */

public class notice_board extends JFrame {
    // start attributes
    private JPanel jPanel1 = new JPanel(null, true);
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    // end attributes
    public void display (String new_msg ){

        jLabel3.setText(new_msg);
        jLabel3.setFont(new Font("Tohoma", Font.BOLD, 25));

    }
    public void display_img(String path) {
        jLabel1.setIcon(new javax.swing.ImageIcon(path));
    }

    public notice_board() {
        // Frame-Init
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 502;
        int frameHeight = 363;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("notice_board");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        // start components

        jPanel1.setBounds(1, 0, 484, 324);
        jPanel1.setOpaque(true);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        cp.add(jPanel1);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        URL resource2 = classLoader.getResource("img/QR_scan_1_1.png");

        jLabel1.setBounds(236, 87, 230, 172);

        jLabel1.setText("");
        jPanel1.add(jLabel1);
        jLabel2.setBounds(31, 92, 190, 172);
        jLabel2.setIcon(new ImageIcon("img/QR_scan_1_1.png"));
        jLabel2.setText("Scan Code to leave a Message");
        jLabel2.setHorizontalTextPosition(JLabel.CENTER);
        jLabel2.setVerticalTextPosition(JLabel.BOTTOM);
        jPanel1.add(jLabel2);
        jLabel3.setBounds(20, 11, 438, 60);
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("NOCTICE BOARD");
        jPanel1.add(jLabel3);
        jButton1.setBounds(46, 272, 171, 41);
        jButton1.setText("OK");
        jButton1.setMargin(new Insets(2, 2, 2, 2));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1_ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton2.setBounds(273, 274, 179, 41);
        jButton2.setText("Close");
        jButton2.setMargin(new Insets(2, 2, 2, 2));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2_ActionPerformed(evt);
                dispose();
            }
        });
        jPanel1.add(jButton2);
        jPanel1.setFont(new Font("Dialog", Font.PLAIN, 14));
        jPanel1.setBounds(1, -6, 484, 324);
        jButton1.setFont(new Font("Dialog", Font.PLAIN, 14));

        // end components

        setVisible(true);
    } // end of public notice_board

    // start methods

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(notice_board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notice_board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notice_board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notice_board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        new notice_board();
    } // end of main

    public void jButton1_ActionPerformed(ActionEvent evt) {
        // TODO add your code here

    } // end of jButton1_ActionPerformed

    public void jButton2_ActionPerformed(ActionEvent evt) {
        // TODO add your code here

    } // end of jButton2_ActionPerformed

    // end methods
} // end of class notice_board
