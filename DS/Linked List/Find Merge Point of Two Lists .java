/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node A = headA;
    Node B = headB;
    int count_A = 0;
    int count_B = 0;
    int diff;
    while(A.next != null){
        A = A.next;
        count_A++;
    }
    while(B.next != null){
        B = B.next;
        count_B++;
    }
    diff = count_B - count_A;
    if(diff<0){
        diff = -diff;
    }
    if(count_B < count_A){
        while(diff != 0){
            headA = headA.next;
            diff--;
        }
    }
    else{
        while(diff != 0){
            headB = headB.next;
            diff--;
        }
    }
    while(headA != null && headB != null){
        if(headA == headB){
            return headA.data;
        }
        headA = headA.next;
        headB = headB.next;
    }
    return 0;
}

