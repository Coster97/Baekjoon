import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcd {

    static int GCD;

    public static int gcd_sub(int a, int b){
        while(a != 0 && b != 0){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        GCD = a + b;
        return GCD;
    }

    public static int gcd_mod(int a, int b){
        int c;
        
        while(a != 0 && b != 0){
            if(a>b){
                c = a%b;
                a = b;
                b = c;
            }else{
                c = b%a;
                b = a;
                a = c;
            }
        }
        GCD = a + b;
        return GCD;
    }

    public static int gcd_rec(int a, int b){

		if (a % b == 0) {
			return b;
		}
		else {
			return gcd_rec(b, a % b);
		}
       
    }

    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
       
        System.out.println(gcd_sub(A, B)); 
        System.out.println(gcd_mod(A, B));
        System.out.println(gcd_rec(A, B));
   
    }
    
}
