 /* class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
     String R = "";
     Node temp;
     temp = root;
     int n = S.length();
     for(int i = 0; i < n;i++){
         if(S.charAt(i) == '1'){
             temp = temp.right;
             if(temp.left == null && temp.right == null){
                R = R + temp.data; 
                temp = root;                   
             }
         }
         else{
             temp = temp.left;
             if(temp.left == null && temp.right == null){
                R = R + temp.data; 
                temp = root;                   
             }
         }
        }  
    System.out.print(R);
    }
