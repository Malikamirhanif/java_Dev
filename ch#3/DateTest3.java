import java.util.Scanner;
public  class DateTest3
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	Date3 obj=new Date3(12,3,2017);
	obj.disp();
	int x,y,z;
	System.out.print("\nEnter Date As Day,Month,Year\n");
	x=input.nextInt();
	y=input.nextInt();
	z=input.nextInt();
	obj.set(x,y,z);
	obj.disp();
	}
}
