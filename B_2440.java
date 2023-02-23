import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2440 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int N = 0;
        for(int i = n ; i >= 1; i --){
            String star = "*";
            
            if(i <=n-1){
                for(int j = 0; j < N;  j ++){
                    System.out.print(" ");
                }
            }
            
            for(int j = 0; j < i ; j ++){
                System.out.print(star);
                
            }
            System.out.println();
            N ++;
        
           
        }
    }
    
}
