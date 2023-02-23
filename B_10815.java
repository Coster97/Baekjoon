import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10815 {

    static int[] arr;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        arr = new int[testCase];

        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str2, " ");

        for(int i = 0; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        String str3 = br.readLine();
        int testCase2 = Integer.parseInt(str3);

        String str4 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str4, " ");


        for(int i = 0; i < testCase2; i ++){
            System.out.print(binarySearch(Integer.parseInt(st2.nextToken()), 0, testCase-1) + " ");
           
        }





    }
    public static int binarySearch(int key, int low, int high){
        int mid;

        
        while(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				return 1;
			} else if(key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return 0;  

    }
    
}
