/*******************************************************
 * file: palindrome
 * description :check a no is palindrome or not
 * Author : jo
 * Date:03/10/2023
 */
package javalab;
import java.util.Scanner;
public class palindrome {
	public static void main (String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string");
	 String name= sc.next();
	 boolean ispal= check(name);
	 if(ispal==true)
		 System.out.println("string is palindrome");
	 else
		 System.out.println("string is not palindrome");
	}
	static boolean check(String name)
	      {
		char [] chararray=name.toCharArray();
		int length= name.length();
		for(int i=0;i<length/2;i++)
		{
		 if(chararray[i]!=chararray[length-1-i])
		 return false;
		}
	     return true;
		}
}
