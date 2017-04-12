/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
     int counter = 0;
    Node current = head;
    while(current != null){
        current = current.next;
        counter++;
    }
    counter = counter - n;
    while(head != null){
        head = head.next;
        counter--;
        if(counter == 1){
            return head.data;
        }
    }
    return 0;
}
