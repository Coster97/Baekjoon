import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_24264{
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
      
        
        System.out.println(N * (N - 1) * (N - 2) / 6 );
        System.out.println(3);
           
    
    }
}