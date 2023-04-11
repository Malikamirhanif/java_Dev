import java.util.Scanner;
public class Var
{
public static int pro(int... nums)
{int p=1;
for(int num:nums)
p*=num;
return p;
}
public static void main(String[] args)
{System.out.println("For Two");
System.out.printf("%d",pro(2,2));
System.out.println("For Three");
System.out.printf("%d",pro(3,3,3));
}
}