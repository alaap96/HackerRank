public class HelloWorld{
    public static boolean permutaion_palindrom(String s)
    {
        int n = s.length();
        int[] array = new int[128];
        int count = 0;
        int x = array.length;
        for(int i = 0; i < n;i++){
            int val = s.charAt(i);
            array[val]++;
            if(array[val] % 2 == 0){
                count++;
            }
            else{
                count--;
            }
        }
        return count >= -1;
    }

     public static void main(String []args){
        String palindrom = "nitin";
        String palindrom_2 = "nithin";
        
        System.out.println("nitin is a palindrom " + permutaion_palindrom(palindrom));
        System.out.println("nithin is a palindrom " + permutaion_palindrom(palindrom_2));
     }
}
