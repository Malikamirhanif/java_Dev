import java.util.Scanner;
public class Fact
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int i=0,n=0,f=1;
	System.out.print("\nEnter Number\n");
	n=input.nextInt();
	for(i=1;i<=n;i++)
	{f=f*i;
	
	}
	System.out.printf("\nFactorial is %d\n",f);
}
}