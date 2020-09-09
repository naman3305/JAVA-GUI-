import java.awt.*;
public class polygon extends Frame{
    polygon()
    {
        setSize(600,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        int x[]={100,200,100,400};
        int y[]={100,200,300,200};
        g.drawPolygon(x, y, 4);
        
    }
    public static void main(String args[])
    {
        polygon p=new polygon();
    }
}