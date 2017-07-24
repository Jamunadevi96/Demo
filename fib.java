import java.io.*;
import java.util.*;
class fib
{
public static void main(String args[])
{
int sum=0,a=0,b=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;++i)
{

System.out.println(sum+" ");
sum=a+b;
a=b;
b=sum;
}
}
}
