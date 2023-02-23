import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int fac = A;
        for(int i = A-1; i > 0; i--){
            fac *= i; 
        }
        if(A == 0){
            fac = 1;
        }
        System.out.println(fac);    
    }  
}
