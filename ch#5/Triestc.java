import java.util.Scanner;
public class Triestc
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	int i=0,j=0,k=0,m=1;
	for( i=1;i<=10;i++)
	{if(i !=1)
			{
			for( k=2;k<=i;k++)
			{System.out.print(" ");
			}
			}
for( j=i;j<=10;j++)
		{
			System.out.print("*");
		}
		System.out.println();

}
}}