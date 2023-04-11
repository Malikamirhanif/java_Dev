import java.util.Scanner;
public class Pi
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		double i=0,l=0,e=4;
		System.out.print("\nEnter Limit\n");
		l=input.nextDouble();
		for(i=3;i<l;i+=2)
		{if(i%2!=0)
			{e=e-(4/i);
			}
			else
			{e=e+(4/i);
			}
	
		}
		System.out.printf("\nValue is %.2f\n",e);
	}
}