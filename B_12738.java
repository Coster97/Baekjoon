import java.io.*;
import java.util.*;

public class B_12738{

    static int[] arr;
    static int[] lis;
    static int length = 1;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        arr = new int[N];
        lis = new int[N];
        for(int i = 0 ; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        lis[0] = arr[0];
        BS(1);

        System.out.println(Arrays.toString(lis));
        System.out.println(length);

    }
    public static int BS(int index){

        if(index == arr.length){
            return length;
        }

        int key = arr[index];
        if(lis[length-1] < key){
            length ++;
            lis[length-1] = key;
        }
        else{

            int low = 0;
            int high = length;
        
            while(low < high){
                int mid = (low + high) >> 1;
                if(lis[mid] < key){
                    low = mid + 1;
                    lis[mid+1] = key;
            
                }else{
                    high = mid;
                }
            }
        }

        BS(index + 1);
        return length;

    }
}

