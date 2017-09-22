public class HelloWorld{
    
   public static String urlify(String s){
        StringBuilder Modified = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                Modified.append("%20");
            }
            else{
                Modified.append(s.charAt(i));
            }
        }
        return Modified.toString();
    }

     public static void main(String []args){
        String s1 = "My Name Is Alaap";
        String n = urlify(s1);
        System.out.println(n);
     }
}
