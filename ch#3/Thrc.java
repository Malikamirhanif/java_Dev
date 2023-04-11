public class Thrc
{private String fname;
private String lname;
private int dd;
private int mm;
private int yy;
private static int age1;
private int tr;
public Thrc (String fname1,String lname1,int dd1,int mm1,int yy1)
{fname=fname1;
lname=lname1;
dd=dd1;
mm=mm1;
yy=yy1;
age1=yy1;
tr=0;
}
public void set(String fname2,String lname2,int dd2,int mm2,int yy2)
{fname=fname2;
lname=lname2;
 dd=dd2;
 mm=mm2;
 yy=yy2;
 age1=yy2;
}
public int age ()
{if(dd<30)
{dd=30-dd;
}
else
{mm=mm+1;}
int cd=24;
int cm=1;
int cy=2018-1;
yy=yy+1;
dd=dd+cd;
mm=mm+cm;
yy=cy-yy;
if(dd>30)
{dd=dd%30;
mm=mm+1;
}
if(mm>=12)
{mm=mm%12;
yy=yy+1;
}
age1=yy;
tr=220-age1;
return age1;
}

public void get()
{System.out.printf("\nFirst Name is %s\nLast %s\nAge is %d\n Target Heart rate %d",fname,lname,age1,tr);
}
}