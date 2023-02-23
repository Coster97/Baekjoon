import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class d {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        for(int i = 0; i < Integer.parseInt(str); i ++){
            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");
            int A = Integer.parseInt(st.nextToken());
            String alp = st.nextToken();
            char[] arr = new char[alp.length()];
            for(int k = 0; k < arr.length; k ++){
                arr[k] = alp.charAt(k);
                String toString = String.valueOf(arr[k]);
                System.out.print(toString.repeat(A));
                  
            }     
            System.out.print("\n");   
        }         
    } 
}
