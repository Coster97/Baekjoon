import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1920 {
    public static void main(String[] args)throws IOException{

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int tC = Integer.parseInt(str);

        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < tC; i ++){
            arr.add(Integer.parseInt(st.nextToken()));

        }

        String str3 = br.readLine();
        int tC2 = Integer.parseInt(str3);

        String str4 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str4, " ");

        for(int i = 0; i < tC2; i ++){
            if(arr.contains(Integer.parseInt(st2.nextToken()))){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }
        System.out.println(sb);
    }
    
}
