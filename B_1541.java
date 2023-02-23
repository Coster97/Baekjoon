import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1541 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = Integer.MAX_VALUE;
// 변수에 담을 확실한 최대치가 없을때 맥스밸루를 사용하면 인트형의 최대치가 자동 대입됨
     
        String[] subtraction = str.split("-");
        System.out.println(Arrays.toString(subtraction));
        
        for(int i = 0; i < subtraction.length; i ++){

            int temp = 0;
            String[] addition = subtraction[i].split("\\+");
			// 덧셈으로 나뉜 토큰들을 모두 더한다. 
            System.out.println(Arrays.toString(addition));
			for(int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}
            if (sum == Integer.MAX_VALUE) {
				sum = temp;
                System.out.println("최댓값 : "+sum);
			} else {
				sum -= temp; 
                System.out.println("최댓값에서 빠지는 중 : "+temp);
			}
            
        }
        System.out.println(sum);
       
    }
    
}
