import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class k {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A = Integer.parseInt(str);
        int B = 0;
        int hun;
        int ten;
        int one;

        if(A<100){
        

            System.out.println(A);

        }else{
            B = 99;
            for(int i = 100; i <= A; i ++){
                
                hun = i / 100;
                ten = (i / 10) % 10;
                one = i % 10;
                if(hun-ten == ten-one){
                    B ++;
                }
            }
            System.out.println(B);

        }

        
        
    }
    
}