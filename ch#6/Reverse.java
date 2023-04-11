import java.util.Scanner;
public class Reverse
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int a,b,c,d;
System.out.print("\nEnter A Numbers\n");
a=input.nextInt();
reverse(a);
}
public static void reverse(int a)
{int rev=0,d=0,n=0;
n=a;
do
{
d=a%10;
rev=(rev*10)+d;
a=a/10;
}
while(a!=0)
;
System.out.printf("\nAnswer %d\t",rev);
}
}