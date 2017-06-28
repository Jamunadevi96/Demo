import java.io.*;
import java.util.*;
class table
{
public static void main(String args[])
{
int n,i,k;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=10;i++)
{
k=n*i;
System.out.println(n+"*"+i+"="+k);
}
}
}
