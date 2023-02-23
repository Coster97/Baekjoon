import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2475 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        double first = Math.pow(Integer.parseInt(st.nextToken()), 2);
        double second =  Math.pow(Integer.parseInt(st.nextToken()), 2);
        double third =  Math.pow(Integer.parseInt(st.nextToken()), 2);
        double fouth = Math.pow(Integer.parseInt(st.nextToken()), 2);
        double fifth =  Math.pow(Integer.parseInt(st.nextToken()), 2);
        System.out.println(Math.round(first + second + third + fouth + fifth)%10);

    }
    
}
