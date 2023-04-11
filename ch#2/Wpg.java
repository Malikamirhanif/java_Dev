import java.util.Scanner;
public class Wpg
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int p,r,tp=0,s=0;
	System.out.printf("\nEnter Population\n");
	p=input.nextInt();
	System.out.printf("\nEnter Rate\n");
	r=input.nextInt();
	for(int i=1;i<=5;i++)
	{tp=p*r;
s=s+tp;
		System.out.printf("\nPopulation After %d Year Is %d",i,s);
	}
	}

}