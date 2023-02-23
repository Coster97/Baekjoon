import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5585 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int N = Integer.parseInt(str);
        int M = 1000 - N;

        int[] arr ={ 500, 100, 50, 10, 5, 1 };

        int won = 0;
        int cnt = 0;

        for(int i = 0 ; i < arr.length; i ++){

            if(arr[i] <= M){
                while(true){
                    won += arr[i];
                    cnt ++;
                    if(won > M){
                        won -= arr[i];
                        cnt --;
                        break;
                    }
                }
                

            }else{
                continue;
            }
            if(won == M){
                System.out.println(cnt);
                break;
            }
        }
        
        
    }
    
}
