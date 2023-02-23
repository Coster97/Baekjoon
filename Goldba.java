import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Goldba {
 
	/*
		false : 소수
		range : 0 ~ 10000
	*/
	public static boolean[] prime = new boolean[10001]; // 최댓값에 1을 더해줘야 0,1,2,3,4, 이 순서대로 인덱스넘버가 소수와 일치하는 애들이 트루가 된다.
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받는다.
		
		get_prime(); //메소드를 실행시킨다. 이 메소드를 실행하고 나면 이 문제의 입력 최댓값까지의 소수판별이 가능한 배열이 완성된다. 아래 코드는 그 배열을 토대로 실행된다.
 
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스의 횟수를 결정한다.
 
		while (T-- > 0) { // T--; T > 0 (증감연산자와 꺾쇠괄호의 다른 표현식)  T는 감소할 것이고, 0과 같거나 0보다 작아지면 이 반복문을 종료한다 라는 뜻
			int n = Integer.parseInt(br.readLine()); // 테스트 케이스를 받는다.
			int first_partition = n / 2; //  그 수를 2로 나눈 값을 변수에 저장
			int second_partition = n / 2; // 같은 방식으로 저장, 위 아래 같은 값임
 
			while (true) {//만약 
            
				// 두 파티션이 모두 소수일 경우 제일 차이가 적으니까 !
				if (!prime[first_partition] && !prime[second_partition]) {
					System.out.println(first_partition + " " + second_partition);
					break;
				}
				first_partition--; // 양쪽으로 벌어져야 소수를 찾을 수 있음        
				second_partition++;
			}
		}
 
	}
 
	// 에라토스테네스의 체
	public static void get_prime() {
		prime[0] = prime[1] = true; // 인덱스 0, 1에 트루 처리를 해준다 2 미만의 수는 소수가 아니기 때문이다.
 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) { // 에라스토테네스의 체 알고리즘을 사용한 풀이이다. 어떤 수 M을 기준으로 M 포함 그 이하의 수 중에 소수를 찾고 싶다면. M의 루트값으로 편하게 찾는 방법이 있다.
			if (prime[i]) // 소수가 아니라면 그냥 넘어간다
				continue;
			for (int j = i * i; j < prime.length; j += i) { //만약 36이 프라임렝스라면 루트 6까지 포문이 실행된다. 이 때 j는 4, 4는 소수가 아니니까 true, 6, 8, 10, 12 ,14, 16 ... 어 그럼 홀수 중에 소수가 아닌 수는 어떻게 판별하나??
                                                            //i가 증가할것이기 때문에 홀수의 배수가 되는 수에도 소수 처리가 가능한다. -> 이걸 M의 루트까지 반복하는 이유, 그리고 i가 2부터 사작되는 이유? == 어떤 수의 약수는 그 수의 절반 즉 2로 나눈 값의 약수와 같다. 더 빠른 연산을 위해서 절반 값을 최대치로
                                                            //포문을 실행하고, 최소값부터 최댓값까지의 청수들을 곱해주며 곱한 값을 인덱스 넘버로 가지는 원소들의 값을 false로 저장한다. 내가 가진 프라임 넘버 중 정수를 두번 곱한 값이 있다는 것은 그 값은 나누어 떨어진다는 것이고 즉 소수가 아니기 때문이다.
                prime[j] = true;
			}
		}
	}
}
