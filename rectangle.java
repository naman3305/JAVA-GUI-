import java.awt.*;
public class rectangle extends Frame{
    rectangle()
    {
        setSize(600,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(100,100,300,150);
        
        
        
    }
    public static void main(String args[])
    {
        rectangle r=new rectangle();
    }
}
