import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1181 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        String[] arr = new String[testCase];
        

        for(int i = 0 ; i < arr.length; i ++){

            arr[i] = br.readLine();

        }
        String[] sortArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        
        Arrays.sort(sortArr);
        Arrays.sort(sortArr, (String s1, String s2) -> s1.length() - s2.length());
        for(int i = 0; i < sortArr.length; i ++){
            sb.append(sortArr[i]+ "\n");
            
        }
        System.out.println(sb);
        
       
    }
    
}
