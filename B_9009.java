import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B_9009 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int T = Integer.parseInt(str);


        int[] arr = new int[46];

        arr[0] = 0;
        arr[1] = arr[2] = 1;

        for(int i = 3; i < arr.length; i ++){
           arr[i] = arr[i-2] + arr[i-1];
        }
      
        int sum = 0;
        int TC;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < T; i ++){
            TC = Integer.parseInt(br.readLine());
            result.clear();
            for(int j = arr.length-1; j >= 1; j --){

                if(arr[j] <= TC){

                    result.add(arr[j]);
                    sum += arr[j];
                    TC = TC-arr[j];

                    if(sum == TC){
                        
                        
                       break;
    
                    }
                }
            }
            Collections.sort(result);
            for(int k = 0; k < result.size(); k++){
                System.out.print(result.get(k) + " ");
                
            }
            System.out.println();
           
        }          
    }    
}
