import java.util.Scanner;
public class SalesComissions
{private int emp[];
private int freq[];
public SalesComissions(int emp[])
{this.emp=emp;
freq=new int[11];
}
public void setEmp(int emp[])
{this.emp=emp;
}
public int[]  getEmp()
{return emp;
}
public void calc(int emp[])
{this.emp=emp;
for(int i=0;i<10;i++)
{this.emp[i]=(200+((int)(emp[i]*0.09)));
int m=emp[i]/100;
++freq[m];
}
System.out.println("\nin calc");
for(int i=1;i<=12;i++)
{
System.out.print(i);
System.out.print("    ");
System.out.println(freq[i]);
}
}
}
