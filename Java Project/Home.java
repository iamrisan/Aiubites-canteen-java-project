import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Home extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;	   
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JPanel P3;

    public Home()
    {
        super("Home");
        this.setSize(1000,700);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P3 = new JPanel();
        P3.setBounds(0,0,1000,700);
        P3.setBackground(new Color(216,228,250));
        P3.setLayout(null);

       b1 = new JButton("Sign Out");
       b1.setBorder(null);
	   b1.setBounds(55,605,70,32);
	   b1.setBackground(new Color(255,0,0));
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b1);
	   
	   b7 = new JButton("About Us");
       b7.setBorder(null);
	   b7.setFont(new Font("Serif",Font.BOLD,17));
	   b7.setBounds(860,605,90,37);
	   b7.setForeground(Color.black);
	   b7.setBackground(new Color(0,128,0));
	   b7.addActionListener(this);
	   b7.setFocusable(false);
       b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b7);
       
	   b2 = new JButton("Home");
	   b2.setFont(new Font("Serif",Font.BOLD,23));
	   b2.setForeground(Color.red);
	   b2.setBackground(new Color(0,0,0,200));
	   b2.setBorder(null);
	   b2.setBounds(590,135,90,35);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b2);



       b3 = new JButton("Breakfast");
	   b3.setFont(new Font("Serif",Font.BOLD,23));
	   b3.setForeground(Color.white);
	   b3.setBackground(new Color(0,0,0,200));
	   b3.setBorder(null);
	   b3.setBounds(680,135,120,35);
	   b3.addActionListener(this);
	   b3.setFocusable(false);
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b3);
    


       b4 = new JButton("Lunch");
	   b4.setFont(new Font("Serif",Font.BOLD,23));
	   b4.setForeground(Color.white);
	   b4.setBackground(new Color(0,0,0,200));
	   b4.setBorder(null);
	   b4.setBounds(800,135,100,35);
	   b4.addActionListener(this);
	   b4.setFocusable(false);
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b4);


       ImageIcon pp = new ImageIcon("test/profile.png");
       b5 = new JButton(pp);
	   b5.setOpaque(false);
	   b5.setBounds(920,9,pp.getIconWidth(), pp.getIconHeight());
	   b5.addActionListener(this);
	   b5.setBackground(Color.black);
       b5.setBorder(BorderFactory.createEmptyBorder());
	   P3.add(b5);
	   
	   b6 = new JButton("Drinks");
	   b6.setFont(new Font("Serif",Font.BOLD,23));
	   b6.setForeground(Color.white);
	   b6.setBackground(new Color(0,0,0,200));
	   b6.setBorder(null);
	   b6.setBounds(900,135,84,35);
	   b6.addActionListener(this);
	   b6.setFocusable(false);
       b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P3.add(b6);
	  
       l3 = new JLabel(new ImageIcon(getClass().getResource("/test/Home.png")));
	   l3.setBounds(0,0,1000,700);
	   P3.add(l3);

        this.add(P3);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
		
		if (ae.getSource() == b1) {
                    Homepage h = new Homepage();
                    this.setVisible(false);
					h.setVisible(true);
                }

        else if(ae.getSource()==b5)
		{
			userinfo u = new userinfo();
			this.setVisible(false);
		  u.setVisible(true);
		}

        else if(ae.getSource()==b3)
		{
			breakfast t = new breakfast();
			this.setVisible(false);
		    t.setVisible(true);
		}
		
		else if(ae.getSource()==b4)
		{
			lunch l = new lunch();
			this.setVisible(false);
		    l.setVisible(true);
		}


         else if(ae.getSource()==b7)
		{
			aboutus ab = new aboutus();
			this.setVisible(false);
		    ab.setVisible(true);
		}


        else if(ae.getSource()==b6)
		{
			drinks d = new drinks();
			this.setVisible(false);
		    d.setVisible(true);
		}
    }

    



    public static void main(String [] args)
	{
		Home m = new Home();
		
	}

}