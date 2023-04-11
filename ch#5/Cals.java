import java.util.Scanner;
public class Cals
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	double q=0,t=0;
int c=0;
	System.out.print("\nEnter A Choices 1 Or 2 Or 3 Or 4 Or 5\n");
c=input.nextInt();
System.out.print("\nEnter Quantity\n");
q=input.nextDouble();
	switch (c)
	{case 1:
		{t=q*2.98;
		System.out.printf("\nTotal Bill Is %.2f\n",t);
		}
		break;
		case 2:
		{t=q*4.50;
		System.out.printf("\nTotal Bill Is %.2f\n",t);
		}
		break;
		case 3:
		{t=q*9.98;
		System.out.printf("\nTotal Bill Is %.2f\n",t);
		}
		break;
		case 4:
		{t=q*4.49;
		System.out.printf("\nTotal Bill Is %.2f\n",t);
		}
		break;
		case 5:
		{t=q*6.87;
		System.out.printf("\nTotal Bill Is %.2f\n",t);
		}
		break;
	}
	}}