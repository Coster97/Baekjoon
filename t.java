import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;


public class t {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        String[] arr = new String[A];
        String[] arr2 = new String[A];
        String[] arr3 = new String[A];

        for(int i = 0; i < arr.length; i ++){
            arr[i] = br.readLine();
        }
        for(int i = 0; i < arr.length; i ++){
            arr2[i] = arr[i].length()+"."+arr[i];
        }
        Arrays.sort(arr2);
        for(int i = 0; i < arr.length; i ++){
            StringTokenizer st = new StringTokenizer(arr2[i], ".");

            String live = st.nextToken();
            arr3[i] = live;        
        }
        
        String[] resultArr = Arrays.stream(arr3).distinct().toArray(String[]::new); 

        for(int i = 0; i < resultArr.length; i ++){
            bw.write(resultArr[i]+"\n");  
        }
        bw.flush();  
    } 
}
