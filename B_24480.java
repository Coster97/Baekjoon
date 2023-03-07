import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_24480 {
	static int V, idx=0;
	static LinkedList<Integer> e[];
	static int[] order;
	static boolean[] visited;
			
	public static void main(String[] args) throws IOException {
		int v, w;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		StringTokenizer s = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(s.nextToken()); //정점
		int M = Integer.parseInt(s.nextToken()); //간선
		int start = Integer.parseInt(s.nextToken()); //시작 정점
		
		visited = new boolean[N+1];
		order = new int[N+1];

		e = new LinkedList[N+1];
		for (int i=1; i<=N; ++i) {
			e[i]=new LinkedList();
		}
		
		for(int i = 0; i<M; i++) {
			StringTokenizer vw = new StringTokenizer(br.readLine());
			v = Integer.parseInt(vw.nextToken());
			w = Integer.parseInt(vw.nextToken());
			
			//v-w 노드 연결
			e[v].add(w);
			e[w].add(v);
		}
		
		//정렬
		for(int i = 1; i<=N; i++) {
        	
            Collections.sort(e[i], Collections.reverseOrder());
		}
		
		visited[start] = true;
	    DFS(start); 
	    System.out.println(print(order));
	}
	
	static void DFS(int r) {
		order[r] = ++idx;
		if (e[r]==null) {			
			return;
		}else {			
		    Iterator<Integer> i = e[r].listIterator();
		    
		    while (i.hasNext()) {
		    	int n = i.next();
		        if (visited[n]) { continue; }
		        visited[n] = true;
		        DFS(n);
		    }
		}
	}
				
	static StringBuilder print(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < array.length; i++) {
			sb.append(array[i]).append('\n');
		}
		return sb;
	}
}
