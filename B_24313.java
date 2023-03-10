import java.util.*;

public class B_24313{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        

        Set<Integer> result = new HashSet<>();
        for (int i = n0; i <= 100; i++) {
            int fn = a1 * i + a0;
            int gn = i;

            if (fn <= c * gn) {
                result.add(1);
            } else {
                result.add(0);
            }
        }

        if (result.contains(0)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}
