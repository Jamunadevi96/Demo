import java.io.*;
import java.util.*;
class factors
{
public static void main(String args[])
{
Scnner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
System.out.print(i+" ");
}
}
}
