import java.util.Scanner;
public class Seperated
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int n,r=0,d,i,v;
	System.out.print("\nPlease Enter Number\n");
	n=input.nextInt();
	do
	{d=n%10;
	r=(r*10)+d;
	n=n/10;
	}
	while (n!=0);
	for(i=0;r!=0;i++)
	{v=r%10;
System.out.printf("  %d",v);
r=r/10;
	}
	}

}