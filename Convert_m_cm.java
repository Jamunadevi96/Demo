import java.io.*;
import java.util.*;
public class Convert_m_cm
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
try
{
int A = sc.nextInt();
int B = A*1000;
int C = B*100;
System.out.println(B);
System.out.println(C);
}
catch(Exception e)
{
System.out.println("Input Error");
}
}
}
