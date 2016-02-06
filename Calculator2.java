package calculator2;

import javax.swing.*;
import java.awt.*;



public class Calculator2 extends JFrame 
{
    private JButton b1,b2,b3,b4,b5;
    private JLabel apotelesma, label1, label2, label3;
    private JPanel row1,row2,row3,row4,row5,row6;
    
    public Calculator2()
    {
        super("Calculator");         // Also sets title
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        label1 = new JLabel("                                                          ");
        b1 = new JButton("Backspace");
        b1.setBounds(50,50,45,45);
        b2 = new JButton("CE");
        b3 = new JButton("C");
        
        
        apotelesma = new JLabel("0 ", JLabel.RIGHT);
        apotelesma.setFont(new Font("Consolas", Font.BOLD, 20));
        apotelesma.setBounds(15,1,50,50);
        
        

        Container cont = getContentPane();
        GridLayout glayout = new GridLayout(6,1);
        cont.setLayout(glayout);
        
        
        FlowLayout soflo = new FlowLayout();
        
        row1 = new JPanel();
        row1.setLayout(soflo);
        row1.setBackground(Color.LIGHT_GRAY);
        row2 = new JPanel();
        row2.setLayout(soflo);
        row2.setBackground(Color.LIGHT_GRAY);
        row3 = new JPanel();
        row3.setLayout(soflo);
        row3.setBackground(Color.LIGHT_GRAY);
        row4 = new JPanel();
        row4.setLayout(soflo);
        row4.setBackground(Color.LIGHT_GRAY);
        row5 = new JPanel();
        row5.setLayout(soflo);
        row5.setBackground(Color.LIGHT_GRAY);
        
        cont.add(apotelesma);
        cont.setBackground(Color.WHITE);
        
        row1.add(b1);
        row1.add(label1);
        row1.add(b2);
        row1.add(b3);
        
        
        cont.add(row1);
        cont.add(row2);
        cont.add(row3);
        cont.add(row4);
        cont.add(row5);
        
        
        
        setContentPane(cont);
        
        
        
        
        
    }
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        Calculator2 a = new Calculator2();
        
        
        
    }
    
}
