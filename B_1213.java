// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// public class B_1213 {

  
//     public static void main(String[] args)throws IOException{

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
//         char[] alp = new char[26];
        
//         int[] arr = new int[26];

       
//          for(int i=0;i<26;i++)
//         {    
         
//             alp[i] = (char)(65+i);

//         }

//         String str = br.readLine();
//         int cnt = 0;

//         while(true){

//             char ar = str.charAt(cnt);
            

//             for(int i = 0 ; i < alp.length; i ++){
              
            
//                 if(alp[i] == ar){
//                     arr[ar - 65] += 1;
//                 }
               
//             }
           
//             if(cnt == str.length()-1){
//                     break;
//             }
//             cnt ++; 
           
            
//         }

//         int cnt2 = 0;
//         for(int i = 0 ; i < arr.length; i ++){
//             if(arr[i] % 2 != 0){
//                 cnt2 ++;

//             }
//         }
//         if(cnt2 > 1){
//             System.out.println("I'm Sorry Hansoo");
        
//         }
//         else if(cnt2 == 1){
            
//             for(int i = 0; i < arr.length; i ++){

//                 if(arr[i] != 0){
//                     char value = (char) (65 + i);
//                     System.out.print(value);
//                 }
//             }
//             for(int i = arr.length-1; i >= 0; i --){
//                 char value = (char) (65 + i);
//                 if(arr[i] != 0){
//                     System.out.print(value);
//                 }
//             }

//         }
//         else{
//             int cnt3 = 0;
//             if(str.length()%2 == 0){

//                 while(true){
//                     if(cnt3 == str.length()){
//                         break;
//                     }
//                     for(int i = 0; i < arr.length; i ++){

//                         if(arr[i] != 0){
//                             char value = (char) (65 + i);
//                             arr[i] -= 1;
//                             System.out.print(value);
//                             cnt3 ++;
//                         }
//                     }
//                     for(int i = arr.length-1; i >= 0; i --){
//                         char value = (char) (65 + i);
//                         if(arr[i] != 0){
//                             System.out.print(value);
//                             arr[i] -= 1;
//                             cnt3 ++;
//                         }
//                     }

//                 }
                

//             }


//         }

//         System.out.println(cnt);
//         System.out.println(Arrays.toString(arr));
  

//     }
    
// }


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1213 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int[] alpha = new int[26];
		
		for(char ch : s.toCharArray()) {
			alpha[ch - 'A']++;
		}
		
		int n = 0, mid = 0;
		for(int i = 0; i < 26; i++) {
			if(alpha[i] % 2 == 1) {
				mid = i;
				n++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if((s.length() % 2 == 1 && n > 1) || (s.length() % 2 == 0 && n > 0)) {
			sb.append("I'm Sorry Hansoo");
		}
		else {
			String answer = "";
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < alpha[i] / 2; j++) {
					answer += (char)(i + 'A');
				}
			}
			
			String rev = new StringBuilder(answer).reverse().toString();
			if(n == 1) {
				answer += (char)(mid + 'A');
			}
			
			sb.append(answer + rev);
		}
		System.out.print(sb);
	}
}