import java.io.*;
import java.util.*;

public class B_24444{


    static int N,M,R;

    static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();;
    static boolean[] visit;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        result = new int[N+1];

        for(int i = 0; i <= N; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
        
        for(int i = 0 ; i < M; i ++){
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            int A = Integer.parseInt(st2.nextToken());
            int B = Integer.parseInt(st2.nextToken());
            arr.get(A).add(B);
            arr.get(B).add(A);
        }


     
        for(int i = 0; i < arr.size(); i++) {
			// 각 정점간 연결된 노드 정렬
			Collections.sort(arr.get(i));
		}
	
        bfs(R);
        System.out.println(Arrays.toString(result));

        for(int i = 1; i <=N; i++) {
			System.out.println(result[i]);
		}
	

    }

    public static void bfs(int start){

        int cnt = 1;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(start);
        visit[start] = true;
        result[start] = cnt ++;
        System.out.println("index : " + result[start]);
        System.out.println("cnt : " + cnt);
        while(!Q.isEmpty()){
            
            int node = Q.poll();

            for(int i : arr.get(node)) {
				if(visit[i] == false) {
					visit[i] = true;
					Q.offer(i);
					result[i] = cnt++;
                    System.out.println("index : " + result[i]);
                    System.out.println("cnt : " + cnt);
				}
			}
    
        }
        
    }
    
}
