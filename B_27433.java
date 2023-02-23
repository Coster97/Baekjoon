import java.util.*;
import java.math.BigInteger;
class B_27433{
      public static void main(String[] args) 
      {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(factorial(n));
      }

      public static BigInteger factorial(int n) 
      {
            BigInteger f = new BigInteger("1");
            for (int i = n; i > 0; i--)
                  f = f.multiply(BigInteger.valueOf(i));
            return f;
      }
}
