import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1246 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];

        for(int i = 0 ; i < arr.length; i ++){
            
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int cnt = 0;
        int max = 0;
        int egg = 0;


        for(int i = 0 ; i < arr.length; i ++){
            
           for(int j = 0 ; j < arr.length; j ++){

            if(arr[i] <= arr[j]){
                cnt ++;
                if(cnt== N){
                   
                    break;
                   }
               
             
            }

           }
           sum = cnt * arr[i];
         
           if(max < sum){
            max = sum;
            egg = cnt;
           

           } 
          
           
          
           sum = 0;
           cnt = 0;
  

        }   
        System.out.print(max/egg + " ");

        System.out.print(max);
        


    }
    
}
