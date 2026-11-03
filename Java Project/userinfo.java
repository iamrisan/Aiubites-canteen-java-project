import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.nio.file.*;
import java.io.IOException;

public class userinfo extends JFrame implements ActionListener {   
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;	   
	JButton b1,b2,b3, backButton;
    JPanel P2;
    String line1,line2,line3,line4,line5,line6;
    public userinfo()
    {
        super("user info");
        this.setSize(1000,700);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P2 = new JPanel();
        P2.setBounds(0,0,1000,700);
        P2.setLayout(null);    

        ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(15,605, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P2.add(backButton);

        l2 = new JLabel();
        l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l2.setForeground(Color.black);
        l2.setBounds(550,120,480,35);
        P2.add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l3.setForeground(Color.black);
        l3.setBounds(550,170,480,35);
        P2.add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l4.setForeground(Color.black);
        l4.setBounds(550,220,480,35);
        P2.add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l5.setForeground(Color.black);
        l5.setBounds(550,270,480,35);
        P2.add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l6.setForeground(Color.black);
        l6.setBounds(550,320,480,35);
        P2.add(l6);
		
		l7 = new JLabel();
        l7.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,20));
        l7.setForeground(Color.black);
        l7.setBounds(550,370,480,35);
        P2.add(l7);


       l8 = new JLabel(new ImageIcon(getClass().getResource("/test/userinfo.png")));
       l8.setBounds(0,0,1000,700);
       P2.add(l8);

        try {
            File file = new File("data\\login data.txt");

            if (file.exists() && file.length() > 0) {
                BufferedReader reader = new BufferedReader(new FileReader(file));

                line1 = reader.readLine();
                line2 = reader.readLine();
                line3 = reader.readLine();
                line4 = reader.readLine();
                line5 = reader.readLine();
                line6 = reader.readLine();

                reader.close();

                l2.setText(line1);
                l3.setText(line2);
                l4.setText(line3);
                l5.setText(line4);
                l6.setText(line5);
                l7.setText(line6);
            } else {
                
                System.out.println("File doesn't exist or is empty.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
			
        this.add(P2);
        backButton.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
      		
		if (ae.getSource() == backButton) {
            Home h = new Home();
			this.setVisible(false);
		    h.setVisible(true);
        }
		
    }
    public static void main(String [] args)
	{
		userinfo u = new userinfo();
		u.setVisible(true);
	}

}