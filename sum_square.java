import java.io.*;
import java.util.*;
class sum_square
{
public static void main(String args[])
{
int rem=0,sum=0,m;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
rem=n%10;
m=rem*rem;
sum=sum+m;
n=n/10;
}
System.out.println(sum);
}
}
