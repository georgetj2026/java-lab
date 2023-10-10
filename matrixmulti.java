/*******************************************************
 * file:matrix multliplication
 * description :matrix multiplication
 * Author : jo
 * version :1.0
 * Date:10/10/2023
 */
package javalab;
import java.util.Scanner;
public class matrixmulti {
public static void main(String []args)
{
int r1,c1,r2,c2;
Scanner sc =new Scanner(System.in);
System.out.println("enter order of matrix1");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("enter order of matrix2");
r2=sc.nextInt();
c2=sc.nextInt();
int mat1[][]=new int[r1][c1];
int mat2[][]=new int[r2][c2];
int s[][]=new int[r1][c2];
if(c1==r2)
  {
  System.out.println("enter matrix 1");
  for(int i=0;i<r1;i++)
  for(int j=0;j<c1;j++) 
    mat1[i][j]=sc.nextInt(); 
  System.out.println("enter matrix 2");
  for(int i=0;i<r2;i++)
  for(int j=0;j<c2;j++) 
    mat2[i][j]=sc.nextInt();
  System.out.println("First matrix is:" );
  for(int i=0;i<r1;i++) {
	   for(int j=0;j<c2;j++) {
		  System.out.print("\t"+mat1[i][j]); 
	   		}
	      System.out.print("\n"); }
  System.out.println("Second matrix is:" );
  for(int i=0;i<r2;i++) {
	   for(int j=0;j<c2;j++) {
		  System.out.print("\t"+mat2[i][j]);
	   		}
	      System.out.println();}
  //multiplication
    for(int i=0;i<r1;i++)
     for(int j=0;j<c2;j++)
      for(int k=0;k<c1;k++)
       s[i][j]=s[i][j]+(mat1[i][k]*mat2[k][j]);
 //display
    System.out.println("Resultant matrix is");
    for(int i=0;i<r1;i++) {
     for(int j=0;j<c2;j++)
     System.out.print("\t"+s[i][j]);
    System.out.print("\n"); }
   } 
else
	System.out.println("multliplication not possible");
}
}
