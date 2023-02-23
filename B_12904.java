import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12904 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int won = 0;


        int[] arr = {5,2};

        for(int i = 0 ; i < arr.length; i ++){
            if(N % 5 == 0){
                while(true){
                    won += 5;
                    cnt ++;
                    if(won == N){
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    
}
