import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	   
	JButton b1,b2;

    JRadioButton b3,b5;

    JPanel P1,P2;

    JTextField t1;

    JPasswordField p1;
    JCheckBox c1;


    public payment()
    {
        super("Payment");
        this.setSize(1000,700);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setBackground(new Color(216,228,250));
        P1.setLayout(null);

 
       b1 = new JButton("Back");
	   b1.setFont(new Font("Serif",Font.PLAIN,22));
	   b1.setForeground(Color.black);
	   b1.setBackground(new Color(255,230,153));
	   b1.setBounds(15,620,90,35);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);


       b2 = new JButton("Confirm");
	   b2.setFont(new Font("Serif",Font.PLAIN,24));
	   b2.setForeground(Color.black);
	   b2.setBackground(new Color(146,208,80));
	   b2.setBounds(720,465,120,40);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b2);

       b3 = new JRadioButton();
       b3.setBounds(655, 210, 20, 20);
       b3.setBackground(new Color(218,227,243));
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b3.setFocusable(false);
       P1.add(b3);

       l5= new JLabel(new ImageIcon(getClass().getResource("/test/bkash.png")));
       l5.setBounds(675, 190, 110, 70);
       P1.add(l5);

       b5 = new JRadioButton();
       b5.setBounds(820, 210, 20, 20);
       b5.setBackground(new Color(218,227,243));
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b5.setFocusable(false);
       P1.add(b5);
      

       l7= new JLabel(new ImageIcon(getClass().getResource("/test/nogod.png")));
       l7.setOpaque(true);
       l7.setBackground(Color.red);
       l7.setBounds(830, 190, 110, 70);
       P1.add(l7);

       ButtonGroup group = new ButtonGroup();
       group.add(b3);
       group.add(b5);

       l8 = new JLabel("Mobile number : ");
       l8.setFont(new Font("Serif",Font.BOLD,21));
       l8.setOpaque(true);
       l8.setBackground(new Color(218,227,243));
       l8.setBounds(550,310,160,30);
       P1.add(l8);

       t1 = new JTextField();
       t1.setFont(new Font("Serif",Font.PLAIN,21));
       t1.setBounds(720,315,220,28);
       P1.add(t1);

       l9 = new JLabel("Password : ");
       l9.setFont(new Font("Serif",Font.BOLD,21));
       l9.setOpaque(true);
       l9.setBackground(new Color(218,227,243));
       l9.setBounds(550,360,160,30);
       P1.add(l9);

       p1 = new JPasswordField();
       p1.setFont(new Font("Serif",Font.PLAIN,17));
       p1.setEchoChar('*');
       p1.setBounds(720,365,220,28);
       P1.add(p1);


       c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setForeground(Color.black);
	   c1.setBackground(new Color(255,255,255));
	   c1.setBounds(715,405,270,38);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(c1);
	      
	   l3 = new JLabel(new ImageIcon(getClass().getResource("/test/payment.png")));
	   l3.setBounds(0,0,1000,700);
	   P1.add(l3);
       
        this.add(P1);
        
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
 
        if(ae.getSource()==b1)
		{
			breakfast u = new breakfast();
			this.setVisible(false);
		    u.setVisible(true);
		}


		else if(ae.getSource()==b2)
		{
            if(!(b3.isSelected() || b5.isSelected()))
            {

                JOptionPane.showMessageDialog(this," Please select a payment method");

            }

            else if(t1.getText().length() <=0 || p1.getText().length() <=0){
                JOptionPane.showMessageDialog(this,"Fill all information");
            }

            else{

                JOptionPane.showMessageDialog(this," PAYMENT COMPLETE !!");

                JOptionPane.showMessageDialog(this,"You can collect your ticket from counter by your mobile number");

            Home s = new Home();
			this.setVisible(false);
		    s.setVisible(true);

            }
	
		}

		else if(c1.isSelected()){
			p1.setEchoChar((char)0);
		  }
		else{
			p1.setEchoChar('*');

		}

       
    }
    
    public static void main(String [] args)
	{
		payment l = new payment();
		
	}

}