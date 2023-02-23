import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char chstr = str.charAt(0);
        byte num = (byte)chstr;
        System.out.println(num);     
    }   
}
