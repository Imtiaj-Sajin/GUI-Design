import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class expDhakaGUI {
    static JButton []buttons = new JButton[4];
    JFrame frame;

    expDhakaGUI(){

        
        // JLabel imgJLabel=new JLabel(new ImageIcon("ex.png"));
        JLabel imgJLabel=new JLabel(new ImageIcon("te1.png"));
        imgJLabel.setSize(1280,850);
        imgJLabel.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1280,850);
        panel.setLayout(null);
        // panel.add(imgJLabel);

        // panel.setLayout(new GridLayout(2,3));

        int l=0;
        for(int i=0;i<2;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(12+630*i,175,625,320);
            buttons[i].setForeground(new Color(0xFFFFFF));
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            // buttons[i].setHorizontalTextPosition(JButton.CENTER);
		    // buttons[i].setVerticalTextPosition(JButton.BOTTOM);
            // buttons[i].setFont(new Font("Times new roman", Font.BOLD, 25));
		    // buttons[i].setIconTextGap(20);
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }        
        for(int i=2;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(12+630*l,320+175,625,320);
            buttons[i].setFocusable(false); 
            buttons[i].setForeground(new Color(0xFFFFFF));
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            // buttons[i].setHorizontalTextPosition(JButton.CENTER);
		    // buttons[i].setVerticalTextPosition(JButton.BOTTOM);
            // buttons[i].setFont(new Font("Times new roman", Font.BOLD, 25));
		    // buttons[i].setIconTextGap(20);
            
            panel.add(buttons[i]);
            l++;
        }
        
        // buttons[0].setText("Dhaka");
        buttons[0].setIcon(new ImageIcon("d1.png"));
        buttons[1].setIcon(new ImageIcon("d2.png"));
        buttons[2].setIcon(new ImageIcon("d3.png"));
        buttons[3].setIcon(new ImageIcon("d4.png"));
        

                
       
  
        panel.add(imgJLabel);
       
        frame=new JFrame();
        frame.setTitle("Dhaka");
		frame.setSize(1295,760);
        frame.add(panel);

        frame.setMinimumSize(new Dimension(1295,860));
            Toolkit tk=Toolkit.getDefaultToolkit();
            int x=(int) tk.getScreenSize().getWidth();
            int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-1295/2, y/2-760/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xe8ab00));
        frame.setIconImage(new ImageIcon("ex.png").getImage());
        frame.setResizable(false);
        frame.setVisible(true);
        

    
    }

    public static void main(String[] args) {
        new expDhakaGUI();

    }

    
}