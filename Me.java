public class Me
{public static void main(String [] args)
{int total=0;
int [][] array=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
for(int [] gp:array)
{for(int gps:gp)
total+=gps;}
System.out.printf("Out put is %d",total);
}
}