package a.s.d;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Test {

	public static void main(String[] a){
	JFrame f1;
	JLabel lb1,lb2,lb3;
	JButton b1;
	JTextField tf1,tf2,tf3;

	
		
		f1=new JFrame();
		f1.setTitle("Register");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(null);
		f1.setVisible(true);
		
		lb1=new JLabel("LoginForm");
		lb1.setBounds(200, 100, 100, 30);
		f1.add(lb1);
		
		lb2=new JLabel("UserName");
		lb2.setBounds(100,200,100,25);
		f1.add(lb2);
		
		lb3=new JLabel("Password");
		lb3.setBounds(100, 250, 100, 25);
		f1.add(lb3);
		
		tf1=new JTextField(5);
		tf1.setBounds(200,250,100,20);
		f1.add(tf1);
		
		tf2=new JTextField(5);
		tf2.setBounds(200,200,100,20);
		f1.add(tf2);
		
		b1=new JButton("Submit");
		b1.setBounds(150, 300, 100,30);
		f1.add(b1);
		
	}}

    
       
