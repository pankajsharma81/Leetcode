class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        // Handle negative powers
        if (n < 0) {
            x = 1 / x;
            // Special handling for Integer.MIN_VALUE to avoid overflow
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE; // Make it positive while considering its absolute value
                return myPow(x, n) * x; // Since Integer.MAX_VALUE + 1 gives the correct result
            }
            n = -n;
        }
        
        double halfPower = myPow(x, n / 2);
        double result = halfPower * halfPower;

        if (n % 2 != 0) {
            result *= x;
        }

        return result;
    }
}
