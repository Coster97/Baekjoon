import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11054 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] arr = new int[N];
        int[] lis = new int[N];
        int[] lds = new int[N];
        

        for(int i = 0 ; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
   
        for(int i = 0; i < N; i ++){
            lis[i] = 1;

            for(int j = 0; j < i; j ++){

                if(arr[j] < arr[i]  && lis[i] < lis[j] + 1){

                    lis[i] = lis[j] + 1;
                }

            }
        }


        int lisMax = 0;
        
        for(int i = 0 ; i < N; i ++){
            if(lis[i] > lisMax){
                lisMax = lis[i];
            }
        }
        

        for(int i = N-1 ; i >= 0; i --){
            lds[i] = 1;

            for(int j = N-1; j > i; j --){
                
                if(arr[i] > arr[j] && lds[j] + 1 > lds[i]){
                    lds[i] = lds[j] + 1;
                }
            }
        }

        int ldsMax = 0;

        for(int i = 0; i < N; i++){
            if(lis[i] + lds[i] > lisMax + ldsMax){
                lisMax = lis[i];
                ldsMax = lds[i];
            }
        }

        int answer = lisMax + ldsMax - 1;

        System.out.println(answer);
    }
    
}
