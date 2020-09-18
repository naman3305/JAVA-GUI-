import java.awt.event.*;
import javax.swing.*;

class fr9 extends JFrame implements ItemListener, ActionListener
{
    JComboBox cb;
    JLabel lb;
    JTextField tf;
    JButton bt;
    
    fr9()
    {
        setLayout(null);
        
        cb=new JComboBox();
        lb=new JLabel("This is Label");
        tf=new JTextField();
        bt=new JButton("ADD");
        
        tf.setBounds(100,50,150,30);
        bt.setBounds(270,50,100,30);
        cb.setBounds(100,100,200,30);
        lb.setBounds(100,200,200,30);        
        
        add(tf);
        add(bt);
        add(cb);
        add(lb);
        
        cb.addItem("-- Select Item --");
        cb.addItem("C");
        cb.addItem("C++");
        cb.addItem("Java");
        cb.addItem("Python");
        cb.addItem("PHP");
        
        cb.addItemListener(this);
        bt.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        int pos = cb.getSelectedIndex();
        String s = cb.getSelectedItem().toString();
        
        lb.setText("pos: "+pos+" -- "+ " Item: "+s);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
         String s=tf.getText();
         cb.addItem(s);
         tf.setText("");
         tf.requestFocus();
         
         //lb.setText("Item Added");
         JOptionPane.showMessageDialog(this, "Item Added");
    }  
    
    public static void main(String[] args)
    {
        fr9 obj = new fr9();
    }
}
