import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int N;
        int newN = A;

        for(int i = 2; ; i ++){
            while(A%i == 0){
                newN  = A;
                N = newN / (newN/i);
                System.out.println(N);
                newN = A / N;
                A = newN;          
            }
            if(A < i){    
                break;
            }   
        } 
    }
}
