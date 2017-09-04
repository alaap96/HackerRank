   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       Queue myQueue = new LinkedList<>();
       if(root == null){
           return;
       }
       Node temp= null;
       // Add root to the queue
       myQueue.add(root);
       // run this if queue is not empty
       while(!myQueue.isEmpty()){
           // remove first element and store in the temp
           temp = (Node)myQueue.remove();
           System.out.print(temp.data + " ");
           // if it has left child add it to queue
           if(temp.left != null){
               myQueue.add(temp.left);
           }
           // if it has right child add it to queue
           if(temp.right != null){
               myQueue.add(temp.right);
           }
       }
    }
