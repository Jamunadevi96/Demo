import java.io.*;
import java.util.*;
class armstrongnumber
{
public static void main(String args[])
{
int n,a,b,s=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<1000;i++)
{
n=i;
while(n>0)
{
a=n%10;
b=s+(a*a*a);
n=n/10;
}
if(b==i)
System.out.println(b);
}
}
}
