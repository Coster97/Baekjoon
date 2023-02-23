import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2212 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i = 0 ; i < arr.length; i ++){
     
            arr[i] =  Integer.parseInt(st.nextToken());
        
        };
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        int[] length = new int[N-1];
        int start = 1;
        for(int i = 0; i < arr.length-1; i ++){
            length[i] = Math.abs(arr[start]-arr[start-1]);
            start ++;
            
        }
        Arrays.sort(length);
        
        int result = 0;
        for(int i = 0; i <= length.length-1-(K-1); i ++){
            result += length[i];

        }
        System.out.println(result);

        //System.out.println(Arrays.toString(length));

    }
    
}
