import java.awt.*;
import org.w3c.dom.events.MouseEvent;
import javax.swing.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passportInfoGUI implements ActionListener{
  
  JPanel panel2;


  // Font font = new Font("Garamond", Font.PLAIN, 18);
  Font font = new Font("Avenir Next LT Pro", Font.PLAIN, 15);
  
    public passportInfoGUI()
    {


    JLabel namelabel;
    // Font myFont = new Font("Agency FB", Font.PLAIN, 23);
    Font myFont = new Font("MV Boli", Font.PLAIN, 19);

    namelabel =new JLabel();
    namelabel.setText("First Name");
    namelabel.setBounds(5,20,100,30);
    namelabel.setFont(font);
    namelabel.setForeground(Color.white);


   JLabel nameLabel2 =new JLabel();
   nameLabel2.setText("Last Name");
   nameLabel2.setBounds(220,20,100,30);
   nameLabel2.setFont(font);
   nameLabel2.setForeground(Color.white);

    JTextField nameTF1 = new JTextField();
    nameTF1.setLayout(null);
    nameTF1.setBounds(5,50, 200, 30);
    nameTF1.setFont(myFont);
    nameTF1.setOpaque(false);
    nameTF1.setForeground(new Color(0x292929));
    nameTF1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));

    
    JTextField nameTF2 = new JTextField();
    nameTF2.setLayout(null);
    nameTF2.setBounds(220,50, 225, 30);
    nameTF2.setFont(myFont);
    nameTF2.setForeground(new Color(0x292929));
    nameTF2.setOpaque(false);
    nameTF2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel nationalityLabel=new JLabel();
    nationalityLabel.setText("Nationality:");
    nationalityLabel.setBounds(5,90,100,30);
    nationalityLabel.setFont(font);
    nationalityLabel.setForeground(Color.white);


    JTextField nationalityField = new JTextField();
    nationalityField.setLayout(null);
  //nationalityField.setBackground(new Color(20,200,20));;;
    nationalityField.setBounds(5,120, 440, 30);
    nationalityField.setFont(myFont);
    nationalityField.setForeground(new Color(0x292929));
    nationalityField.setOpaque(false);
    nationalityField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


    JLabel passportLabel =new JLabel();
   passportLabel.setText("Passport No:");
   passportLabel.setBounds(5,160,100,30);
   passportLabel.setFont(font);
   passportLabel.setForeground(Color.white);


    JTextField passportField = new JTextField();
    passportField.setLayout(null);
    passportField.setBounds(5,190, 440, 30);
    passportField.setFont(myFont);
    passportField.setForeground(new Color(0x292929));
    passportField.setOpaque(false);
    passportField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
 
  
    JLabel dobLabel =new JLabel();
    dobLabel.setText("Date of Birth:");
    dobLabel.setBounds(5,230,400,30);
    dobLabel.setFont(font);
    dobLabel.setForeground(Color.white);


    JTextField dobField = new JTextField();
    dobField.setLayout(null);
    dobField.setBounds(5,260, 440, 30);
    dobField.setFont(myFont);
    dobField.setForeground(new Color(0x292929));
    dobField.setOpaque(false);
    dobField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    JLabel emailLabel =new JLabel();
    emailLabel.setText("E-mail:");
    emailLabel.setBounds(5,300,400,30);
    emailLabel.setFont(font);
    emailLabel.setForeground(Color.white);


    JTextField emailField = new JTextField();
    emailField.setLayout(null);
    emailField.setBounds(5,330, 440, 30);
    emailField.setFont(myFont);
    emailField.setForeground(new Color(0x292929));
    emailField.setOpaque(false);
    emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
 
    JLabel issueLabel =new JLabel();
    issueLabel.setText("Issue Date:");
    issueLabel.setBounds(5,370,200,30);
    issueLabel.setFont(font);
    issueLabel.setForeground(Color.white);

    JTextField issueField = new JTextField();
    issueField.setLayout(null);
    issueField.setBounds(5,400, 200, 30);
    issueField.setFont(myFont);
    issueField.setForeground(new Color(0x292929));
    issueField.setOpaque(false);
    issueField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
 
 
    JLabel expiryLabel =new JLabel();
    expiryLabel.setText("Issue Date:");
    expiryLabel.setBounds(220,370,200,30);
    expiryLabel.setFont(font);
    expiryLabel.setForeground(Color.white);

    JTextField expiryField = new JTextField();
    expiryField.setLayout(null);
    expiryField.setBounds(220,400, 225, 30);
    expiryField.setFont(myFont);
    expiryField.setForeground(new Color(0x292929));
    expiryField.setOpaque(false);
    expiryField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel genderLabel =new JLabel();
    genderLabel.setText("Gender:");
    genderLabel.setBounds(5,440,100,30);
    genderLabel.setFont(font);
    genderLabel.setForeground(Color.white);

    String[] gen={"Male","Female"};
    JComboBox genderCombo = new JComboBox<>(gen);
    genderCombo.setLayout(null);
    genderCombo.setBounds(65,440, 50, 30);
    genderCombo.setBackground(new Color(0x0097c2));
    genderCombo.setForeground(new Color(0x292929));
 
    JLabel ageLabel =new JLabel();
    ageLabel.setText("Age:");
    ageLabel.setBounds(220,440,50,30);
    ageLabel.setFont(font);
    ageLabel.setForeground(Color.white);

   
    Integer a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
        41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
        81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,
        116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150};
    JComboBox ageCombo = new JComboBox<>(a);
    ageCombo.setLayout(null);
    ageCombo.setBounds(260,440, 50, 30);
    ageCombo.setSelectedIndex(17);
    ageCombo.setBackground(new Color(0x0097c2));
    ageCombo.setForeground(new Color(0x292929));
 

   JButton submitButton =new JButton();
   submitButton.setText("Submit");
   submitButton.setBounds(150,520,130,30);
   submitButton.setBackground(new Color(0x292929));
   submitButton.setFocusable(false);
   submitButton.addActionListener(this);
   submitButton.setForeground(new Color(0xFFFFFF));
   //setOpaque(false);
   //submitButton.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(100,10,10));



  

    panel2= new JPanel();
    panel2.setPreferredSize(new Dimension(450,600));
    panel2.setBackground(new Color(0x0097c2));
    panel2.setLayout(null);
    panel2.add(nameTF1);
    panel2.add(nameTF2);
    panel2.add(namelabel);
    panel2.add(dobLabel);
    panel2.add(dobField);
    panel2.add(emailLabel);
    panel2.add(emailField);
    panel2.add(nameLabel2);
    panel2.add(nationalityLabel);
    panel2.add(nationalityField);
    panel2.add(passportLabel);
    panel2.add(passportField);
    panel2.add(issueField);
    panel2.add(issueLabel);
    panel2.add(expiryLabel);
    panel2.add(expiryField);
    panel2.add(genderCombo);
    panel2.add(genderLabel);
    panel2.add(ageLabel);
    panel2.add(ageCombo);
    panel2.add(submitButton);

    // panel2.setMinimumSize(new DimensionUIResource(425, 400));

   
  JButton imgButton =new JButton();
  imgButton.setIcon(new ImageIcon(("pass.jpg")));
  imgButton.setText("");
  imgButton.setBounds(0,0,700,600);
  imgButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
  imgButton.setBackground(new Color(250,250,250));

  imgButton.setOpaque(false);
  imgButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));

 
  JPanel panel1=new JPanel();
  panel1.setPreferredSize(new Dimension(700,600));
  panel1.setBackground(new Color(2, 247, 166 ));
  panel1.setLayout(null);
  panel1.add(imgButton);
  // panel1.setMinimumSize(new Dimension(675,600));
 
  
    JFrame frame = new JFrame();
    frame.setTitle("Passport Information Collect");
    frame.setSize(1170,640);
    frame.setMinimumSize(new Dimension(1169,640));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel1);
    frame.add(panel2);
    frame.setLayout(new GridBagLayout());
    frame.setLocation(1920/2-585, 1080/2-320);
    

    frame.getContentPane().setBackground(new Color( 0x292929));
    frame.setVisible(true);
    
}


public static void main(String[] args)
{
   new passportInfoGUI();
  
}


@Override
public void actionPerformed(ActionEvent e) {
  {
  
 

}
}
} 
