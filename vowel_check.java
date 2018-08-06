import java.io.*;
import java.util.*;
class vowel_check
{
public static void main(String args[])
{
int count=0;
Scanner sc =new Scanner(System.in);
String s=sc.next();
if(i=0;i<s.length();i++)
{
if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='U')
count++;
}if(count>=1)
System.out.println("Yes");
else
System.out.println("No");
}
}
