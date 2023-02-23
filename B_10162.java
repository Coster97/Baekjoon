import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10162 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);

        int[] arr = {300,60,10};
        int[] result = {0,0,0};
        int time = 0;

        if(N%10 != 0){
            System.out.println(-1);
        }else{
            for(int i = 0; i< arr.length; i ++){

                if(arr[i]<=N){
                   
                    while(true){
                    
                        result[i] += 1;
                        time += arr[i];
                       
                        if(time>N){
                            result[i] -= 1;
                            time -= arr[i];
                            break;
                        }
                    }
                }else{
                    continue;
                }
                if(time == N){
                    for(int j =0 ; j < result.length; j ++){
                        System.out.print(result[j] + " ");
                    }
                
                    break;
                    
                }
    
            }
           

        }
     
        
    }
    
}
