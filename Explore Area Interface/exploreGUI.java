import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exploreGUI implements ActionListener{
    JFrame frame=new JFrame();
    JButton buttons[] = new JButton[8];
    JButton bookButton=new JButton();
    JButton homeButton=new JButton();

    exploreGUI(){ 

        JLabel imgJLabel=new JLabel(new ImageIcon("images/exl.png"));
        imgJLabel.setSize(1280,850);
        imgJLabel.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBounds(5,200,1280,850);
        panel.setLayout(null);
        

        int l=0;
        for(int i=0;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+315*i,330,310,250);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }        
        for(int i=4;i<8;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+315*l,330+250,310,250);
            buttons[i].setFocusable(false); 
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
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
       
        
        homeButton.setBounds(26,60,120,50);
        homeButton.setFocusable(false); 
        homeButton.addActionListener(this);
        homeButton.setForeground(new Color(0xFFFFFF));
        homeButton.setBackground(new Color(29,29,29,10));
        homeButton.setOpaque(false);
        homeButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));       
        panel.add(homeButton);

  
        panel.add(imgJLabel);
       
        frame=new JFrame();
        frame.setTitle("Explore");
		frame.setBounds(300, 100,1295,860);
        frame.add(panel);
        frame.setMinimumSize(new Dimension(1295,860));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("images/exIcon.png").getImage());
        frame.setResizable(false);
        frame.setVisible(true);
              
    }

    public static void main(String[] args) {
        new exploreGUI();

    }

   
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource()==bookButton){
            frame.setVisible(false);
            new bookTicketGUI();
           }
           
        if(e.getSource()==homeButton){
            frame.setVisible(false);
           }
        if(e.getSource()==buttons[0]){
            frame.setVisible(false);
            new expDhaka("images/d1.png","images/d2.png","images/d3.png","images/d4.png","Dhaka");
        }
        if(e.getSource()==buttons[1]){
            frame.setVisible(false);
            new expKhulna("images/k1.png", "images/k2.png", "images/k3.png", "images/k4.png", "Khulna");

           }
        if(e.getSource()==buttons[2]){
            frame.setVisible(false);
            new expSylhet("images/s1.png", "images/s2.png", "images/s3.png", "images/s4.png", "Sylhet");
           }
        if(e.getSource()==buttons[3]){
            frame.setVisible(false);
            new expBarisal("images/b1.png", "images/b2.png", "images/b3.png", "images/b4.png", "Barisal");
        }
        if(e.getSource()==buttons[4]){
            frame.setVisible(false);
            new expRajshahi("images/r1.png","images/r2.png","images/r3.png","images/r4.png","Rajshahi");
        }
        if(e.getSource()==buttons[5]){
            frame.setVisible(false);
            new expRangpur("images/rng1.png", "images/rng2.png", "images/rng3.png", "images/rng4.png", "Rangpur");
           }
        if(e.getSource()==buttons[6]){
            frame.setVisible(false);
            new expChittagong("images/c1.png","images/c2.png","images/c3.png","images/c4.png","Chittagong");
           }
        if(e.getSource()==buttons[7]){
            frame.setVisible(false);
            new expMymensingh("images/m1.png", "images/m2.png", "images/m3.png", "images/m4.png", "Mymensingh");
           } 
               
    }
}