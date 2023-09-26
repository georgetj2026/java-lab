/********************************************************
 * file: grade
 * description : calculation of grade
 * Author : jo
 * Date:26/09/2023
 */
package javalabs;

import java.util.Scanner;

public class grade {
	public static void main (String [] args)
	{
   int mark;
   char grade;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the mark");
   mark = sc.nextInt();
    if(mark>90)
        System.out.println("grade = S");
    else if(mark<90&mark>85)
        System.out.println("grade = A+");
    else if(mark<85&mark>80)
        System.out.println("grade = A");
    else if(mark<80&mark>75)
        System.out.println("grade = B+");
    else if(mark<75&mark>60)
        System.out.println("grade = B");
    else if(mark<60&mark>55)
        System.out.println("grade = C");
    else if(mark<55&mark>50)
        System.out.println("grade = D");
    else if(mark<50&mark>40)
        System.out.println("grade = P");
    else if(mark<40)
        System.out.println("grade = F");
	}}
    
    
    