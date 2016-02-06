package calculator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator2 extends JFrame implements ActionListener
{
    
    private JPanel row1,row2,row3,row4,row5,row6;
    private JButton backspace,CE,clear,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,Badd,Bdiv,Bmod,Bsub,Bmult,Bplusminus,Bpercentage,Bsqrt,B1divx,Bequals,Bcomma;
    private JLabel apotelesma, label1, label2, label3;
    private JMenuBar menubar;
    private JMenu file, help;
    private JMenuItem exit, about;
    private MenuHandler menuhandler;
    
    class MenuHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == exit)
            {
                System.exit(0);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Created by Aggelos Potiriadis", "About", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }
    
    
    
    public Calculator2()
    {
        super("Simple Calculator");         // Also sets title
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        
        menuhandler = new MenuHandler();
        menubar = new JMenuBar();
        
        file = new JMenu("File");
        help = new JMenu("Help");
        
        exit = new JMenuItem("Exit");
        exit.addActionListener(menuhandler);
        
        about = new JMenuItem("View Help");
        about.addActionListener(menuhandler);
        
        file.add(exit);
        menubar.add(file);
        
        help.add(about);
        menubar.add(help);
        
        
        
        
        label1 = new JLabel("              ");
        
        backspace = new JButton("Backspace");
        backspace.addActionListener(this);
        
        CE = new JButton("CE");
        CE.addActionListener(this);
        
        clear = new JButton("C");
        clear.addActionListener(this);
        
        n0 = new JButton("0");
        n0.addActionListener(this);
        
        n1 = new JButton("1");
        n1.addActionListener(this);
        
        n2 = new JButton("2");
        n2.addActionListener(this);
        
        n3 = new JButton("3");
        n3.addActionListener(this);
        
        n4 = new JButton("4");
        n4.addActionListener(this);
        
        n5 = new JButton("5");
        n5.addActionListener(this);
        
        n6 = new JButton("6");
        n6.addActionListener(this);
        
        n7 = new JButton("7");
        n7.addActionListener(this);
        
        n8 = new JButton("8");
        n8.addActionListener(this);
        
        n9 = new JButton("9");
        n9.addActionListener(this);
        
        Badd = new JButton("+ ");
        Badd.addActionListener(this);
        
        Bsub = new JButton("- ");
        Bsub.addActionListener(this);
        
        Bdiv = new JButton("/");
        Bdiv.addActionListener(this);
        
        Bmult = new JButton("*");
        Bmult.addActionListener(this);
        
        Bpercentage = new JButton(" % ");
        Bpercentage.addActionListener(this);
        
        B1divx = new JButton("1/x");
        B1divx.addActionListener(this);
        
        Bplusminus = new JButton(new Character((char) 0x00B1).toString());
        Bplusminus.addActionListener(this);
        
        Bcomma = new JButton(",");
        Bcomma.addActionListener(this);
        
        
        String s1 = new Character((char)0x221A).toString();  // ascii conversion for sqrt
        Bsqrt = new JButton(" " + s1 + " ");
        Bsqrt.addActionListener(this);
        
        Bequals = new JButton(" = ");
        Bequals.addActionListener(this);
        
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
        
        row1.add(backspace);
        row1.add(label1);
        row1.add(CE);
        row1.add(clear);
        
        row2.add(n7);
        row2.add(n8);
        row2.add(n9);
        row2.add(Bdiv);
        row2.add(Bsqrt);
        
        row3.add(n4);
        row3.add(n5);
        row3.add(n6);
        row3.add(Bmult);
        row3.add(B1divx);
        
        row4.add(n1);
        row4.add(n2);
        row4.add(n3);
        row4.add(Bsub);
        row4.add(Bpercentage);
        
        row5.add(n0);
        row5.add(Bplusminus);
        row5.add(Bcomma);
        row5.add(Badd);
        row5.add(Bequals);
        
        
        
        setJMenuBar(menubar);
        cont.add(row1);
        cont.add(row2);
        cont.add(row3);
        cont.add(row4);
        cont.add(row5);
        
        
        
        setContentPane(cont);
        
        
        
        pack();
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource() == n1)
       {
           
       } 
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        Calculator2 a = new Calculator2();
        
        
        
    }
    
}
