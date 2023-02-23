import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2231 {
    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        int sum = 0;
        boolean ans = false;

        
        for(int i = 1; i <= N; i ++){
            String NtoString = String.valueOf(i);
            sum = 0;
            for(int j = 0; j < NtoString.length(); j ++){
                sum += NtoString.charAt(j)-48;
            }
            int result = N-sum;
            if(N-sum == i){
                System.out.println(result);
                ans = true;
                break;
            }
           
        }
        if(ans == false){
            System.out.println(0);
        }
       
        
        
    }
    
}
