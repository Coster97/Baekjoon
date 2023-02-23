import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_18310 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[TC];
        

        for(int i = 0 ; i < TC; i ++){
            arr[i] = Integer.parseInt(st.nextToken());


        }
        int min = 0;
        int[][] result = new int[TC][2];
       
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr.length; j ++){
                min += Math.abs(arr[i] - arr[j]);
            }
            result[i][0] = i;
            result[i][1] = min;
            min = 0;       
        } 
        Arrays.sort(result, (o1, o2) -> {
            return Integer.compare(o1[1], o2[1]);
        });
        System.out.println(arr[result[0][0]]);
     
    } 
}
