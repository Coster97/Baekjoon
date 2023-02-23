import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_9375 {
    static int result;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int[] arr = new int[testCase -1];
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");
        int A = Integer.parseInt(st.nextToken());
        for(int i = 0 ; i < testCase; i ++){
           if(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            gcd(A, arr[i]); 
            System.out.println(((A/result) + "/" + (arr[i]/result)));

           }
           
            
        }
        
    }
    public static void gcd(int a, int b){
        if(a % b==0){
            result = b;
        }else{
            gcd(b, a%b);
        }
       
        return;
    }
}
