import java.awt.*;  
import java.awt.event.*;  
import java.util.*;
import javax.swing.*;
import java.io.*;


public class Intrest implements ActionListener,ItemListener {
	JFrame f = new JFrame("Interest Calculator"); 
	 JComboBox r1,r2,r3 ;
	 JButton b1;
	JTextField tf1,tf2,tf4;
	  JTable table;
	
	
	Intrest(){
		   
		   String type[]= {"Select-","SB Account","Fixed Deposit","Recurring Deposit"};
		   r1 = new JComboBox(type);
	        r1.setBounds(50,50,120,30);
	        f.add(r1);
	        String type2[]= {"Select-","Normal","NRI"};
			   r2 = new JComboBox(type2);
			   
			   String type3[]= {"Select-","General","Senior Citizen"};
			   r3 = new JComboBox(type3);
		      
	              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tf1=new JTextField("Enter Amount");  
		         tf1.setBounds(310,50,100,30); 
		      tf2=new JTextField("Enter Days/Month");  
		        tf2.setBounds(430,50,100,30);  
		        tf4=new JTextField();  
		        tf4.setBounds(200,150,200,50);  

		        f.add(tf4);
		        b1=new JButton("Calculate Interest");
		       
        	 b1.setBounds(430,100,150,30); 
		  
			  r2.setBounds(190,50,100,30);     
		        
		        table = new JTable();
		        
		        
		        
		        f.setSize(700, 700);
		        f.setLayout(null);
		        f.setVisible(true);
		        f.add(b1);
                        f.add(r1);
                        f.add(r2);
                        f.add(r3);
                        f.add(tf1);
                        f.add(tf2);
		        
		        b1.addActionListener(this);
		        r1.addItemListener(this);
		        r2.addActionListener(this);
		        r3.addActionListener(this);
		        tf1.addActionListener(this);
		        tf2.addActionListener(this);
		       
	}
	public void itemStateChanged(ItemEvent e)
	 
    {
	 String s = (String) r1.getItemAt(r1.getSelectedIndex()); 
        if(s.equals("SB Account"))
        {
        	 
        	f.add(tf1);
        	f.add(tf2);
			 
		        f.add(b1);
		        
		        f.add(r2);
	           
        }
        
        else if(s.equals("Select-")) {
        	f.add(tf1);
			f.add(tf2);
			
			   r2.setVisible(false);
			   r3.setVisible(false);
			b1.setVisible(false);
        	tf1.setVisible(false);
        	 tf2.setVisible(false);
	          
        }
        else
        {
        	 tf1.setBounds(310,50,100,30);  
        	f.add(tf1);
			f.add(tf2);
			
			 b1.setBounds(280,100,150,30);  
		        f.add(b1);
		        
		        r3.setBounds(190,50,100,30);
		        f.add(r3);
		        
		        b1.setVisible(true);
		        r2.setVisible(false);
		        r3.setVisible(true);
        	tf1.setVisible(true);
	           tf2.setVisible(true);
	         
        }
				
	}
	public static void main(String[] args) {
		new Intrest();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 double amount;
		double interest;
		 String s1 = (String) r1.getItemAt(r1.getSelectedIndex()); 
		if(e.getSource() == b1 && s1.equals("SB Account"))
		{
			Account obj=new SBAccount();
			interest=obj.calculateInterest();
			tf4.setText("Interest Gained : "+interest);
		}
		else if(e.getSource() == b1 && s1.equals("Fixed Deposit")) {
			Account obj=new FDAccount();
			interest=obj.calculateInterest();
			tf4.setText("Interest Gained : "+interest);
		}
		else if(e.getSource() == b1 && s1.equals("Recurring Deposit")) {
			Account obj=new RDAccount();
			 interest=obj.calculateInterest();
			tf4.setText("Interest Gained : "+interest);
		}
		
	}
	
	abstract class Account{
		double interestRate;
		double amount;
		abstract double calculateInterest();
	}

	class FDAccount extends Account{
		int days;
		@Override
		double calculateInterest() {
			 amount=Double. parseDouble(tf1.getText());
			  days=Integer.parseInt(tf2.getText());
			 String s3 = (String) r3.getItemAt(r3.getSelectedIndex()); 
			if(amount<=10000000) {
			 if(s3.equals("General")) {
				if(days >= 7 && days <= 14) {
					 interestRate=(4.50*amount)/100;
				}
				else if(days >= 15 && days <= 29) {
					 interestRate=(4.75*amount)/100;
				}
				else if(days >= 30 && days < 45) {
					 interestRate=(5.50*amount)/100;
				}
				else if(days >= 45 && days <= 60) {
					 interestRate=(7*amount)/100;
				}
				else if(days >= 61 && days <= 184) {
					 interestRate=(7.5*amount)/100;
				}

				else if(days >= 185) {
					 interestRate=(8*amount)/100;
				}


			}
			else if(s3.equals("Senior Citizen"))
			{
				if(days >= 7 && days <= 14) {
					 interestRate=(5*amount)/100;
				}
				else if(days >= 15 && days <= 29) {
					 interestRate=(5.25*amount)/100;
				}	
				else if(days >= 30 && days < 45) {
					 interestRate=(6*amount)/100;
				}
				else if(days >= 45 && days <= 60) {
					 interestRate=(7.5*amount)/100;
				}
				else if(days >= 61 && days <= 184) {
					 interestRate=(8*amount)/100;
				}

				else if(days >= 185) {
					 interestRate=(8.5*amount)/100;
				}
				
			}
			}
			else if(amount>10000000) {
				if(days >= 7 && days <= 14) {
					 interestRate=(6.5*amount)/100;
				}
				else if(days >= 15 && days <= 29) {
					 interestRate=(6.75*amount)/100;
				}	
				else if(days >= 30 && days < 45) {
					 interestRate=(6.75*amount)/100;
				}
				else if(days >= 45 && days <= 60) {
					 interestRate=(8*amount)/100;
				}
				else if(days >= 61 && days <= 184) {
					 interestRate=(8.5*amount)/100;
				}
				else if(days >= 185) {
					 interestRate=(10*amount)/100;
				}
			}
			 return interestRate;
		}
		
	}
	class RDAccount extends Account{
		int months;
		@Override
		double calculateInterest() {
			int time;
			 amount=Double. parseDouble(tf1.getText());
			  months=Integer.parseInt(tf2.getText());
			 String s3 = (String) r3.getItemAt(r3.getSelectedIndex()); 
			 
			 if(s3.equals("General")) {
					if(months==6) {
						interestRate=(7.50/2*amount)/100;
					}
					else if(months>= 9 && months < 12) {
						 interestRate=months*(7.75*amount)/100;
					}
					else if(months>= 12 && months < 15) {
						 interestRate=months*(8*amount)/100;
					}
					else if(months>= 15 && months < 18) {
						 interestRate=months*(8.25*amount)/100;
					}
					else if(months>= 18 && months<21) {
						 interestRate=months*(8.5*amount)/100;
					}

					else if(months>= 21) {
						 interestRate=months*((8.75*amount)/100);
					}


				}
				else if(s3.equals("Senior Citizen"))
				{
					if(months>=6 && months < 9){
						 interestRate=months*(8.0*amount)/100;
					}
					else if(months>= 9 && months < 12){
						 interestRate=months*(8.25*amount)/100;
					}
					else if(months>= 12 && months < 15)  {
						 interestRate=months*(8.5*amount)/100;
					}
					else if(months>= 15 && months < 18) {
						 interestRate=months*(8.75*amount)/100;
					}
					else if(months>= 18 && months<21){
						 interestRate=months*(9.0*amount)/100;
					}

					else if(months>= 21) {
						 interestRate=months*(9.25*amount)/100;
					}
					
				}
			 return interestRate;
			 
		}
		
	}
	class SBAccount extends Account{
		@Override
		double calculateInterest() {
			 amount=Double. parseDouble(tf1.getText());
			 String s2 = (String) r2.getItemAt(r2.getSelectedIndex()); 
			 if(s2.equals("Normal")) {
				 interestRate=(4*amount)/100;
			 }
			 else if(s2.equals("NRI")) {
				 interestRate=(6*amount)/100;
			 }
			 return interestRate; 
			
		}


		
	}



}
