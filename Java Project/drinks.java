import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class drinks extends JFrame implements ActionListener {
    
    JLabel l1,l10,l11,l12,l13,l14;
	   
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,backButton,backButto,con;

    JPanel P1,P2;
	
	JComboBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;




    public drinks()
    {
        super("drinks");
        this.setSize(1000,700);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setBackground(new Color(216,228,250));
        P1.setLayout(null);
		
		P2 = new JPanel();
        P2.setBounds(0,0,1000,700);
        P2.setBackground(new Color(216,228,250));
        P2.setLayout(null);
		
		b1 = new JButton("Lemon Juice-60tk");
	  b1.setBounds(10,400,200,50);
      b1.setBorder(null);
	  b1.setFont(new Font("Serif",Font.BOLD,22));
	  b1.setOpaque(false);
	  b1.setForeground(new Color(0,0,0));
	  b1.setBackground(new Color(0,0,155,10));
      b1.addActionListener(this);
	  b1.setFocusable(false);
      b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b1);
	  
	  String s1[]={"01","02","03","04"};
	   c1 = new JComboBox(s1);
	   c1.addActionListener(this);
	   c1.setBounds(220,415,20,22);
	   P1.add(c1);
	  
	  
	  b2 = new JButton("Tea-20tk");
	  b2.setBounds(270,400,120,50);
      b2.setBorder(null);
	  b2.setFont(new Font("Serif",Font.BOLD,22));
	  b2.setOpaque(false);
	  b2.setForeground(new Color(0,0,0));
	  b2.setBackground(new Color(0,0,155,10));
      b2.addActionListener(this);
	  b2.setFocusable(false);
      b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b2);
	  
	  String s2[]={"01","02","03","04"};
	   c2 = new JComboBox(s2);
	   c2.addActionListener(this);
	   c2.setBounds(390,415,20,22);
	   P1.add(c2);
	  
	  
	  b3 = new JButton("Fanta(250ml)-20tk");
	  b3.setBounds(480,400,230,50);
      b3.setBorder(null);
	  b3.setFont(new Font("Serif",Font.BOLD,22));
	  b3.setOpaque(false);
	  b3.setForeground(new Color(0,0,0));
	  b3.setBackground(new Color(0,0,155,10));
      b3.addActionListener(this);
	  b3.setFocusable(false);
      b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b3);
	  
	  String s3[]={"01","02","03","04"};
	   c3 = new JComboBox(s3);
	   c3.addActionListener(this);
	   c3.setBounds(720,415,20,22);
	   P1.add(c3);
	  
	  
	  b4 = new JButton("Milkshake-80tk");
	  b4.setBounds(750,400,190,50);
      b4.setBorder(null);
	  b4.setFont(new Font("Serif",Font.BOLD,22));
	  b4.setOpaque(false);
	  b4.setForeground(new Color(0,0,0));
	  b4.setBackground(new Color(0,0,155,10));
      b4.addActionListener(this);
	  b4.setFocusable(false);
      b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b4);
	  
	  String s4[]={"01","02","03","04"};
	   c4 = new JComboBox(s4);
	   c4.addActionListener(this);
	   c4.setBounds(950,415,20,22);
	   P1.add(c4);
	  
	  b5 = new JButton("Water(500ml)-20tk");
	  b5.setBounds(223,500,210,50);
      b5.setBorder(null);
	  b5.setFont(new Font("Serif",Font.BOLD,22));
	  b5.setOpaque(false);
	  b5.setForeground(new Color(0,0,0));
	  b5.setBackground(new Color(0,0,155,10));
      b5.addActionListener(this);
	  b5.setFocusable(false);
      b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b5);
	  
	  String s5[]={"01","02","03","04"};
	   c5 = new JComboBox(s5);
	   c5.addActionListener(this);
	   c5.setBounds(430,515,20,22);
	   P1.add(c5);
	  
	  
	  b6 = new JButton("Coke(250ml)-25tk");
	  b6.setBounds(510,500,190,50);
      b6.setBorder(null);
	  b6.setFont(new Font("Serif",Font.BOLD,22));
	  b6.setOpaque(false);
	  b6.setForeground(new Color(0,0,0));
	  b6.setBackground(new Color(0,0,155,10));
      b6.addActionListener(this);
	  b6.setFocusable(false);
      b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b6);
	  
	  String s6[]={"01","02","03","04"};
	   c6 = new JComboBox(s6);
	   c6.addActionListener(this);
	   c6.setBounds(700,515,20,22);
	   P1.add(c6);
	  
	  
	  b7 = new JButton("Coffe-30tk");
	  b7.setBounds(800,500,120,50);
      b7.setBorder(null);
	  b7.setFont(new Font("Serif",Font.BOLD,22));
	  b7.setOpaque(false);
	  b7.setForeground(new Color(0,0,0));
	  b7.setBackground(new Color(0,0,155,10));
      b7.addActionListener(this);
	  b7.setFocusable(false);
      b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  P1.add(b7);
	  
	  String s7[]={"01","02","03","04"};
	   c7 = new JComboBox(s7);
	   c7.addActionListener(this);
	   c7.setBounds(920,515,20,22);
	   P1.add(c7);
		
       l10 = new JLabel("Total cost   :");
	   l10.setFont(new Font("Serif",Font.BOLD,28));
	   l10.setForeground(Color.white);
	   l10.setBounds(600,350,175,28);
	   P2.add(l10);

	   l11 = new JLabel();
	   l11.setFont(new Font("Serif",Font.BOLD,27));
	   l11.setOpaque(true);
	   l11.setBackground(Color.white);
	   l11.setForeground(Color.black);
	   l11.setBounds(800,350,110,38);
	   P2.add(l11);

	   l12 = new JLabel();
	   l12.setFont(new Font("Serif",Font.BOLD,27));
	   l12.setForeground(Color.white);
	   l12.setBounds(600,200,350,30);
	   P2.add(l12);
	   
	  
	   l13 = new JLabel();
	   l13.setFont(new Font("Serif",Font.BOLD,27));
	   l13.setForeground(Color.white);
	   l13.setBounds(600,250,350,30);
	   P2.add(l13);
	   
	  
        con = new JButton("Confirm");
		con.setFont(new Font("Serif",Font.PLAIN,24));
		con.setForeground(Color.black);
		con.setBackground(new Color(146,208,80));
        con.setBounds(650,400,200,40);
		con.addActionListener(this);
        con.setFocusable(false);
        con.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(con);
		
	   
	   
	   ImageIcon bac = new ImageIcon("test/Back.png");
        backButto = new JButton(bac);
        backButto.setBounds(30,605, bac.getIconWidth(), bac.getIconHeight());
        backButto.setBackground(Color.black);
        backButto.setOpaque(false);
        backButto.setBorder(BorderFactory.createEmptyBorder());
        P2.add(backButto);
		
		l14 = new JLabel(new ImageIcon(getClass().getResource("/test/order.png")));
	   l14.setBounds(0,0,1000,700);
	   P2.add(l14);
		
		

	    ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(20,10, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);
	   
	   l1 = new JLabel(new ImageIcon(getClass().getResource("/test/drinks.png")));
	   l1.setBounds(0,0,1000,700);
	   P1.add(l1);
	   
	    
		
		
		setVisible(true);
        this.add(P1);
	    backButton.addActionListener(this);
		backButto.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		 if (ae.getSource() == backButton) {
            Home h = new Home();
			this.setVisible(false);
		    h.setVisible(true);       }
			
			
			
			else if (ae.getSource() == con) {
            payment pa = new payment();
		    this.setVisible(false);
		    pa.setVisible(true);       
			 }
			
		else if (ae.getSource() == backButto) {
			P2.setVisible(false);
			P1.setVisible(true);
			
		}
			
		else if (ae.getSource() == b1) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=60;
			int b=c1.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Lemon Juice") ;
			
			l13.setText("Quantity          : "+c1.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			
			else if (ae.getSource() == b2) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=20;
			int b=c2.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Tea") ;
			
			l13.setText("Quantity          : "+c2.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			else if (ae.getSource() == b3) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=20;
			int b=c3.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Fanta") ;
			
			l13.setText("Quantity          : "+c3.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			else if (ae.getSource() == b4) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=80;
			int b=c4.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Milkshake") ;
			
			l13.setText("Quantity          : "+c4.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			else if (ae.getSource() == b5) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=20;
			int b=c5.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Water") ;
			
			l13.setText("Quantity          : "+c5.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			else if (ae.getSource() == b6) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=25;
			int b=c6.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Coca-Cola") ;
			
			l13.setText("Quantity          : "+c6.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			else if (ae.getSource() == b7) {
			
			this.add(P2);
			P1.setVisible(false);
			P2.setVisible(true);
			
			int a=30;
			int b=c7.getSelectedIndex();
			int sum=a*(b+1);
			
			l12.setText("Selected Item   : Coffe") ;
			
			l13.setText("Quantity          : "+c7.getSelectedItem());
			
			l11.setText(String.valueOf(sum)+" Tk");
			}
			
			
			
			
	}
	
	public static void main(String [] args)
	{
		drinks m = new drinks();
		
	}
}