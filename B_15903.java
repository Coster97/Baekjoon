import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15903 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());       
        }

        Arrays.sort(arr);

        long sum = 0L;
        long cnt = 0L;
        long result = 0L;

        loop : for(int i = 0 ; i < M; i ++){
            for(int j = 0 ; j < arr.length-1; j ++){
                j = 0;
                sum = arr[j] + arr[j+1];
                cnt ++;
                arr[j] = sum;
                arr[j + 1] = sum;
                Arrays.sort(arr);
                if(cnt == M){
                    break loop;
                }
            } 
        }
          
        for(int i = 0; i < arr.length; i ++){
            result += arr[i];
        }
        System.out.println(result);


    }
    
}
