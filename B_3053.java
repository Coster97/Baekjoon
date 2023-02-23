import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3053 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int r = Integer.parseInt(str);

        double area = Math.PI * r * r;
        double area2 = 2 * (r * r);

        System.out.printf("%.6f\n",area);
        System.out.printf("%.6f",area2);

    }
    
}
