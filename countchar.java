import java.io.*;
import java.util.*;
class countchar
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=s.replaceAll("\\s","");
char []ch=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
count++;
}
System.out.print(count);
}
}
