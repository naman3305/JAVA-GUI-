import javax.swing.*;
import javax.swing.event.*;

class fr14 extends JFrame implements ChangeListener
{
    JSlider js;
    JLabel lb;
        
    fr14()
    {
        setLayout(null);

        js=new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        lb=new JLabel("This is Label");
        
        js.setBounds(100,100,300,50);
        lb.setBounds(100,200,200,30);
        
        js.setPaintTicks(true);
        js.setMinorTickSpacing(10);

        js.setPaintLabels(true);
        js.setMajorTickSpacing(20);
        
        add(js);
        add(lb);
        
        js.addChangeListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);     
    }
    
    @Override
    public void stateChanged(ChangeEvent e)
    {
       lb.setText( js.getValue()+" DB" );
    }  
    
    public static void main(String[] args)
    {
        fr14 obj = new fr14();
    }
}
