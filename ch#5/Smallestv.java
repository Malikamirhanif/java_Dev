import java.util.Scanner;
public class Smallestv
{public static void main(String[] args)
{int n=0,s=0;
Scanner input=new Scanner (System.in);
System.out.print("\nEnter Number\n");
n=input.nextInt();
s=n;
for(int i=1;i<10;i++)
{System.out.print("\nEnter Number\n");
n=input.nextInt();
if(n<s)
s=n;
}
System.out.printf("\nSmallest Is %d\n",s);
}
}