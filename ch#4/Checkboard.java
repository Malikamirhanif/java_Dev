import java.util.Scanner;
public class Checkboard
{public static void main(String[] args)
	{int i=1,j=0;
Scanner input=new Scanner(System.in);
	for(i=1;i<=8;i++)
	{if(i%2==0)
		{System.out.print(" ");}
	for(j=1;j<=8;j++)
	{System.out.print(" * ");
	}
	System.out.println();
}
	
}
}