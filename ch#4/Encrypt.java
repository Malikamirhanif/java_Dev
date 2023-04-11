import java.util.Scanner;
public class Encrypt
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		int n=0,i=0,r=0,a=0,b=0,c=0,d=0;
		System.out.print("\nEnter A Number\n");
		n=input.nextInt();
		a=n%10;
		a=a+7;
		a=a%10;
		n=n/10;
		b=n%10;
		b=b+7;
		b=b%10;
		n=n/10;
		c=n%10;
		c=c+7;
		c=c%10;
		n=n/10;
		d=n%10;
d=d+7;
d=d%10;
		n=n/10;
	System.out.printf("\n%d%d%d%d\n",b,a,d,c);
	}
}