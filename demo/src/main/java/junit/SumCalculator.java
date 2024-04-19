package junit;

public class SumCalculator {
    public int add(int n) {
    	int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }
}