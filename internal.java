/********************************************************
 * file:internal
 * description : calculation of internal marks
 * Author : jo
 * Date:26/09/2023
 */
package javalabs;

import java.util.Scanner;

public class internal {
	public static void main (String [] args)
	{
   int attendance;
   float internalmark=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter attendance percentage");
   attendance = sc.nextInt();
    if(attendance>90)
     internalmark=10;
    if(attendance<90)
     internalmark=(float)attendance/10;
    System.out.println("internalmarks is ="+internalmark);
	}
}
