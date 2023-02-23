import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class m {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = 2;
        int C = 3;
        int room = 2;
        int newB = B;
      

        if(A < 2){
            System.out.println(1);
        }else{
            for(int i = 3; ; i += 3){
                
                B = newB;
                C = i;
                if(B <= A && A <= B+(2*C)-1){
                    System.out.println(room); 
                    break;
                }else{
                    room++;
                    newB = B + (2*i);
                    
                    continue;
                }      
            }                 
        } 
    }
}