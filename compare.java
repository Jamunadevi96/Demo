import java.io.*;
import java.util.*;
class compare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=sc.nextLine();
if(s.equals(s1))
System.out.print(s);
else if(s.charAt(0)>s1.charAt(0))
System.out.print(s);
else
System.out.print(s1);
}
}
