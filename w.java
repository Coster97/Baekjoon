import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class w {
    public static int[][] arr = new int[15][15];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        test(); !다다나


        int A = Integer.parseInt(br.readLine());
       
        for(int i = 0; i < A; i ++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            bw.write(arr[floor][room]+"\n");
            
        }
        bw.flush();
    }
    public static void test() {
        for(int i = 0; i < 15; i ++){
            arr[i][1] = 1;
            arr[0][i] = i;          
        }
        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
 
            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }      
    } 
}
