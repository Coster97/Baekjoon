import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_17103{

    static boolean[] prime = new boolean[1_000_001];
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        prime[0] = prime[1] = true;
        prime();
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0 ; i < T; i ++){
            int num = Integer.parseInt(br.readLine()); // 테스트 케이스를 받는다.
               
                int first_partition = num / 2; //  그 수를 2로 나눈 값을 변수에 저장
                int second_partition = num / 2; // 같은 방식으로 저장, 위 아래 같은 값임
                sum = 0;
                for(int j = 2; j <= prime.length; j++){
                    if (!prime[first_partition] && !prime[second_partition]&& first_partition + second_partition == num) {
                       
                        sum++;     
                        
                    }
                    first_partition--; // 양쪽으로 벌어져야 소수를 찾을 수 있음        
                    second_partition++;
                    if(first_partition < 0 || second_partition > prime.length){
                        System.out.println(sum);
                        break;
                    }

                }
        }

    }
    public static void prime(){

        for(int i = 2; i <= Math.sqrt(prime.length); i ++){
            if(prime[i]){
                continue;
            }
            for(int j = i*i; j < prime.length; j += i){
                if(!prime[j]){
                    prime[j] = true;

                }

            }
            
        }

    }

}