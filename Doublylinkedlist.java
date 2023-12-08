package javalab;
/******************************************************
 *File 	  : Doubly Linked list
 *Description: DoublyLinked List
 *Author	  :  Jo
 *Version	  : 1.0
 *Date		  : 08/12/2023
 */

import java.util.LinkedList;         //---package that includes linked list operations
import java.util.Scanner;

class DLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void insertFirst (T element)
	{
		list.addFirst(element);
	}
	public void insertLast(T element) 
	{
		list.addLast(element); 
	}
	public void InsertAtcertainPos(int index, T element)
	{
		list.add(index, element);
	}
	public void  removeAtAnyPos(int index)
	{
	 list.remove(index);	
	}
	public void display() 
	{
	 for(T element: list)   {        //----displaying elements loop
		 System.out.print(element+" ");
	 }
	System.out.println();
}}
public class Doublylinkedlist {
	public static void main(String[] args) {
		DLinkedList<Integer> doublyLinkedList = new DLinkedList<Integer>();  //--- creating object of class DLinkedlist
		Scanner sc = new Scanner(System.in);
		System.out.println("----DOUBLY LINKED LIST----");
        System.out.println("1. Insert at Firstt:");
        System.out.println("2. Insert at Last:");
        System.out.println("3. Insert after a Position:");
        System.out.println("4. Remove after a Position:");
        System.out.println("5. Display:");
        System.out.println("6. Exit");
        int choice;
		do {
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
            switch (choice) {
            case 1: 
            	System.out.println("Enter the element:");
            	int element=sc.nextInt();
            	doublyLinkedList.insertFirst(element);
            	break;
            case 2:
            	System.out.println("Enter the element:");
            	element=sc.nextInt();
            	doublyLinkedList.insertLast(element);
            	break;
            case 3:
            	System.out.println("Enter the element:");
            	element=sc.nextInt();
            	System.out.println("Enter the index:");
            	int pos = sc.nextInt();
            	doublyLinkedList.InsertAtcertainPos(pos,element );
            	break;
            case 4:
            	System.out.println("Enter the Position:");
            	pos = sc.nextInt();
            	doublyLinkedList.removeAtAnyPos(pos);
            	break;
            case 5:
            	System.out.println("Doubly Linked List:");
            	doublyLinkedList.display();
            	break;
            default:
            	System.out.println("Operation ended");
            	break;
            }
		} while(choice<6);        	
	}
}