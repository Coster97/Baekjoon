import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class B_1476 {

 
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int[] ans = new int[3];

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        

       
      
        int E = 1;
        int S = 1;
        int M = 1;

       

        for(int sum=1;;sum++) {
			if(e==E && s==S && m==M) {
				System.out.println(sum);
				break;
			}
			
			E+=1;
			S+=1;
			M+=1;
			if(E==16) {
				E=1;
			}
			if(S==29) {
				S=1;
			}
			if(M==20) {
				M=1;
			}
		}

    }

    
}
