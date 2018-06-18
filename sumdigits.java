import java.io.*;
import java.util.*;
class sumdigits
{
public static void main(String args[])
{
int sum=0,rem=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.print(sum);
}
}
