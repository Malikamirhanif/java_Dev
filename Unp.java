import java.util.Scanner;
public class Unp
{public static double met(double ... par)
{double to=0;
for(double it:par)
{to=to+it;
}
return to;
}
public static void main(String [] args)
{double d1=1;
double d2=2;
double d3=3;
double d4=4;
double d5=0;
d5=met(d1,d2);
double d6=0;
d6=met(d3,d4,d5);
System.out.printf("for two parameters %.1f",d5);
System.out.printf("for three parameters %.1f",d6);
}
}