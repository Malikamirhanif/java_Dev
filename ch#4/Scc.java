import java.util.Scanner;
public class Scc
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int c=0,i=1,t=0,s=0;
System.out.print("\nPlease Enter List of Items\n\n\n");
while(i != 0)
{i=input.nextInt();
s=s+i;
}
t=200+(s*(9/100));
System.out.printf("\nTotal Commission Is %d\n",t);
}}