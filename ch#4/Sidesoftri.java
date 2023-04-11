import java.util.Scanner;
public class Sidesoftri
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		int s1=0,s2=0,s3=0,s=0,h=0,b=0,p=0;
		System.out.print("\nEnter First Side Base\n");
		s1=input.nextInt();
	System.out.print("\nEnter First Side Hyp\n");
		s2=input.nextInt();
		System.out.print("\nEnter First Side Pre\n");
		s3=input.nextInt();
		h=s2*s2;
b=s1*s1;
p=s3*s3;
s=b+p;
if(h==s)
		{System.out.print("\nYES\n");
		}
		else
		{System.out.print("\nNO\n");
		}
	}
	
}