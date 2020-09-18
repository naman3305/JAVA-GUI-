import java.awt.Color;
import javax.swing.*;

class fr13 extends JFrame
{
    JProgressBar pbar;
        
    fr13()
    {
        setLayout(null);

        pbar=new JProgressBar(JProgressBar.HORIZONTAL, 0,100);
        
        pbar.setBounds(100,100,300,30);
        add(pbar);
        
        pbar.setStringPainted(true);
        pbar.setBackground(Color.WHITE);
        pbar.setForeground(Color.BLUE);
        pbar.setValue(50);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Frame Demo 1");
        setLocation(100, 100);
        setSize(600, 400);
        setVisible(true);
        
        // Logic to move ProgressBar
        for(int i=1;i<=100;i++)
        {
            pbar.setValue(i);
            pbar.setString(i+"%");
            
            try
            {
                Thread.sleep(100);
            }
            catch (Exception ex)
            {
               ex.printStackTrace();
            }            
        }
        
        JOptionPane.showMessageDialog(this, "Download Complete ");
    }
    
    public static void main(String[] args)
    {
        fr13 obj = new fr13();
    }
}
