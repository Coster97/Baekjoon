import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B_11651{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int[][] arr = new int[testCase][2];

        for(int i = 0; i < testCase; i ++){
            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
         
            } else {
            return Integer.compare(o1[1], o2[1]);
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