import java.io.*;
import java.util.*;
class string_palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String b="";
for(int i=s.length()-1;i>=0;i++)
{
b=b+charAt(i);
}
if(s.equals(b))
System.out.println("Yes");
else
System.out.println("No");
}
}
