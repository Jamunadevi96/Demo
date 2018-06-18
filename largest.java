import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int n=10;
Scanner sc=new Scanner(System.in);
int a[]=new int[n];
int largest=a[0];
int smallest=a[0];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]>largest
{
largest=a[i];
}
}
System.out.print(largest);
}
}
