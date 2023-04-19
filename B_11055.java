import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11055 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] lis = new int[N];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
       
        int max = 0;

        for(int i = 0; i < N; i ++){
            lis[i] = arr[i];
            for(int j = 0 ; j < i ; j ++){
                if(arr[j] < arr[i] && lis[i] < lis[j] + arr[i]){
                    lis[i] = lis[j] + arr[i];
                   
                }
           
            }
        
 
            
        }
        for(int i = 0; i < N; i ++){
            if(lis[i] > max){
                max = lis[i];
            }
        }
        System.out.println(max);
    }
    
}
