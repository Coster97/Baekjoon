import java.io.*;
import java.util.*;



public class B_1269 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();


        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for(int i = 0 ; i < A; i ++){

            arr1.add(Integer.parseInt(st2.nextToken()));


        }

        String str3 = br.readLine();
        StringTokenizer st3 = new StringTokenizer(str3, " ");

        for(int i = 0 ; i < B; i ++){

            arr2.add(Integer.parseInt(st3.nextToken()));


        }

       int cnt = 0;

       for(int num : arr1) {
        if(!arr2.contains(num)) {
            cnt += 1;
        }
    }
    for(int num : arr2) {
        if(!arr1.contains(num)) {
            cnt += 1;
        }
    }

        System.out.println(cnt);
      
    }
 
}
