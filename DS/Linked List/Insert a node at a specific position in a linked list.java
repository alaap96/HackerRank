/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
   // You only need to complete this method. 
    Node current = head;
    Node node = new Node();
    node.data = data;
    if(position == 0){
        node.next = head;
        return node;
    }
    int i = 0;
    while(i < position - 1){
        current = current.next;
        i++;
    }
    Node temp = current.next;
    current.next = node;
    node.next = temp;
    
    return head;
}
