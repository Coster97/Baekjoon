import java.io.BufferedReader;
import java.io.InputStreamReader;


public class B_6603 {
    static int k;
    static int [] s;
    static boolean [] chk;
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String testCase=br.readLine();
            if(testCase.equals("0")) break;
            String [] input=testCase.split(" ");
            k=Integer.parseInt(input[0]);
            s=new int[k];
            chk=new boolean[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(input[i+1]);
            } //초기 값 세팅

            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int depth,int start){
        if(depth==6){
            for(int i=0;i<k;i++){
                if(chk[i]){
                    System.out.print(s[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start;i<k;i++){/// 일반적인 dfs 알고리즘에 
            chk[i]=true; 
            dfs(depth+1,i+1); // 중복을 없애기 위해 i + 1을 추가적으로 
            chk[i]=false;

            //중복을 없애려면 배열을 읽어들이는 시작점을 인위적으로 바꿔줘야한다. 
            //중복이 상관 없는 백트래킹 알고리즘 구현과 가장 큰 차이점이다/
        }
    }
}