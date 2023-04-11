import java.util.Scanner;
public class Arithmeticsl
{public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n1,n2,s,a,p,l;
		System.out.println("Please Enter A Number ");
		n1=input.nextInt();
		System.out.println("Please Enter A Number");
		n2=input.nextInt();
		s=n1+n2;
		a=s/2;
		p=n1*n2;
		if(n1>n2)
			System.out.printf("Larger Number Is %d\n",n1);
		else
		System.out.printf("\nLarger Number Is %d",n2);
	System.out.printf("\nSum is %d",s);
	System.out.printf("\nAverage is %d\n",a);
	System.out.printf("\nProduct is %d",p);
		}	
}