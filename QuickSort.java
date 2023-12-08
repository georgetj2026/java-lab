package javalab;
/******************************************************
 *File 	  : Quick sort
 *Description: 
 *Author	  :  Jo
 *Version	  : 1.0
 *Date		  : 08/12/2023
 */

import java.util.Scanner;
public class QuickSort {
    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int partition(String[] array, int low, int high) {
        String pivot = array[low]; 
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, low, i); 
        return i;
    }
    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); 

        String[] strings = new String[limit];
        System.out.println("Enter the strings:");
        for (int i = 0; i < limit; i++) {
            strings[i] = sc.nextLine();
        }
        quickSort(strings, 0, limit - 1);
        System.out.print("Sorted Array : ");
        for (int i = 0; i < limit; i++) {
            System.out.print(strings[i]+"  ");
        }
    }
}