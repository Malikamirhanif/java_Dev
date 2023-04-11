import java.util.Scanner;
public class ThrcTest
{public static void main(String[] args)
	{int h;
		Scanner input=new Scanner(System.in);
	Thrc obj=new Thrc ("Malik","Aamir",19,11,1994);
	obj.set("Malik","Moiz",19,11,1994);
	h=obj.age();
	obj.get();
	System.out.printf("Age is %s",h);
	}
}