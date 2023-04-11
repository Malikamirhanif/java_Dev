import java.util.Scanner;
public class Largest
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int h=0,n,m=0;
while(h < 10)
{System.out.print("\nPlease Enter A Number\n");
n=input.nextInt();
if(n>m)
	m=n;
h=h+1;
}
System.out.printf("\nLargest IS %d\n",m);

}}