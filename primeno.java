import java.io.*;
import java.util.*;
class primeno
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
System.out.println("Primeno");
else
System.out.println("Not a prime no");
}
}
}
