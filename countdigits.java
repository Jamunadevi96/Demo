import java.io.*;
import java.util.*;
class countdigits
{
public static void main(String args[])
{
int count=0,rem=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
rem=n%10;
count++;
n=n/10;
}
System.out.print(count);
}
}
