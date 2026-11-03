import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener {
     JPanel P1;
     JLabel l1;
	 JButton backButton;
     JButton btn1, btn4, nBtn;
     Cursor cursor;

    Admin() {
        this.setSize(1000,700);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setLayout(null);


        cursor = new Cursor(Cursor.HAND_CURSOR);
		
		ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(15,580, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
		backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);
		

        btn1 = new JButton("User Data");
        btn1.setBounds(700, 250, 280, 50);
        btn1.setFont(new Font("Serif",Font.BOLD,33));
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
		btn1.addActionListener(this);
        P1.add(btn1);

        btn4 = new JButton("Admin Password");
        btn4.setBounds(700, 320, 280, 50);
        btn4.setFont(new Font("Serif",Font.BOLD,33));
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
		btn4.addActionListener(this);
	    P1.add(btn4);
		
		l1 = new JLabel(new ImageIcon(getClass().getResource("/test/admin.png")));
        l1.setBounds(0,0,1000,680);
        P1.add(l1);
								
		this.add(P1);
        setVisible(true);
	}
		
		public void actionPerformed(ActionEvent ae){

         if (ae.getSource() == backButton) {
            Homepage h = new Homepage();
			this.setVisible(false);
		    h.setVisible(true);
        }	
		
      else if (ae.getSource() == btn1) {

                setVisible(false);
                UserData ud = new UserData();
                ud.setVisible(true);
            }

	  else if (ae.getSource() == btn4) {

                setVisible(false);
                AdminPassword ap = new AdminPassword();
                ap.setVisible(true);
            }
        
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
    }
}