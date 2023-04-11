import java.util.Scanner;
public class GradeBookTest3
{public static void main(String[] args)
	{
Scanner input=new Scanner(System.in);
	GradeBook3 obj=new GradeBook3("Amir","cs");
	obj.set("Moiz");
System.out.printf("Instructor is %s ",obj.geti());
System.out.printf("\nInstructor's Subject is %s ",obj.getc());	

}

}