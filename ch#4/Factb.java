import java.util.Scanner;
public class Factb
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int i=0,n=0,f=1,j=1,s=1,m=1;
	System.out.print("\nEnter Limit\n");
	n=input.nextInt();
	for(i=1;i<=n;i++)
	{for(j=1;j<=i;j++)
	{f=f*i;
	}
	m=(i/f);
s=s+m;
	}
	System.out.printf("\nFactorial is %d\n",s);
	}
}