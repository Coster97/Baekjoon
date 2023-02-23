import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int start = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        

      
        for(int i = start; i < last + 1; i ++){
            
            if(i > 1){
                if(i < 10){
                    if (i == 2 || i % 2 != 0){
    
                        arr.add(i);
                    }
                }else if(i % 2 != 0  && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
    
                    arr.add(i);
                 
                }
            }
        }
        for(Object object : arr){
            System.out.print(object + "\n");

        }
    }
}
