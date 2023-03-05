import java.io.*;
import java.util.*;

public class B_11725{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        System.out.println(arr.toString());

        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];
        int[] parent = new int[n + 1];

        q.add(1);
        visit[1] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            for (int next : arr.get(v)) {
                if (!visit[next]) {
                    visit[next] = true;
                    parent[next] = v;
                    q.add(next);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
           sb.append(parent[i]+"\n");
        }
        System.out.println(sb);

    }
}