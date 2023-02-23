import java.io.*;
import java.util.StringTokenizer;

public class D  {

    public static int b;

    public static int gcd(int a, int b){
      
        if (a % b == 0) {
			return b; 
		}
		else {
			return gcd(b, a % b);
		}
    }
   

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
    
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(gcd(A, B));
        System.out.println(A*B / gcd(A, B));
       
    }  
}
