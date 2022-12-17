// import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.*;
// import javax.swing.border.Border;
// import javax.swing.border.TitledBorder;
// import javax.swing.plaf.ColorUIResource;
// import javax.swing.text.AbstractDocument.LeafElement;

import java.awt.*;
import java.awt.event.*;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
public class exploreGUI implements ActionListener{
    static JButton []buttons = new JButton[8];
    JButton bookButton=new JButton();
    JFrame frame=new JFrame();

    exploreGUI(){

        
        // JLabel imgJLabel=new JLabel(new ImageIcon("ex.png"));
        JLabel imgJLabel=new JLabel(new ImageIcon("exl.png"));
        imgJLabel.setSize(1280,850);
        imgJLabel.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBounds(5,200,1280,850);
        panel.setLayout(null);
        // panel.add(imgJLabel);

        // panel.setLayout(new GridLayout(2,3));

        int l=0;
        for(int i=0;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+315*i,330,310,250);
            buttons[i].addActionListener(this);
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
        for(int i=4;i<8;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+310*l,330+250,310,250);
            buttons[i].setFocusable(false); 
            buttons[i].addActionListener(this);
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
        buttons[0].setIcon(new ImageIcon("d.png"));
        buttons[1].setIcon(new ImageIcon("k.png"));
        buttons[2].setIcon(new ImageIcon("s.png"));
        buttons[3].setIcon(new ImageIcon("b.png"));
        buttons[4].setIcon(new ImageIcon("raj.png"));
        buttons[5].setIcon(new ImageIcon("ran.png"));
        buttons[6].setIcon(new ImageIcon("c.png"));
        buttons[7].setIcon(new ImageIcon("m.png"));

        bookButton.setBounds(1100-22,50,100+70,48);
        bookButton.setFocusable(false); 
        bookButton.addActionListener(this);
        bookButton.setForeground(new Color(0xFFFFFF));
        bookButton.setBackground(new Color(0x292929));
        bookButton.setOpaque(false);
        bookButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));       
        panel.add(bookButton);
       
  
        panel.add(imgJLabel);
       
        frame.setTitle("Exp");
		frame.setSize(1295,760);
        frame.add(panel);

        frame.setMinimumSize(new Dimension(1295,860));
            Toolkit tk=Toolkit.getDefaultToolkit();
            int x=(int) tk.getScreenSize().getWidth();
            int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-1295/2, y/2-850/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xe8ab00));
        frame.setIconImage(new ImageIcon("admin1.png").getImage());
        frame.setResizable(false);
        frame.setVisible(true);
        

    
    }

    public static void main(String[] args) {
        new exploreGUI();

    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bookButton){
            frame.setVisible(false);
           }
        if(e.getSource()==buttons[0]){
            System.out.println("jhghj");
            frame.setVisible(false);
            new expDhakaGUI();
        }
        if(e.getSource()==buttons[1]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[2]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[3]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[4]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[5]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[6]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
        if(e.getSource()==buttons[7]){
            frame.setVisible(false);
            //    new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
           }
               
    }
}