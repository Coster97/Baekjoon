import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11660 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[A*2][2];
        int[][] arr2 = new int[B*2][2];


        
        for(int i = 0; i < A; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            arr[i][0] = Integer.parseInt(st2.nextToken());
            arr[i][1] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0; i < B; i ++){
            String str3 = br.readLine();
           
            StringTokenizer st3 = new StringTokenizer(str3, " ");
            arr2[i][0] = Integer.parseInt(st3.nextToken());
            arr2[i][1] = Integer.parseInt(st3.nextToken());
           
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));

    }

    
}
