import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1339 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        int howmany = 0;
        for(int i = 0 ; i < N ; i ++){
            arr[i] = br.readLine();
            howmany += arr[i].length();
        }

        int lenght = 0;
   
        Arrays.sort(arr, (o1, o2) -> {
            return Integer.compare(o2.length() - o1.length(), lenght);
        });
        char[] alp = new char[howmany];
        for(int i = 0; i < arr.length; i ++){
            alp[i] = arr[i].charAt(i);

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(howmany);
        System.out.println(Arrays.toString(alp));
  
    }
}
