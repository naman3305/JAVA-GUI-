import java.awt.*;
public class oval extends Frame{
    oval()
    {
        setSize(600,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawOval(100,100,300,120);
        
        
        
    }
    public static void main(String args[])
    {
        oval o=new oval();
    }
}