 /********************************************************
 * file:sum
 * description :sum of 2 numbers
 * Author : jo
 * Date:26/09/2023
 */
package javalabs;

import java.util.Scanner;

public class sum
{
	public static void main (String [] args)
	{
   int num1,num2,sum=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter num1");
   num1 = sc.nextInt();
   System.out.println("enter num2");
   num2= sc.nextInt();
   sum=num1+num2;
   System.out.println("sum of num1 and num2="+sum);
		}
	}

