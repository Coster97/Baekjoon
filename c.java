import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class c {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(char i='a'; i<='z'; i++) {
            System.out.print(str.indexOf(i)+" ");
			
		}   
    }
}
