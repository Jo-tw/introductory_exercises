import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
    findPrimeFactors(12);
    }

    static void findPrimeFactors(int n) {

        List<Integer> l1 = new ArrayList<Integer>();


        int factor = 2;

        while (n != 1) {
            if (n % factor == 0) {
                l1.add(factor);
                n = n / factor;
            } else {
                factor += 1;

            }
        }

        System.out.println(l1);

    }
}
