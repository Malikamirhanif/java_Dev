import java.util.Scanner;
public class Tabularo
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int h=1,a,b,c;
System.out.print("\tN\tN*10\tN*100\tN*1000\n");
while(h <=5)
{a=h*10;
b=h*100;
c=h*1000;
System.out.printf("\n\t%d\t%d\t%d\t%d\n",h,a,b,c);
h=h+1;
}

}}