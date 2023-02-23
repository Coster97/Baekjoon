import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11729 {
    static int N;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        N = Integer.parseInt(str);

        hanoi();



    }
    public static void hanoi(){

        int result = 1;
        int cnt = 1;
        for(int i = 0; i < N; i ++){
            result = (2*result) + 1;
            cnt ++;
            if(cnt == N){
                System.out.println(result);
                break;
            }
        }

    }
    
}
