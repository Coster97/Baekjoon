import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_17087 {
   
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        int[] arr= new int[A];
        for(int i = 0; i < A; i ++){
           
            arr[i] =  Math.abs(Integer.parseInt(st2.nextToken())-B);
            
        }
        int d = arr[0];
        for (int i = 0; i < A; i++) {
			d = gcd(d, arr[i]);
		}

		System.out.println(d);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

    
}
