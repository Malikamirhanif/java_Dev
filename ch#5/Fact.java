import java.util.Scanner;
public class Fact
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	{long  i=0,j=0,f=1;
	for(i=1;i<=20;i++)
	{for(j=i;j<=i;j++)
		{f=f*j;
		}
		System.out.printf("\nFactorial of %d is\t%d\n",i,f);
	}}
		
	}
}