import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class fr15 extends JFrame implements ActionListener        
{
    JTextField tf;
    JButton bt;
    JFileChooser jfc;
    
    fr15()
    {
        setLayout(null);

        tf=new JTextField();
        bt=new JButton("browse");
        jfc=new JFileChooser();
        
        tf.setBounds(100,100,300,30);
        bt.setBounds(100,150,150,30);
                       
        add(tf);
        add(bt);      
        
        bt.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(800, 400);
        setVisible(true);     
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
          int ans = jfc.showOpenDialog(this);
           
          if(ans==JFileChooser.APPROVE_OPTION)
          {
              File f = jfc.getSelectedFile();
              tf.setText( f.getPath() );
          }
          else
          {
              tf.setText("Cancel Clicked");
          }
    }    
    
    public static void main(String[] args)
    {
        fr15 obj = new fr15();
    }
}
