import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
 
public class B_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> crane = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int m = Integer.parseInt(br.readLine());
        List<Integer> box = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        // end input
 
        crane.sort(Comparator.reverseOrder());box.sort(Comparator.reverseOrder());
        int sec=0;
        if(box.get(0)>crane.get(0)){
            System.out.println(-1);
            return;
        }
        while(!box.isEmpty()){
            sec++;
            System.out.println(sec);
            for (Integer curCrane : crane) {
                for(int i=0;i<box.size();i++){
                    if(curCrane>=box.get(i)){
                        box.remove(i);
                        break;
                    }
                }
            }
        }
        System.out.println(sec);
    }
}