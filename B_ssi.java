import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_ssi {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int copyM = M;

        ArrayList<Integer> plus = new ArrayList<>(1);
        ArrayList<Integer> minus = new ArrayList<>(1);

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
      

        for(int i = 0; i < N; i ++){
            int value = Integer.parseInt(st2.nextToken());
            if(value > 0){
                plus.add(value);
            }else if(value < 0){
                minus.add(value);
            }
        }

        Collections.sort(plus);
        Collections.sort(minus);
        Collections.reverse(minus);


        int sum = 0;
        while(true){
            if(N % 2 == 0){//두배열이 모두 짝수일때는 어떤수가 M으로 와도 남는 원소가 없다
                sum += plus.get(M-1)*2;
                sum += minus.get(M-1)*2;
                M = M + M;
                if(plus.size() == M-1 && minus.size() == M-1){
                    // sum += plus.get(M-1);
                    // sum += minus.get(M-1);
                    break;
                }
            }
        }
        System.out.println(plus.toString());
        System.out.println(minus.toString());
        System.out.println(plus.size());
        System.out.println(sum);
    }
    
}
