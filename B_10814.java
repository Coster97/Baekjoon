import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10814{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        String[][] arr = new String[testCase][2];


        for(int i = 0; i < testCase; i ++){

            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();



        }
        //Arrays.sort(arr);
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] != o2[0]) {
            return Integer.valueOf(o1[0]).compareTo(Integer.valueOf(o2[0]));
            }
            return testCase;
        });
           
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0; j < 2; j ++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(arr));

    }
}