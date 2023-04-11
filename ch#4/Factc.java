import java.util.Scanner;
public class Factc
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int i=0,n=0,f=1,j=1,s=0,m=1,no=1,k=0;
	System.out.print("\nEnter Power\n");
	n=input.nextInt();
	for(i=1;i<=n;i++)
	{no=1;
		for(k=1;k<=i;k++)
		{no=no*n;
		}
		for(j=1;j<=i;j++)
	{f=f*i;
	}
	m=(no/f);
	s=s+m;
	}
	System.out.printf("\nFactorial is %d\n",s);
	}
}