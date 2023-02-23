import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11047 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = Integer.parseInt(br.readLine());

        }
        int cnt = 0;
        int won = 0;
        

        for(int i = arr.length-1 ; i >= 0; i --){

            if(arr[i] <= K){
                while(true){
                    won += arr[i];
                    cnt ++;
                    if(won > K){
                        won -= arr[i];
                        cnt --;
                        break;
                    }
                }
                

            }else{
                continue;
            }
            if(won == K){
                System.out.println(cnt);
                break;
            }
        }
        
    }
    
}
