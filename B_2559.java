import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2559 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st2.nextToken());

        }

        int[] arrsum = new int[N-K + 1];
        int cnt = 0;
        for(int i = 0 ; i < arrsum.length; i ++){
            for(int j = cnt ; j < K+cnt; j ++){
                arrsum[i] += arr[j];
                
            }
            cnt ++;
            
        }
        
        int max = arrsum[0];
        for(int i = 0 ; i < arrsum.length; i ++){
            if(arrsum[i] > max){
                max = arrsum[i];
            }

        }
      
        System.out.println(max);
    }
    
}
