import javax.swing.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener
{
    JLabel lb1,lb2;
    JTextField tf;
    JPasswordField jp;
    JButton bt;
    
    login()
    {
        setLayout(null);        
     
        lb1=new JLabel("Username");
        lb2=new JLabel("Password");
        tf=new JTextField();
        jp=new JPasswordField();
        bt=new JButton("Login");
        
        lb1.setBounds(100,100,100,25);
        lb2.setBounds(100,150,100,25);
        tf.setBounds(220,100,150,25);
        jp.setBounds(220,150,150,25);
        bt.setBounds(220,200,150,25);
        
        add(lb1);
        add(lb2);
        add(tf);
        add(jp);
        add(bt);
        
        bt.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100,100);
        setSize(600,400);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String u = tf.getText();
        String p = new String(jp.getPassword());   //jp.getText();
        
        //System.out.println(u);
        //System.out.println(p);
        
        if(u.equals("abc") && p.equals("123") )
        {
            JOptionPane.showMessageDialog(this, "Login Successfull !!!");
        }
        else
        {
            tf.setText("");
            jp.setText("");
            JOptionPane.showMessageDialog(this, "Invalid Username/Password");
        }
        
    }   
    
   public static void main(String[] args) 
   {
      login obj=new login();
   }   
    
}
