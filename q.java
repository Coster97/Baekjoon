import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class q {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
       
        int[][] arr = new int[A][B];
        int[][] arr2 = new int[A][B];
        int[][] arr3 = new int[A][B];

        for(int i = 0; i < A; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            for(int k = 0; k < B; k ++){
                arr[i][k] = Integer.parseInt(st2.nextToken());
            }
        }
        for(int i = 0; i < A; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            for(int k = 0; k < B; k ++){
                arr2[i][k] = Integer.parseInt(st2.nextToken());
            }
        }
        for(int i = 0; i < A; i ++){
            for(int k = 0; k < B; k ++ ){
                arr3[i][k] = arr[i][k] + arr2[i][k];
                bw.write(arr3[i][k]+" ");
                       
            }
            bw.write("\n");
                         
        }
        bw.flush();  

    }
    
}
