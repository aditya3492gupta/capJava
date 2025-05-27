package json;
import java.util.*;

public class Num {
    public static void main(String[] args) throws OddException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = reverseNum(n);
//        System.out.println(m);
        int sum = (m % 10) + ((m % 100) / 10);
//        System.out.println(sum);
        
        try {
            if (sum % 2 == 1) {
                throw new OddException();
            }
        }catch(OddException e) {
        	System.out.println("send even");
        }
        
    }

    public static int reverseNum(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + (n % 10);
            n /= 10;
        }
        return ans;
    }
}
