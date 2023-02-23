import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class B_14425 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < A; i++) {
            map.put(br.readLine(), 0);
        }
        int cnt = 0;
        for (int i = 0; i < B; i++) {
            if (map.containsKey(br.readLine())) cnt++;
        }
        System.out.println(cnt);
        

    }
    
}
