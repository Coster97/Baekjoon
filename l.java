
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;

public class l {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i < arr.length; i ++){
            
            arr[i] = str.charAt(i)-'0';
            
        }
        for(int j = 0; j < arr.length; j ++){
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.print(arr[j]);
        } 
        
    } 
}
