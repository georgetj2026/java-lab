/*******************************************************
 * file: frequency
 * description :find the frequency of a character in a string
 * Author : jo
 * Date:03/10/2023
 */
package javalab;
import java.util.Scanner;

public class frequency 
 {
	public static void main (String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string");
	 String name= sc.next();
	 int count=0;
	 System.out.println("enter the character");
	 String character= sc.next();
	 char chara=character.charAt(0);
	 char [] chararray=name.toCharArray();
	 int length= name.length();
	 for(int i=0;i<length;i++)
	   {
	   if(chararray[i]==chara)
	   count++;
	   }
	 if(count==0)
		 System.out.println("The character is not present");
	 else 
		 System.out.println("The character is present & frequency is "+count);
	}
	}
