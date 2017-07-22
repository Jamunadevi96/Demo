import java.io.*;
import java.util.*;
class rev1
{
public static void main(String args[])
{
int rev=0,r;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.print(rev);
}
}
