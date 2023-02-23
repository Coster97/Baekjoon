import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1934 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        for(int i = 0 ; i < testCase; i ++){
            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A*B / gcd(A,B));
        }



    }
    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }else{
            return gcd(b, a%b);
        }
     
        

    }
    
}
