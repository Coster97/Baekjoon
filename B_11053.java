import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class B_11053{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] lis = new int[N];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i = 0 ; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < N; i ++){
            lis[i] = 1;
            for(int j = 0; j < i; j ++){
                if(arr[j] < arr[i] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < N; i ++){
            if(lis[i] > max) {
                max = lis[i];
            }
        }
        System.out.println(max);
    }
}
