/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    // if new node points to null then make a new node and assign the value to it
    if(root==null)
      {
         Node node=new Node();
         node.data=value;
         node.left=null;
         node.right=null;
         root=node;
     }
    // if value is smaller go left
     else if(root.data>value)
          root.left=Insert(root.left,value);
         // if value is larger go right
     else if(root.data<value)
          root.right=Insert(root.right,value);

     return root;
}
