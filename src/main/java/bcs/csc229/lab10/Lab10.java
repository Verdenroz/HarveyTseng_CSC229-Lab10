/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bcs.csc229.lab10;

/**
 *
 * @author harve
 */
public class Lab10 {

    public static void main(String[] args) {
        DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail
      
      numList.printList();
        System.out.println("The size of the linkedlist: " + numList.size());

      // convert to array
       int[] arr = numList.toArray();
       
       //print array
       for(int n : arr){
            System.out.print(n + " ");
       }
      
       //find the index of 31
       System.out.println("\nThe index of 2: " + numList.indexOf(16));
       System.out.println("The index of 55: " + numList.indexOf(55));
       System.out.println("The index of 100: " + numList.indexOf(100));
       
       //find the sum of the last n elements
       numList.printList();
       System.out.println("The sum of the last 2 elements: " + numList.sumOfLast(2));
       System.out.println("The sum of the last 4 elements: " + numList.sumOfLast(4));
       System.out.println("The sum of the last 20 elements: " + numList.sumOfLast(20));
       System.out.println("The sum of the last -2 elements: " + numList.sumOfLast(-2));
       System.out.println("The sum of the last 0 elements: " + numList.sumOfLast(0));
    }
}
