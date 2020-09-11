import java.awt.event.*;
import javax.swing.*;

class fr11 extends JFrame implements ActionListener
{
    JTextField tf;
    JButton bt;
    JTextArea ta;
    JScrollPane jsp;
    
    fr11()
    {
        setLayout(null);        
       
        ta=new JTextArea();
        jsp=new JScrollPane(ta);        
        tf=new JTextField();    
        bt=new JButton("Send");               
        
        ta.setEditable(false);
        
        jsp.setBounds(100,100,300,300);
        tf.setBounds(100,420,200,30);    
        bt.setBounds(320,420,150,30);
      
        add(jsp);
        add(tf);   
        add(bt);
        
        bt.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 600);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       String s = tf.getText();
       ta.append("User 1: "+s+"\n");
       tf.setText("");
       tf.requestFocus();       
    }    
    
    public static void main(String[] args)
    {
        fr11 obj = new fr11();
    }
}
