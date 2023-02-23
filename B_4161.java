import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_4161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 두 우선순위 큐는 내림차순 정렬.
        PriorityQueue<Integer> positiveQ = new PriorityQueue<>((p1, p2) -> p2 - p1);
        PriorityQueue<Integer> negativeQ = new PriorityQueue<>((p1, p2) -> p2 - p1);

        
      
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (temp > 0) {
                positiveQ.offer(temp);
            } else {
                negativeQ.offer(Math.abs(temp)); //거리를 측정하기 떄문에 절댓값으로 변환하여 저장
            }
        }
        System.out.println(positiveQ);
        System.out.println(negativeQ);

        // 가장 멀리 있는 책의 위치를 저장.
        int maxV = 0;
        if (positiveQ.isEmpty()) { //만약 양수 배열이 비어있다면
            maxV = negativeQ.peek(); //멕스에는 음수 배열의 제일 첫 원소가 대입된다.
        } else if (negativeQ.isEmpty()) {//만약 음수 배열이 비어있다면
            maxV = positiveQ.peek();//양수 배열의 첫 원소가 대입된다.
        } else {
            maxV = Math.max(positiveQ.peek(), negativeQ.peek());
            //둘 다 비어있지 않다면 메스 맥스 메소드를 이용하여 두 배열의 각 첫 원소중에 더 큰 것을 찾아 대입한다.
        }

        int ans = 0; //결과값

        while (!positiveQ.isEmpty()) { //양수 배열이 비어있지 않다면
            int temp = positiveQ.poll();
            System.out.println("나 뭐게 : " + temp);
            for (int i = 0; i < M - 1; i++) { //짝수번째와 홀수번째를 구분하는 대신 몇개를 삭제할 것이냐로 템프에 대입할 값을 구해버림 ㄷ ㄷ 그리고 위에서 내가 먹을 것만 템프에 저장하고 또 삭제하고 저장하고 반복, 이 과정이 끝나면 브레이크
                positiveQ.poll(); //계속 삭제하면서 위의 과정을 반복한다. 들수있는 책의 수가 짝수일경우 예를 들어 2,  1번째 원소만 계속해서 템프
                System.out.println(positiveQ);
                if (positiveQ.isEmpty()) {
                    break;
                }
            }
            ans += temp * 2; //어차피 둘다 왕복이기 때문에 배열값을 다 더해서 한번에 곱해준다.
        }
        
        while (!negativeQ.isEmpty()) {
            int temp = negativeQ.poll();
            for (int i = 0; i < M - 1; i++) {
                negativeQ.poll();

                if (negativeQ.isEmpty()) {
                    break;
                }
            }
            ans += temp * 2;
        }

        ans -= maxV;
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}