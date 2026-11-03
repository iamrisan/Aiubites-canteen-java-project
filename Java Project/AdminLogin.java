import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminLogin extends JFrame implements ActionListener {

    JPanel P1;
    JLabel l1;
	JTextField t1;
	JPasswordField pa1;
    JButton exitButton,backButton;
    JCheckBox c1;
	static JButton b1;

    AdminLogin() {
        
        this.setSize(1000,700);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setLayout(null);



        t1 =new JTextField("User Name");
		t1.setBounds(700,180,200,50);
		t1.setFont(new Font("Serif",Font.PLAIN,19));
		t1.addFocusListener(new FocusListener() {
            
            public void focusGained(FocusEvent e) {
                t1.setText("");
            }

           
            public void focusLost(FocusEvent e) {
                if (t1.getText().isEmpty()) {
                    t1.setText("User Name");
                }
            }
        });
		P1.add(t1);
		
	   pa1 = new JPasswordField("Password");
	   
	   pa1.setFont(new Font("Serif",Font.PLAIN,19));
	   pa1.setBounds(700,250,200,50);
	   pa1.addFocusListener(new FocusListener() {
           
            public void focusGained(FocusEvent e) {
                pa1.setText("");
            }

            public void focusLost(FocusEvent e) {
                if (pa1.getText().isEmpty()) {
                    pa1.setText("Password");
                }
            }
        });
	   P1.add(pa1);
	   
	   c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setForeground(Color.white);
	   c1.setBackground(new Color(202,120,246));
	   c1.setBounds(700,300,200,30);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(c1);

       b1 = new JButton("Login");
	   b1.setFont(new Font("Serif",Font.BOLD,20));
	   b1.setForeground(Color.white);
	   b1.setBackground(new Color(102,140,208));
	   b1.setBounds(700,350,200,35);
	   b1.addActionListener(this); 
	   b1.setFocusable(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);
     
        ImageIcon exit = new ImageIcon("test/Exit.png");
        exitButton = new JButton(exit);
        exitButton.setBounds(15,620, exit.getIconWidth(), exit.getIconHeight());
        exitButton.setBackground(Color.black);
        exitButton.setOpaque(false);
		exitButton.addActionListener(this);
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(exitButton);
		
		ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(22,30, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
		backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);
        
		
		l1 = new JLabel(new ImageIcon(getClass().getResource("/test/adminlogin.png")));
        l1.setBounds(0,0,1000,700);
        P1.add(l1);
		
		this.add(P1);
        setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae){
     
       if (ae.getSource() == exitButton) {
            int yesORno = JOptionPane.showConfirmDialog(null, "Are you sure want to exit ?", "Alart!",
                    JOptionPane.YES_NO_OPTION);

            if (yesORno == 0) {
                System.exit(1);
            }
        }

        
        else if (ae.getSource() == backButton) {
            Homepage h = new Homepage();
			this.setVisible(false);
		    h.setVisible(true);
        }
		else if(c1.isSelected()){
			pa1.setEchoChar((char)0);
		  }
  
        else if (ae.getSource() == b1) {

                String textField1 = t1.getText().toLowerCase();
                String textField2 = pa1.getText();

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {

                        String userNameS = "Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "AIUBites!",
                                            JOptionPane.WARNING_MESSAGE);

                                   setVisible(false);
                                   Admin frame = new Admin();
                                   frame.setVisible(true);
                                   break;
                                }
                            }
                        }
                    }
					catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
    }

    public static void main(String[] args) {

        AdminLogin frame = new AdminLogin();
        frame.setVisible(true);
    }
}