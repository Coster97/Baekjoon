import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5086 {
    static String result;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }
            gcd(a,b);
            System.out.println(result);
          
        }
    }
    public static void gcd(int a, int b){
        if(a % b == 0){
            result = "multiple";
        }else if(b % a == 0){
            result = "factor";
        }else{
            result = "neither";
        }

    }
    
}
