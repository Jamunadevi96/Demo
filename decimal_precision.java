import java.io.*;
import java.util.*;
class decimal_precision
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double l=sc.nextDouble();
double b=sc.nextDouble();
double x=l*b;
System.out.println(String.format("%.5f",x));
}
}
