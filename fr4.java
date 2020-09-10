import java.awt.*;
import java.awt.event.*;

class fr4 extends Frame implements ActionListener
{
    TextField tf;
    Button bt;
    
    fr4()
    {      
        setLayout(null);
        
        tf=new TextField();
        bt=new Button("This is a Button");
        
        tf.setBounds(100,100,200,30);
        bt.setBounds(100,150,200,30);
        
        add(tf);
        add(bt);

        // Register bt with ActionListener        
        bt.addActionListener(this);
        
        setTitle("Frame Demo 1");
        setLocation(100,100);
        setSize(600,400);
        setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Write your Logic Here
        tf.setText( Math.random()+"" );
    }    
    
    public static void main(String[] args)
    {
      fr4 obj=new fr4();
    }
}





