
package bcs.csc229.lab10;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private int size;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
      size = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      size++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      size++;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      size++;
   }
   
   public void remove(Node currentNode) {
       if(head == null)
           return;
       
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      size--;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
   }
   
   public int size(){
       return size;
   }
   
   public int[] toArray(){
       int[] newArr = new int[this.size];
       Node node = head;
       int i = 0;
       while(node != null){
           newArr[i] = node.data;
           i++;
           node = node.next;
       }
       
       return newArr;
   }
   
   public int indexOf(int data){
       Node e = head;
       int i = 0;
       while(e != null){
           if(e.data == data){
               return i;
           }
           i++;
           e = e.next;
       }
       //returns -1 if not Node not in the list
       return -1;   
   }
   
   public int sumOfLast(int n){
       //if n is greater than size, out of bounds error will occur --> assume size elements
       if(n > size){
           n = size;
       }
       //if n is less than 0, assume 0 elements
       if(n < 0){
           n = 0;
       }
       
        int sum = 0;
        Node reverse = tail;
        for(int i = 0; i < n; i++){
            sum += reverse.data;
            reverse = reverse.previous;
        }
        return sum;
   }
  
}
