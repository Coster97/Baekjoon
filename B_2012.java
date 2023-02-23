import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2012 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        long[] arr = new long[N];
        long sum = 0;

        for(int i = 0; i < arr.length; i ++){

            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int start = 1;
        for(int i = 0 ; i < arr.length; i ++){

            if(arr[i] != start){
                sum += Math.abs(arr[i]-start);
                start ++;

                
            }else{
                start ++;
            }
           
        }
       
 
        System.out.println(sum);
    }
      
    
}
