import java.util.Scanner;
public class Lsi
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int n1,n2,n3,n4,n5,s,l;
	System.out.print("\nEnter Five Numbers\n");
	n1=input.nextInt();
	n2=input.nextInt();
	n3=input.nextInt();
	n4=input.nextInt();
	n5=input.nextInt();
	s=n1;
	l=n1;
	if(n2<s)
		s=n2;
	 if(n3<s)
		s=n3;
	 if(n4<s)
		s=n4;
	if(n5<s) 
		s=n5;
	if(n2>l)
		l=n2;
	 if (n3>l)
		l=n3;
	 if(n4>l)
		l=n4;
	if(n5>l)
		l=n5;
	System.out.printf("Smallest is%d",s);
	System.out.printf("\nLargest is%d",l);
	
	}
}