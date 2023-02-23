import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2501 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;
        boolean tf = false;
        for(int i = 1; i <= N; i ++){
            if(N%i == 0){
                cnt ++;
            }
            if(cnt == K){
                System.out.println(i);
                tf = true;
                break;
            }

            
        }
        if(tf == false){
            System.out.println(0);
        }


    }
    
}
