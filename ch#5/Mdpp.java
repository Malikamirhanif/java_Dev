import java.util.Scanner;
public class Mdpp
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		{int i=0,j=0,k=0,l=0,h=0,h1=0;
		System.out.print("\nEnter limit\n");
		l=input.nextInt();
		h=l/2;
		h1=h;
		for(i=1;i<h+1;i++)
		{if(i!=h+1)
			{for(j=i;j<h;j++)
				{System.out.print(" ");
				}
			}
			for(k=1;k<=i;k++)
			{System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<h;i++)
		{
			{for(j=1;j<=i;j++)
				{System.out.print(" ");
				}
			}
			for(k=i;k<h;k++)
			{System.out.print("* ");
			}
			System.out.println();
		}
		}
	}
}