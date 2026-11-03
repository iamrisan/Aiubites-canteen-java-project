import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;
import java.nio.file.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class ForgetPass extends JFrame implements ActionListener {
	private JPanel P1;
    private JLabel l1, username;
    private JTextField t1;
    private JButton next;
    private JButton exitButton;
    private JButton backButton;
    private Container c;
    private ImageIcon forgotUser;
    private Cursor cursor;
    protected static boolean loginFlag;
    protected static int deleteLine;
	static JButton b1;

    public ForgetPass() {
		
		this.setSize(1000,700);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        P1 = new JPanel();
        P1.setBounds(0,0,1000,700);
        P1.setLayout(null);
		

        t1 =new JTextField("User Name");
		t1.setBounds(690,260,230,45);
		t1.setFont(new Font("Serif",Font.PLAIN,22));
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

        ImageIcon fnext = new ImageIcon("test/next.png");
        next = new JButton(fnext);
        next.setBounds(870, 320, 45, 45);
        next.setBackground(new Color(0, 0, 0, 0));
        next.setOpaque(false);
        next.setBorder(BorderFactory.createEmptyBorder());
        next.setCursor(cursor);
        next.setVisible(true);
        P1.add(next);

        ImageIcon back = new ImageIcon("test/Back.png");
        backButton = new JButton(back);
        backButton.setBounds(15,605, back.getIconWidth(), back.getIconHeight());
        backButton.setBackground(Color.black);
        backButton.setOpaque(false);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        P1.add(backButton);
		
		l1 = new JLabel(new ImageIcon(getClass().getResource("/test/reset1.png")));
        l1.setBounds(0,0,1000,700);
        P1.add(l1);
		
		JButton b1 = new JButton();
        P1.add(b1);
        b1.requestFocusInWindow();
        
		setVisible(true);
        this.add(P1);
        next.addActionListener(this);
        backButton.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        String user = "" + t1.getText();
        String user1 = t1.getText();
        boolean userEmpty = user1.isEmpty();
        boolean yes = false;
        int totalLines = 0;

        if (e.getSource() == next) {
            try {
                File userfile = new File("data\\data.txt");
                if (userfile.exists()) {
                    BufferedReader readFile = new BufferedReader(new FileReader("data\\data.txt"));

                    while (readFile.readLine() != null) {
                        totalLines++;
                    }
                    readFile.close();
                }

                if (userEmpty == true) {
                    showMessageDialog(null, "Enter User Name", "Error", JOptionPane.WARNING_MESSAGE);
                    yes = false;
                } else {

                    for (int i = 0; i < totalLines; i++) {

                        String line = Files.readAllLines(Paths.get("data\\data.txt")).get(i);
                        if (line.equals(user)) {
                            deleteLine = i;
                            yes = true;
                            break;

                        }
                    }
                    if (yes == true) {
                        P1.setVisible(false);
                     new ForgetPass2();
                    } else {
                        showMessageDialog(null, "Username not found", "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }

            } catch (Exception ex) {

                showMessageDialog(null, "Username no found", "Error", JOptionPane.WARNING_MESSAGE);

            }

        } else if (e.getSource() == exitButton) {
            int yesORno = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Alart!",
                    JOptionPane.YES_NO_OPTION);

            if (yesORno == 0) {
                System.exit(1);
            }
        } else if (e.getSource() == backButton) {
            P1.setVisible(false);
            new Homepage();
       }
    }
}