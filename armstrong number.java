import java.io.*;
import java.util.*;
class armstrong number
{
public static void main(String args[])
{
int s,x,n;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<b;i++)
{
n=i;
s=0;
while(n>0)
{
x=n%10;
s=s+(x*x*x);
n=n/10;
}
if(i==s)
System.out.println(i+" ");
}
}
}
