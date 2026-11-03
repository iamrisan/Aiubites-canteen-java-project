import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.*;

public class Homepage extends JFrame implements ActionListener{
	JPanel P1;
	
	JLabel l1,l2;
	JTextField t1;
	JPasswordField pa1;
	static JButton b1;
    JButton b2, exitButton,forgot, about, b3;
	ImageIcon i1;
	ImageIcon i2;
	JCheckBox c1;
		

	public Homepage(){
		
		this.setSize(1000,700);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
		P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setLayout(null);
		
		t1 =new JTextField("User Name");
		t1.setBounds(100,280,200,50);
		t1.setFont(new Font("Serif",Font.PLAIN,19));
		t1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                t1.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (t1.getText().isEmpty()) {
                    t1.setText("User Name");
                }
            }
        });
		P1.add(t1);
		
	   pa1 = new JPasswordField("Password");
	   
	   pa1.setFont(new Font("Serif",Font.PLAIN,19));
	   pa1.setBounds(100,350,200,50);
	   pa1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                pa1.setText("");
            }

            @Override
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
	   c1.setBackground(new Color(32,30,31));
	   c1.setBounds(100,400,200,40);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(c1);
	   
	    forgot = new JButton("Forgotten Password ?");
        forgot.setBounds(95,433, 200, 40);
        Font forgotFont = new Font("Monospace", Font.BOLD, 16);
        forgot.setBorder(BorderFactory.createEmptyBorder());
        forgot.setFont(forgotFont);
        forgot.setOpaque(false);
        forgot.setForeground(new Color(179, 63, 64));
        forgot.setOpaque(false);
        forgot.setBackground(new Color(0, 0, 0, 0));
        P1.add(forgot);
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   
	   b1 = new JButton("Login");
	   b1.setFont(new Font("Serif",Font.BOLD,20));
	   b1.setForeground(Color.white);
	   b1.setBackground(new Color(102,140,208));
	   b1.setBounds(100,480,90,35);
	   b1.addActionListener(this); 
	   b1.setFocusable(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);
	   
	   b2 = new JButton("Sign Up");
	   b2.setFont(new Font("Serif",Font.BOLD,18));
	   b2.setForeground(Color.white);
	   b2.setBackground(new Color(102,140,208));
	   b2.setBorder(null);
	   b2.setBounds(210,480,90,35);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
	   b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b2);
	   
	   b3 = new JButton("Admin Login");
	   b3.setFont(new Font("Serif",Font.BOLD,20));
	   b3.setForeground(Color.white);
	   b3.setBackground(new Color(102,140,208));
	   b3.setBounds(100,525,200,35);
	   b3.addActionListener(this); 
	   b3.setFocusable(false);
	   b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b3);
	   
	    ImageIcon exit = new ImageIcon("test/Exit.png");
        exitButton = new JButton(exit);
        exitButton.setBounds(15,607, exit.getIconWidth(), exit.getIconHeight());
        exitButton.setBackground(Color.black);
        exitButton.setOpaque(false);
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(exitButton);

        ImageIcon ab = new ImageIcon("test/about.png");
        about = new JButton(ab);
        about.setBounds(25,15, ab.getIconWidth(), ab.getIconHeight());
        about.setBackground(Color.black);
        about.setOpaque(false);
        about.setBorder(BorderFactory.createEmptyBorder());
        P1.add(about);




	    l1 = new JLabel(new ImageIcon(getClass().getResource("/test/Homepage.png")));
        l1.setBounds(0,0,1000,669);
        P1.add(l1);


       JButton b1 = new JButton();
        P1.add(b1);
        b1.requestFocusInWindow();


       this.add(P1);
       setVisible(true);
       exitButton.addActionListener(this);
	   about.addActionListener(this);
	   forgot.addActionListener(this);

    }


	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==b2)
		{
			Registration r = new Registration();
			this.setVisible(false);
		    r.setVisible(true);
		}

        else if(ae.getSource()==b1)
		{
			if(t1.getText().length() <=0 || pa1.getText().length() <=0){
				JOptionPane.showMessageDialog(this,"Fill all information");

			}


		    else {

				try {
					String userNameS = "Name            :  "+t1.getText();
					String passwordS = "Password      :  "+pa1.getText();

					BufferedReader reader = new BufferedReader(new FileReader("data\\data.txt"));

					int totalLines = 0;
					while (reader.readLine() != null)
					totalLines++;
					reader.close();

					for (int i = 0; i <= totalLines; i++) {
						String line = Files.readAllLines(Paths.get("data\\data.txt")).get(i);

						if (line.equals(userNameS)) {
							String line2 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 1));

							if (line2.equals(passwordS)) {

								JOptionPane.showMessageDialog(null, "Login Successful.");

								Home m = new Home();
								this.setVisible(false);
								m.setVisible(true);



							  String line3 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 2));
							  String line4 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 3));
							  String line5 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 4));
							  String line6 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 5));

								BufferedWriter writer = new BufferedWriter(new FileWriter("data\\login data.txt"));
				            	writer.write("" + line);
				            	writer.write("\n" + line2);
				            	writer.write("\n" + line3);
				            	writer.write("\n" + line4);
				            	writer.write("\n" + line5);
								writer.write("\n" + line6);
					            writer.close();

								

								break;
							}
						}
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Wrong User Name or Password!");
				    }
		
		    }
     	}		 else if (ae.getSource() == b3) {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
                JOptionPane.showMessageDialog(null, "By default, Admin Name and Password is : 'admin'", "Information!",
                                JOptionPane.INFORMATION_MESSAGE);
            }
		
		else if (ae.getSource() == exitButton) {
            int yesORno = JOptionPane.showConfirmDialog(null, "Are you sure want to exit ?", "Alart!",
                    JOptionPane.YES_NO_OPTION);

            if (yesORno == 0) {
                System.exit(1);
            }
        }
		
		
		else if (ae.getSource() == about) {
            Madeby m = new Madeby();
			this.setVisible(false);
			m.setVisible(true);
        }
		else if (ae.getSource() == forgot) {
          P1.setVisible(false);
            new ForgetPass();
        }

		else if(c1.isSelected()){
			pa1.setEchoChar((char)0);
		  }
		else{
			pa1.setEchoChar('*');

		}

	}


	public static void main(String [] args)
	{
		Homepage h = new Homepage();
          h.setVisible(true);
		  EventQueue.invokeLater(() -> b1.requestFocusInWindow());

	}

	
}
