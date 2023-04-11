import javax.swing.JOptionPane;
public class Doa
{public static void main(String[] args)
	{String n=JOptionPane.showInputDialog("Please Enter 1st Number");
	int a=Integer.parseInt(n);
	String n1=JOptionPane.showInputDialog("Please Enter 2nd Number");
	int a1=Integer.parseInt(n1);
int b=a+a1;
JOptionPane.showMessageDialog(null,b);
}}