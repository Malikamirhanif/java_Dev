import java.util.Scanner;
public class Evenodd
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int s,so,h;
int i;
for(i=0;i<5;i++)
{
System.out.print("\nEnter Integers\n");
s=input.nextInt();
h=Even(s);
if(h==1)
System.out.print("\nAnswer Is  \tYes");
else
System.out.print("\nAnswer is\tNo");
}
}
public static int Even (int a)
{int ho;
if(((a%2))==0)
return 1;
else
return 0;
}
}