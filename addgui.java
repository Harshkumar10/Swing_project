
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;

public class addgui{
	public static void main(String[] args)
	{
		addition obj = new addition();
	}
}

class addition extends JFrame implements ActionListener{
	
	/*--- inorder to make the t1,t2,b,l global we have to 
	define outside the addition class---- */
	JTextField t1,t2;
	JButton b;
	JLabel l;
	
	public addition()//constructor of class addition
	{
		t1= new JTextField(20);
		t2= new JTextField(20);
		
		b= new JButton("ok");
		
		l= new JLabel("result");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		b.addActionListener(this);//action listner is a interface
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int value=num1+num2;
		l.setText(value+" "); //value+"" is used in order to make integer into string
	}
}