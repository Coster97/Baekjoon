import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class e {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] arr = new char[26];
        char[] arr1 = new char[str.length()];
        int[] arr2 = new int[str.length()];

        
        
        for(int i = 0; i < arr.length; i ++){
           arr[i] = (char)(65+i);

        }

        for(int k = 0; k < str.length(); k ++){
            arr1[k] = str.charAt(k);

        }
            
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
       

        
    }
    
}
