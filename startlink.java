import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class startlink {

    public static int length;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        length = Integer.parseInt(str);
        arr = new int[length][length];


        for(int i = 0; i < length; i ++){

            String str2 = br.readLine();
            StringTokenizer st = new StringTokenizer(str2, " ");

            for(int j = 0; j < length; j ++){
                arr[i][j] =  Integer.parseInt(st.nextToken());  
            }
        }
        match(0);//인덱스 0 부터 순차적으로 찾아서 쓸거임 배열의 길이 2가 될떄까지 카운트를 돌릴거임

        System.out.println(Arrays.deepToString(arr)); //arr는 2차원 배열로, 배열 안에 또다른 배열을 가지고 있는 형태입니다. 따라서, 2차원 배열을 Arrays.toString() 함수를 이용하여 출력하면, 배열 안에 있는 배열을 가리키는 주소값이 차례로 출력됩니다.

    }
    public static int match(int cnt){ // 중복없이 배열안에서 모든 경우의 수를 구하는 메소드
        boolean[][] visit = new boolean[arr.length][arr.length];
        int[] ans = new int[2];
        if(cnt == 2){
            
        }
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr.length; j ++){
                if(!visit[i][j]){
                    ans[cnt] = arr[i][j];
                    visit[i][j] = true;
                    match(cnt + 1);
                    visit[i][j] = false;

                }

            }

        }        
        return 0;
    }
    
}

// 지금 만들어야 하는 알고리즘 
// 1. 매치되는 모든 경우의 수를 중복없이 뽑아내기
// 2. 1의 경우의 수는 스타트와 링크 별로 각각 출력되야함
// 3. 스타트와 링크가 조합되는 모든 경우의 수를 중복없이 뽑아내기
// 4. 3이 완성되면 스타트 - 링크 || 링크 - 스타트를 모두 확인하며 최솟값 구하기
