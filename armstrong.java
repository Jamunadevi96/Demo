import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int n,h,b=0,a;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
h=n;
while(h>0)
{
a=h%10;
b=b+(a*a*a);
h=h/10;
}
if(n==b)
System.out.println("Armstrong number");
else
System.out.println("not an armstrong number");
}
}
