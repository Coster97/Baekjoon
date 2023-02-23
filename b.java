import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = br.readLine();
        int A = Integer.parseInt(str);
        String str1 = br.readLine();
        char[] arr = new char[A];
        int plus = 0;      
        
        for(int i = 0; i < A; i ++){
            arr[i]= str1.charAt(i);
            plus += arr[i]-'0';
                  
        }   
        System.out.println(plus); 
    }
}
