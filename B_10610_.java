import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class B_10610_{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        for(int i=0; i<s.length(); i++) {
            sum += s.charAt(i)-'0';
            list.add(s.charAt(i)-'0');
        }
        
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println(sum);
        if(list.get(0)==0 && sum %3 == 0) {//30의 배수가 맞으면
            for(int i=list.size()-1; i>=0; i--)//출력
                System.out.print(list.get(i));
        }
        else
            System.out.println(-1);
    }
    
}
