/**
 * Created by iprocoder on 2015/5/6.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = true;
                }
            }

        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == false) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(10000));

    }
}
