import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
int n,t,rev=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
t=n;
while(t>0)
{
rev=rev*10+(t%10);
t=t/10;
}
if(n==rev)
System.out.println("palindrome number");
else
System.out.println("not a palindrome number");
}
}


