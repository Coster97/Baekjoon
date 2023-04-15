import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class B_1003 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            Fibo(Integer.parseInt(br.readLine()));
        }
        System.out.println(sb);

    }

    public static void Fibo(int N){
        int[] arr = new int[N+1];
    
        if(N == 0){
            sb.append(1 +  " " + 0 + "\n");
        }else if(N == 1){
            sb.append(0 + " " + 1 + "\n");
        }else{
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i <= N; i ++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            sb.append(arr[N-1] + " " + arr[N] + "\n");
        
        }
       
        
    }
}