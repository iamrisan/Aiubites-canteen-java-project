import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aboutus extends JFrame implements ActionListener {
    
    JLabel l1;	   
	JButton backButton;
    JPanel P1;
    public aboutus()
    {
        super("aboutus");
        this.setSize(1000,700);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setBackground(new Color(216,228,250));
        P1.setLayout(null);
	   l1 = new JLabel(new ImageIcon(getClass().getResource("/test/aboutus.png")));
	   l1.setBounds(0,1,1000,665);
	   P1.add(l1);
	    ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(55,2, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.white);
        backButton.setOpaque(false);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);
	   		
		setVisible(true);  
	    backButton.addActionListener(this);
		   this.add(P1);
	}	
	public void actionPerformed(ActionEvent ae){
		
		 if (ae.getSource() == backButton) {
            Home h = new Home();
			this.setVisible(false);
		    h.setVisible(true);       }
	}
	
	public static void main(String [] args)
	{
		aboutus m = new aboutus();
		
	}
}