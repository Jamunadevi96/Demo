import java.io.*;
import java.util.*;
class tsa_vol_cuboid
{
Scanner sc=new Scanner(System.in);
double l=sc.nextDouble();
double b=sc.nextDouble();
double h=sc.nextDouble();
double sa=l*b+b*h+l*h;
double tsa=2*sa;
double vol=l*b*h;
System.out.println(tsa);
System.out.println(vol);
}
}
