import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class B_4134{

    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int TC = Integer.parseInt(str);

        for(int i = 0 ; i < TC; i ++){
            String str2 = br.readLine();
            Long n = Long.parseLong(str2);
            BigInteger isPrime = new BigInteger(String.valueOf(n));
            if(isPrime.isProbablePrime(10)){
                System.out.println(isPrime);
            }else{
                System.out.println(isPrime.nextProbablePrime());
            }

        }


	}

    // public static void Prime(long num){
       

    //     while(true){

    //         boolean tf = false;
    //         for(long i = 2; i < num; i ++){
    //             if(num%i == 0){
    //                 tf = true;
    //                 break;
    //             }
    //         }
    //         if(tf == false){
    //             sb.append(num + "\n");
    //             return;
                
    //         }else{
    //             num++;
    //         }
    //     }
    // }
}

// import java.math.BigInteger;
// import java.util.Scanner;

// public class B_4134 {
  
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int n = scanner.nextInt();
    
//     for (int i = 0; i < n; ++i) {
//       long testValue = scanner.nextLong();
//       BigInteger nextPrimeNumber = new BigInteger(String.valueOf(testValue));
      
//       if (nextPrimeNumber.isProbablePrime(10)) {  // 입력 값이 소수면 그대로 출력 
//         System.out.println(nextPrimeNumber);
//       } else {  // 입력 값이 소수가 아니면 다음 소수를 구해서 출력
//         System.out.println(nextPrimeNumber.nextProbablePrime());
//       }
//     }
//     scanner.close();
//   }
// }