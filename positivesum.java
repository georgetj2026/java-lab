/*******************************************************
 * file: sum of positive numbers
 * description : to find the sum of positives numbers entered 
 * Author : jo
 * Date:26/09/2023
 */
package javalabs;

import java.util.Scanner;

public class positivesum {
	public static void main (String [] args)
	{
   int num=0,sum=0;
   Scanner sc = new Scanner(System.in);
   while(num>=0) {
   sum+=num;
   System.out.println("enter the next number");
   num = sc.nextInt();
  }
   System.out.println("sum of positive numbers="+sum);
}}