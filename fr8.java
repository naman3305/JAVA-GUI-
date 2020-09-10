import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class fr8 extends JFrame implements ItemListener
{
   JRadioButton r1,r2,r3;
   JButton bt;
   ButtonGroup brg; 
   
    fr8()
    {
        setLayout(null);
        
        brg=new ButtonGroup();
        r1=new JRadioButton("RED");
        r2=new JRadioButton("GREEN");
        r3=new JRadioButton("BLUE");
        bt=new JButton("This is Button");
        
        // Add Radio Button to a Group
        brg.add(r1);
        brg.add(r2);
        brg.add(r3);
        
        r1.setBounds(100,100,150,30);
        r2.setBounds(270,100,150,30);
        r3.setBounds(440,100,150,30);
        bt.setBounds(100,200,200,200);
        
        add(r1);
        add(r2);
        add(r3);
        add(bt);
        
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==r1)
        {
           bt.setBackground(Color.RED);
        }
        else if(e.getSource()==r2)
        {
            bt.setBackground(Color.GREEN);
        }
        else if(e.getSource()==r3)
        {
            bt.setBackground(Color.BLUE);
        }    
    }   
    
    public static void main(String[] args)
    {
        fr8 obj = new fr8();
    }
}
