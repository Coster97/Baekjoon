import java.io.*;
public class Bach{

    public static boolean[] arr = new boolean[1000001];
    public static String result;
    
    public static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] agrs) throws IOException {

        arr[0] = arr[1] = true;
        for(int i = 2; i <= Math.sqrt(arr.length); i ++){
            for(int j = i * i; j < arr.length; j += i){
                if(arr[j] == true){
                    continue;
                }else{
                    arr[j] = true;
                }
            }
        }
        // while(true){
            

        //     int T = Integer.parseInt(br.readLine());
            
        //     boolean ok = false;
        //     if(T != 0){
        //         for(int i = 2; i <= T/2; i ++){
        //             if(arr[i] == false && arr[T-i] == false && i + T-i == T){
                        
        //                 result = T + " = " + i + " + "+ (T-i);
        //                 bw.write(result + "\n");
        //                 ok = true;
        //                 T = Integer.parseInt(br.readLine());      
        //             }   
        //         }if(!ok){
        //         bw.write("Goldbach's conjecture is wrong.");
        //     }
           
        //     if(T == 0){
        //         bw.flush();
        //         break;
                
        //     }
      
        // }       
        while(true) {
            int n = Integer.parseInt(br.readLine());
            boolean ok = false;
            if(n == 0)
                break;
            for(int i = 2; i <= n/2; i++) {
                if(arr[i] == false && arr[n-i] == false && i + n-i == n) {
                    System.out.println(n + " = " + i + " + " + (n-i));
                    ok = true;
                    break;
                }
            }
            if(!ok)
                System.out.println("Goldbach's conjecture is wrong.");
        }
        
    }  
    
}
 
