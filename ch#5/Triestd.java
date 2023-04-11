import java.util.Scanner;
public class Triestd
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	int i=0,j=0,k=0;
	for(i=1;i<=10;i++)
	{if(i !=10)
		{for(j=i;j<10;j++)
			{System.out.print(" ");
			}
		}
		for(k=1;k<=i;k++)
		{System.out.print("*");
		}
System.out.print("\n");
	}
}}