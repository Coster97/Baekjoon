import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11650 {

    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int[][] arr = new int[testCase][2];
        for(int i = 0; i < testCase; i ++){
            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2);
            for(int j = 0; j < 2; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
         
            } else {
            return Integer.compare(o1[0], o2[0]);
            }
        });
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0; j < 2; j ++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
       
    }
    
}
