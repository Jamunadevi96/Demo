import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
int n,fact=1,i;
Scanner sc=new Scanner(System.in);
n=sc.next();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
