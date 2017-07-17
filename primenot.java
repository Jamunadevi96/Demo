import java.io.*;
import java.util.*;
class primenot
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<b;i++)
{
n=i;
while(n>0)
{
if(n%2==0)
System.out.println(i+" ");
}
}
}
}
