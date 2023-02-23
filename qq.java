import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;



public class qq {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String str = br.readLine();
        int A = Integer.parseInt(str);
        int[] arr = new int[A];
        
        float plus = 0;
        float average;
        int middle;
        int range;
    
        for(int i = 0; i < A; i ++){

            arr[i] = Integer.parseInt(br.readLine());
            plus += arr[i];

        }
        Arrays.sort(arr);

        average = Math.round((plus/arr.length));
        middle = arr[arr.length/2];
        range = arr[arr.length-1] - arr[0]; 
        
       
      
        System.out.println(Math.round(average));
        System.out.println(middle);
        System.out.println(range);
   
   
    }
    
}
