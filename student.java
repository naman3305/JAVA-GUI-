import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

 class students implements Comparable<students>
{
	private int rollno;
	private String name;
	private double marks;
	
	public students(int roll, String name, double marks) {
		this.rollno = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "students [rollno=" + rollno + ", name=" + name + ", marks=" + marks
				+ "]";
	}

	public int getRoll() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public void setRoll(int roll) {
		this.rollno = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	 public static Comparator<students> StuNameComparator = new Comparator<students>() {

                        @Override
			public int compare(students s1, students s2) {
				 String StudentName1 = s1.getName().toUpperCase();
				   String StudentName2 = s2.getName().toUpperCase();
			   //ascending order
			   return StudentName1.compareTo(StudentName2);

			   //descending order
			   //return StudentName2.compareTo(StudentName1);
		    }};
		    public static Comparator<students> StuRollno = new Comparator<students>() {

                            @Override
		    	public int compare(students s1, students s2) {

		    	   int rollno1 = s1.getRoll();
		    	   int rollno2 = s2.getRoll();

		    	   //For ascending order/
		    	   return rollno1-rollno2;

		    	   //For descending order/
		    	   //rollno2-rollno1;
		       }};
		       public static Comparator<students> Stumarks = new Comparator<students>() {

                                    @Override
			    	public int compare(students s1, students s2) {

			    	  double marks1 = s1.getMarks();
			    	   double marks2 = s2.getMarks();

			    	   //For ascending order/
			    	   return (int)(marks1-marks2);

			    	   //For descending order/
			    	   //rollno2-rollno1;
			       }};
	
	  @Override
	public int compareTo(students arg0) {
		// TODO Auto-generated method stub
		
		if((marks-arg0.marks)==0.00000)
		{
			return 0;
		}
		else if((marks-arg0.marks)<0.00001)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		
//		if(roll==arg0.roll)
//		{
//			return 0; 
//		}
//		else if(roll>arg0.roll)
//		{
//			return -1;
//		}
//		else
//		{
//			return 1;
//		}
			
		//return -name.compareTo(arg0.name);
	}
	
	
}

public class student extends JFrame implements ActionListener,ItemListener{
    ArrayList<students> al=new ArrayList<students>();
    JLabel l1,l2,l3;
    JTextField name,rollno,marks;
    JButton b1,b2;
   JComboBox cb;
   JTextArea ta;
    student()
    {
        setLayout(null);
        setTitle("Student Info");
        setBounds(700,200,500,700);
        setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        name=new JTextField();
        rollno=new JTextField();
        marks=new JTextField();
        l1=new JLabel("Name");
        l2=new JLabel("Roll No.");
        l3=new JLabel("Marks");
       l1.setBounds(50,50,100,25);
       name.setBounds(100,50,100,25);
       l2.setBounds(50,100,100,25);
       rollno.setBounds(100,100,100,25);
       l3.setBounds(50,150,100,25);
       marks.setBounds(100,150,100,25);
       
        b1=new JButton("Add");
        b1.setBounds(250,50,100,25);
        b1.addActionListener(this);
        b1.setBackground(Color.BLUE);
        
         b2=new JButton("Show");
        b2.setBounds(250,150,100,25);
        b2.addActionListener(this);
        b2.setBackground(Color.CYAN);

        cb=new JComboBox();
        cb.addItem("--  Sort By --");
        cb.addItem("Roll Number");
        cb.addItem("Name");
        cb.addItem("Marks");
        cb.setBounds(250,100,100,25);
        cb.addItemListener(this);
        
        ta=new JTextArea();
        ta.setBounds(50,200,400,400);
        
        add(ta);
         add(l1);
        add(name);
        add(l2);
        add(rollno);
        add(l3);
        add(marks);
        add(cb);
         add(b1);
         add(b2);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int roll=Integer.parseInt(rollno.getText());
            String nm=name.getText();
            Double mks=Double.parseDouble(marks.getText());
            students stu=new students(roll,nm,mks);
        al.add(stu);
        name.setText("");
        rollno.setText("");
        marks.setText("");
        }
        else if(ae.getSource()==b2)
        {
           
			int size=al.size();
			if(al.size()==0)
			{
				ta.append("No Data to Show");
			}
			else 
                        {
                            ta.setText("Sorted Data Acc to "+cb.getSelectedItem()+": \n");
		for(int i=0;i<al.size();i++)
                {
		ta.append("Roll No:   "+al.get(i).getRoll()+"  Name:   "+al.get(i).getName()+"  Marks:  "+al.get(i).getMarks());
		ta.append("\n");
		}
		        }  
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String s=(String)(cb.getSelectedItem());
        if(s.equals("Roll Number"))
        {
	   Collections.sort(al, students.StuRollno);
           
	}
	else if(s.equals("Name")){
	 Collections.sort(al, students.StuNameComparator);
				
	}
	else if(s.equals("Marks")) {
	 Collections.sort(al, students.Stumarks);
				
	}
			

    }
    public static void main(String args[])
    {
        new student().setVisible(true);
    }
}
