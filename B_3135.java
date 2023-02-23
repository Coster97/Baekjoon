import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3135 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int A_B = Math.abs(A-B);
        int N_B = 0;

        int[] arr = new int[N];
        for(int i = 0 ; i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());

        }

        int min = arr[0];
        for(int i = 0 ; i < N; i ++){
            N_B = Math.abs(arr[i] - B);
            if(N_B < min){
                min = N_B;
               
            }
        }

        if(A_B < min){
            System.out.println(A_B);
        } 
        else if(A_B > min){
            System.out.println(min + (N-min));
        }
        else if(A_B == min){
            System.out.println(A_B);
        }
        else{
            System.out.println(1 + min);
        }



    }
}
