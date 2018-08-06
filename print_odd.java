import java.io.*;
import java.util.*;
class print_odd
{
public static void main(String args[])
{
int rem=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
rem=n%10;
if(rem%2!=0)
{
System.out.print(rem+" ");
}
n=n/10;
}
}
}
