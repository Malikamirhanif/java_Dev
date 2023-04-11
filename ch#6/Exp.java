import java.util.Scanner;
public class Exp
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		int n,p,t;
System.out.print("\nEnter Number\n");
n=input.nextInt();
System.out.print("\nEnter Power\n");
p=input.nextInt();
t=intpower(n,p);
System.out.printf("\nValue Is %d\t",t);
}
public static int intpower(int no,int po)
{int i,g=1;
for(i=0;i<po;i++)
{g=g*no;}
return g;
}
		
}