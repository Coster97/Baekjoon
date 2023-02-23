import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class f {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        StringTokenizer st = new StringTokenizer(reverse, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if(A > B){
            System.out.println(A);

        }else{
            System.out.println(B);
        }
  
    }
    
}
