import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        int num = 0;
        int sum = 0;
        while(true){
            num ++;
            if(String.valueOf(num).contains("666")){
                
                sum ++;
                
            }
            if(sum == N){
                System.out.println(num);
                break;
            }
            
            
        }
    }
    
}
