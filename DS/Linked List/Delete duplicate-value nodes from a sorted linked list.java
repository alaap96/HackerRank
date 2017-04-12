/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node current = head;
    if(current == null){
        return head;
    }
    while(current != null && current.next != null ){
        if(current.data == current.next.data){
            current.next = current.next.next;    
        }    
        else{
            current = current.next;
        }
    } 
    return head;
}