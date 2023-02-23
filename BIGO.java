public class BIGO {

    static int[] arr = {1,2,3,4,5,8};
    
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
  
    } 

}
