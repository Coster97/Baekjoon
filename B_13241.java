import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13241 {

    static long A;
    static long B;
    static long b;
    
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(A*B/GCD(A,B));
        


    }
    public static long GCD(long a, long b){

        if(a % b == 0){
            return b;
        }
        else{
            return GCD(b, a % b);
        }

    }
    
}
