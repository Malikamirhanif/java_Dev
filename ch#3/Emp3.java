public class Emp3
{private String fname;
private String lname;
private double sal;
public Emp3 (String fname1,String lname1,double sal1)
{fname=fname1;
lname=lname1;
sal=sal1;
}
public void set (String fname2,String lname2,double sal2)
{fname=fname2;
lname=lname2;
sal=sal2;
}
public void get()
{System.out.printf("\nFirst Name Is %s\nLast %s\nSalary %f\n",fname,lname,sal);
}
public void inc()
{double z;
z=sal*(0.10);
sal=sal+z;
}
}