import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class B_13164{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        PriorityQueue<Integer> arr = new PriorityQueue<>();

        for(int i = 0 ; i <N; i ++){
            int value = Integer.parseInt(st2.nextToken());
            arr.add(value);
        }

        int keep = 0;
        int sum = 0;
        int ans = 0;
        int cnt = (N/K * K);
        
        for(int i = 0 ; i < arr.size(); i ++){
           
           

        }
        
        while(!arr.isEmpty()){
            keep = arr.poll();
            cnt --;
            System.out.println("나 첫번째 수 :"+keep);
            if(arr.size()%cnt == 0){

                for(int j = 0; j < cnt-1; j ++){
            
               
                
                    arr.poll();
                    System.out.println(arr.toString());
                
                }
                System.out.println("나 마지막 경계 수 : "+ arr.peek());
                sum = arr.peek() - keep;
                arr.poll();
                System.out.println(arr.toString());
    
                System.out.println(sum);
                cnt = K;
            }else{

            }
            ans += sum;
            
            

        }

        System.out.println(ans);
        
        


    }
}

// static int n, k, result;
// static int[] arr;
// static List<Integer> list = new ArrayList<>();

// public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String[] s1 = br.readLine().split(" ");
//     n = Integer.parseInt(s1[0]);
//     k = Integer.parseInt(s1[1]);
//     arr = new int[n];
//     String[] s = br.readLine().split(" ");
//     for (int i = 0; i < n; i++) {
//         arr[i] = Integer.parseInt(s[i]);
//     }
//     Arrays.sort(arr);
//     solve();
//     System.out.println(result);
// }

// public static void solve() {
//     for (int i = 1; i < n; i++) {
//         list.add(arr[i] - arr[i - 1]);
//     }

//     Collections.sort(list);

//     for (int i = 0; i < n - k; i++) {
//         result+=list.get(i);
//     }
// }
// }



