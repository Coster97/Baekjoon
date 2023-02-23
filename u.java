import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class u {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int high = Integer.parseInt(st.nextToken());
        int locate = 1;
        int day = 1;

        while(true){
            
            if(locate < high){           
                locate += up;
                day+=1;
                if(locate >= high){
                    System.out.println(day);
                    break;
                }
                locate -= down;
                continue;
                
            }
        }    
    }  
}
