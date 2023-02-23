import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

public class B_1764 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String[] arr = new String[Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())];
       
        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = br.readLine();

        }
        
        checkForDuplicates(arr);
        System.out.println(cnt);
        System.out.println(sb);
        
       

    }private static <T> boolean checkForDuplicates(T... arr)
    {
        // 빈 세트 생성
        Set<T> set = new HashSet<T>();
     
        // 모든 어레이 요소에 대해 수행
        for (T e: arr)
        {
            // 중복이 발견되면 true를 반환
            if (set.contains(e)) {
                sb.append(e+"\n");
          
                cnt ++;
            }
     
            // 현재 요소를 집합에 삽입
            if (e != null) {
                set.add(e);
            }
        }
     
        // 중복이 발견되지 않음
        return false;
    }
    
}
