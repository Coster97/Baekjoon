import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B_1316 {
 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);// now에 알파멧(넘버)를 저장한다
			
			if (prev != now) {		//만약 이전 알파벳과 현재 알파벳이 다르다면
				if (!check[now - 'a']) { //그 알파벳에 true 처리 그리고 이전 알파벳에 현재 알파벳 저장
					check[now - 'a'] = true;
					prev = now;	
				}
				else {
					return false;	//이전 알파벳과 현재 알파벳이 같다면 알파벳엔 false 처리
				}
			}
		}    
		return true;
	}
}
