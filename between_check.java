import java.io.*;
import java.util.*;
class between_check
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter the values");
for(int i=l;i<=r;i++)
{
if(i==n)
count++;
}
if(count==1)
System.out.println("Yes");
else
System.out.println("No");

}
}
