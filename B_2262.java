import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class B_2262{

    public static void main(String[] args)throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        for(int i = 0; i<TC; i ++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int sum = 0;

        if(arr.size() % 2 != 0){
            while(!arr.isEmpty()){
                int end = arr.size() -1;
                int middle = arr.size()/2;
                sum += Math.abs(arr.get(middle) - arr.get(end));
                arr.remove(end);
                if(arr.size() == 2){
                    sum += Math.abs(arr.get(0) - arr.get(1));
                }

            }
        }else if(arr.size() % 2 == 0){
            int start = 1;
            while(!arr.isEmpty()){
                if(arr.size() > 4){
                    int end = arr.size() -1;
                    sum += Math.abs(arr.get(start) - arr.get(end));
                    arr.remove(end);
                    start ++;
                }
                
                else if(arr.size() == 4){
                    sum += Math.abs(arr.get(2) - arr.get(3));
                    sum += Math.abs(arr.get(1) - arr.get(2));
                    sum += Math.abs(arr.get(0) - arr.get(1));
                    break;
                   
                }
                else if(arr.size() == 2){
                    sum += Math.abs(arr.get(0) - arr.get(1));
                    break;
                   
                }
            }
        }
        System.out.println(sum);
    }
}