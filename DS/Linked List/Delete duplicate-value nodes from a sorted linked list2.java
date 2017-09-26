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
    Node temp = head;
    Node prev = null;
    HashSet<Integer> set = new HashSet<Integer>();
    while(temp != null){
        if(set.contains(temp.data)){ // check if data is already present
            prev.next = temp.next;
        }
        else{
            set.add(temp.data); // if not insert into set and set as a prev nodegit
            prev = temp;
        }
        temp = temp.next;
    }
    return head;
}
