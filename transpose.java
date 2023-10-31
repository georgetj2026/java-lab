/*******************************************************
 * file:matrix transpose
 * description :to find transpose of a matrix
 * Author : jo
 * version :1.0
 * Date:01/11/2023
 */
package javalab;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[][], arr2[][], row, column;
        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        column = input.nextInt();
        System.out.println();
        arr1 = new int[row][column];
        arr2 = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr1["+i+"]["+j+"] : ");
                arr1[i][j] = input.nextInt();
            } }
        System.out.println();
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                arr2[i][j] = arr1[j][i];
            }}
        System.out.println("arr1 is");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr1[i][j] + " ");
            }   
            System.out.println();  }
        System.out.println();
        System.out.println("Transpose of arr1 is");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
               System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }}}
