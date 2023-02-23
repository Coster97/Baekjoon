import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1037 {
    static int result;

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);



		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2," ");

        while(N-- > 0) {
			int M = Integer.parseInt(st.nextToken());
			max = M > max ? M : max;
			min = M < min ? M : min;
		}
		System.out.println(max * min);
     
        
    }
}
