import java.awt.event.*;
import javax.swing.*;

class fr10 extends JFrame implements ActionListener
{
    JTextField tf;
    JPasswordField jp;
    JLabel lb1,lb2;
    JButton bt;
             
    fr10()
    {
        setLayout(null);        
       
        lb1=new JLabel("username");
        lb2=new JLabel("password");
        
        tf=new JTextField();
        jp=new JPasswordField();
        bt=new JButton("Login");
        
        lb1.setBounds(100,100,100,30);
        lb2.setBounds(100,150,100,30);        
        tf.setBounds(200,100,200,30);
        jp.setBounds(200,150,200,30);
        bt.setBounds(200,200,150,30);
        
        add(lb1);
        add(lb2);
        add(tf);
        add(jp);
        add(bt);
        
        bt.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       String u  = tf.getText();
       String p  = new String(jp.getPassword());          //jp.getText();
       
        //System.out.println(u);
        //System.out.println(p);
        
        if(u.equals("abc") && p.equals("123") )
        {
            JOptionPane.showMessageDialog(this, "Login Successfull !!!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Login Failed !!!");
        }
    }    
    
    public static void main(String[] args)
    {
        fr10 obj = new fr10();
    }
}
