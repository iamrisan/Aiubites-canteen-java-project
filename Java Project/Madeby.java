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

public class Madeby extends JFrame implements ActionListener{
	JPanel P1;
	JLabel l1;
    JButton backButton;		

	public Madeby(){
		
		this.setSize(1009,705);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
		P1 = new JPanel();
        P1.setBounds(0,0,1000,704);
        P1.setLayout(null);
	   
	    ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(20,605, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);

	   l1 = new JLabel(new ImageIcon(getClass().getResource("/test/Madeby.png")));
        l1.setBounds(0,0,1000,674);
        P1.add(l1);
       this.add(P1);
       setVisible(true);
       backButton.addActionListener(this);
    }
	public void actionPerformed(ActionEvent ae){
				
		 if (ae.getSource() == backButton) {
            Homepage h = new Homepage();
			this.setVisible(false);
		    h.setVisible(true);
        }
	}
	public static void main(String [] args)
	{
		Madeby m = new Madeby();     
	}	
}