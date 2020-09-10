import java.awt.*;
import java.awt.event.*;

class fr5 extends Frame implements ActionListener
{
    TextField tf1,tf2;
    Label lb;
    Button bt1,bt2;
    
    fr5()
    {      
        setLayout(null);
        
        tf1=new TextField();
        tf2=new TextField();
        bt1=new Button("Button 1");
        bt2=new Button("Button 2");
        lb=new Label("This is Label");
        
        tf1.setBounds(100,100,150,25);
        tf2.setBounds(270,100,150,25);
        lb.setBounds(440,100,150,25);
        bt1.setBounds(100,150,150,25);
        bt2.setBounds(270,150,150,25);
        
        add(tf1);
        add(tf2);
        add(lb);
        add(bt1);
        add(bt2);
        
        // register both buttons with same listener
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        setTitle("Frame Demo 1");
        setLocation(100,100);
        setSize(600,400);
        setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {            
           String s = tf1.getText();
           lb.setText(s);
        }
        else if(e.getSource()==bt2)
        {
           tf2.setText(Math.random()+"");  
        }        
    }  
    
    public static void main(String[] args)
    {
      fr5 obj=new fr5();
    }
}

