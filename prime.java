import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prime {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String str = br.readLine();
        String str2 = br.readLine();

        StringTokenizer st = new StringTokenizer(str2, " ");

        int length = Integer.parseInt(str);
        int[] arr = new int[length];
        int sum = 0;
        

        for(int i = 0; i < length; i ++){
            
            arr[i] = Integer.parseInt(st.nextToken());
  
        }

        for(int k = 0; k < arr[k]; k ++){
            if(arr[k] > 1) {
                if(arr[k] == 2) {
                    sum ++;
                }
                for(int j = 2; j < arr[k]; j++) {
                    // 소수가 아닐경우
                    if(arr[k] % j != 0) {
                        sum ++;
                    }
                }            
            }
        }
       

        System.out.println(sum);



    }
}

