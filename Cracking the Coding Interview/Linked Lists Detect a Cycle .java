/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node current = head;
Map<Node, Integer> h = new HashMap<Node,Integer>(); 
    // while current is not equals to null
    while(current != null){
       // check if this pointer exists in hash table
         if(h.containsKey(current)){
             // if this pointer exists in hash table and value equals to 1 then return true
             if(h.get(current) == 1){
                 return true;
             }
        }
        // if pointer not exists in hash table then put this in to hash table and put value 1 to it.
        if(!h.containsKey(current)){
            h.put(current,1);
        }    
        // travers the Linked list
        if(current.next != null){
               current = current.next;
           }
           else{
               break;
           }
    }
    return false;
}
