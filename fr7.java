import java.awt.event.*;
import javax.swing.*;

class fr7 extends JFrame implements ItemListener
{
    JCheckBox c1;
    JTextField tf;
    
    fr7()
    {
        setLayout(null);
        
        c1 = new JCheckBox("show",true);
        tf = new JTextField();
        
        c1.setBounds(100, 100, 150, 30);
        tf.setBounds(100, 150, 200, 30);
        
        add(c1);
        add(tf);
        
        c1.addItemListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.isSelected())
        {
            tf.setVisible(true);
        }
        else
        {
            tf.setVisible(false);
        }    
    }   
    
    public static void main(String[] args)
    {
        fr7 obj = new fr7();
    }
}
