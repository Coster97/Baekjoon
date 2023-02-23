import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class E {

    public static ArrayList<Integer> prime = new ArrayList<>();
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static String result;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int A = Integer.parseInt(str);
        
        for(int i = 0; i < A; i ++){
            arr.add(Integer.parseInt(br.readLine()));
        } 
        for(int j = 0; j < A; j ++ ){
            prime.removeAll(prime);
            primeM(arr.get(j));
            System.out.println(prime.toString());
        } 
    }
    

    public static void primeM(int Num){

        int i; /// 굳이?
		boolean arr2[] = new boolean[Num+1]; 
		arr2[0] = arr2[1] = true; 
      
		// 에라토스테네스의 체 사용
		int sqrt = (int) Math.sqrt(Num); 
		for(i=2; i<=sqrt; i++) {//

			for(int j=2; j<=Num/i; j++) {
					if(arr2[i*j] == true) {
						continue;
					}
					else  {
						arr2[i*j] = true;
					}
			}	
		}
		for(i=0; i<=Num; i++) {
           
			if(arr2[i] == false) {
				prime.add(i);
            
			}
            //System.out.println(prime.toString());
            //dfs(0);
		}           
    }
    //표적이 될 숫자에 어떻게 접근하나?
    public static String dfs(int cnt){
        boolean[] visit = new boolean[prime.size()];
        int[] ans = new int[2];

        if(cnt == 2){
            for(int j = 0; j < 1; j ++){
                if(ans[j] + ans[j+1] == 5){
                    result = " " + ans[j] + " " + ans[j+1];  
                }
            }
           
        }
        for(int i = 0; i < prime.size(); i ++){
            if(!visit[i]){
                ans[cnt] = prime.get(i);
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;

            }

        }
        return result;

        
    }
}
