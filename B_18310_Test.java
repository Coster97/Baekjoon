import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_18310_Test {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());

        int[] arr = new int[TC];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i = 0; i < TC; i ++){
            
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        if(TC % 2== 0){
            System.out.println(arr[TC/2 - 1]);
           
        }else{
            System.out.println(arr[TC/2]);
        }

    }
    
}
