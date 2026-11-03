import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class AdminAdd extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4,tf5,tf6;
    private JComboBox securityQsn;
    private JButton btn1, btn2, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;

    AdminAdd() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("AIUBites");
        this.setSize(510, 430);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        label1 = new JLabel();
        label1.setText("Enter Information");
        label1.setBounds(100, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(45, 75, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(185, 85, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);

        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(45, 110, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(185, 120, 260, 30);
        tf2.setFont(f5);
        c.add(tf2);

        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(45, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(185, 155, 260, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        c.add(tf3);

        label1 = new JLabel();
        label1.setText("Number");
        label1.setBounds(45, 180, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(185, 190, 259, 30);
        tf4.setFont(f5);
        c.add(tf4);
        
        label1 = new JLabel();
        label1.setText("Gender");
        label1.setBounds(45, 215, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf5 = new JTextField();
        tf5.setBounds(185, 225, 260, 30);
        tf5.setFont(f5);
        c.add(tf5);
		
		label1 = new JLabel();
        label1.setText("Occupation");
        label1.setBounds(45, 250, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf6 = new JTextField();
        tf6.setBounds(185, 260, 260, 30);
        tf6.setFont(f5);
        c.add(tf6);		       
        cursor = new Cursor(Cursor.HAND_CURSOR);        
        btn1 = new JButton("Back");
        btn1.setBounds(51, 310, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(260,310, 183, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); 
                String textField2 = tf2.getText();
                String textField3 = tf3.getText(); 
                String textField4 = tf4.getText();
				String textField5 = tf5.getText();
				String textField6 = tf6.getText();
                

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || textField5.isEmpty() || textField6.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        File file = new File("data\\data.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        pw.println("             ## Added by Admin ##");
                        pw.println("Name            :  "+ textField1);
                        pw.println("Password      :  "+ textField3);
                        pw.println("Email         :  " + textField2);
                        pw.println("Mobile        :  " + textField4);
                        pw.println("Gender        :  " + textField5);
                        pw.println("Occupation    :  " + textField6);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    UserData frame = new UserData();
                    frame.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {

        AdminAdd frame = new AdminAdd();
        frame.setVisible(true);
    }
}