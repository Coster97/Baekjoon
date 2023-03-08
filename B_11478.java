import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B_11478 {


    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> arr = new HashSet<>();
        
        int start = 0;
        int one = 1;
        int end = 1;
    

        while(true){

            arr.add(str.substring(start, end));
            start ++;
            end ++;
            if(end > str.length()){
                start = 0;
                one ++;
                end = one;
            }
            if(one > str.length()){
                break;
            }
        }
       
        System.out.println(arr.size());
    }
}
