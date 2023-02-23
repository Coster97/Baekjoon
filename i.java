import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class i {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(int i = 0; i < arr.length; i ++){
            str = str.replace(arr[i], "0"); 
        }
        System.out.println(str.length());
    }
}
