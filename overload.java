/*******************************************************
 * file:method overloading
 * description :finding area using method overloading
 * Author : jo
 * Date:10/10/2023
 */
package javalab;
import java.util.Scanner;
public class overload {
public static void main(String  [] args)
{
int l ,br;
float h,b,r;
Scanner sc =new Scanner(System.in);
System.out.println("Enter height and base of triangle");
h=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter length and breadth of rectangle");
l=sc.nextInt();
br=sc.nextInt();
System.out.println("Enter radius of circle");
r=sc.nextFloat();
shape area=new shape();
shape.area(h,b);
shape.area(l,br);
shape.area(r);
}
}
class shape
{
 public static void area (float h,float b)	{
	System.out.println("area of triangle"+(h*b)/2); }
 public static void area (int l,int b)	{
	System.out.println("area of rectangle ="+(l*b)); }
 public static void area(float r)	{
	System.out.println("area of circle="+(3.14*r*r));}
}
