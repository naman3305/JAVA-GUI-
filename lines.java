import java.awt.*;
public class lines extends Frame{
    lines()
    {
        setSize(600,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawLine(100,100,300,300);
        g.setColor(Color.BLUE);
        g.drawLine(300,100 ,100,300);
        
        
        
    }
    public static void main(String args[])
    {
        lines l =new lines();
    }
}