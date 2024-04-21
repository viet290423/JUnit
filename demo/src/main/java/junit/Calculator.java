package junit;

public class Calculator {
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

    public int multiply(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số n phải lớn hơn hoặc bằng 0");
        } else {
            if (n == 0) {
                return 0; 
            } else {
                int product = 1; 
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                return product;
            }
        }
    }
}