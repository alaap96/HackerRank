/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method 
    Node temp;
    Node current = head;
    if(position == 0){
        if(head.next == null){
            head = null;
            return head;
        }
        else{
            head = head.next;
            return head;
        }
    }
    int i = 0;
    while(i < position -1){
        current = current.next;
        i++;
    }
    temp = current.next;
    current.next = temp.next;
    return head;
}

