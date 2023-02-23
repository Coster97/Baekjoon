import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B_1758 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        int[] arr = new int[TC];

        for(int i = 0 ; i < TC; i ++){

            arr[i] = Integer.parseInt(br.readLine());

        }


        Arrays.sort(arr);
        long sum = 0;
        int start = 1;

        for(int i = TC-1 ; i >=0 ; i --){

            if(arr[i] - (start - 1) > 0){
                sum += arr[i] - (start - 1);
                start ++;

            }
           
           

        }

        System.out.println(sum);

        
        
    }
    
}
