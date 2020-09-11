import java.awt.event.*;
import javax.swing.*;

class fr12 extends JFrame implements ActionListener
{
    JButton bt1,bt2,bt3;
    JLabel lb;
    
    fr12()
    {
        setLayout(null);        
       
        bt1=new JButton("Message Dialog");
        bt2=new JButton("Confirm Dialog");
        bt3=new JButton("Input Dialog");
        
        lb=new JLabel("This is Label");
        
        bt1.setBounds(100,100,150,30);
        bt2.setBounds(100,150,150,30);
        bt3.setBounds(100,200,150,30);
        lb.setBounds(100,250,150,30);
        
        add(bt1);
        add(bt2);
        add(bt3);
        add(lb);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 600);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==bt1)
       {
           JOptionPane.showMessageDialog(this, "Hello World");
       }
       else if(e.getSource()==bt2)
       {
            int ans = JOptionPane.showConfirmDialog(this, "Are you sure u want to delete",
                                                "Delete Confirmation",
                                                JOptionPane.YES_NO_OPTION );
       
           if(ans==JOptionPane.YES_OPTION)
           {
               lb.setText("File Deleted !!!");
           }
           else if(ans==JOptionPane.NO_OPTION)
           {
               lb.setText("Delete Cancelled");
           }       
       }
       else if(e.getSource()==bt3)
       {
          String ans = JOptionPane.showInputDialog(this,"Enter Your Name");
         lb.setText("Welcome "+ans);          
       }
    }    
    
    public static void main(String[] args)
    {
        fr12 obj = new fr12();
    }
}
