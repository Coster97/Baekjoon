import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int big = 0;
        int bigarr1 = 0;
        int bigarr2 = 0;
        

        for(int i = 0; i < 9; i ++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            for(int k = 0; k < 9; k++){
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < 9; i ++){
            for(int k = 0; k < 9; k++){
                if(arr[i][k]>big){
                    big = arr[i][k];
                    bigarr1 = i;
                    bigarr2 = k;
                }
            }            
        }
        System.out.println(big);
        System.out.println((bigarr1 + 1) + " " + (bigarr2 + 1));
    }  
}
