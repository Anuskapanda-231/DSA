class Solution {

    public boolean isHappy(int n) {

        int slow =n;
        int fast = squareSum(n);

        while (fast != 1 && slow != fast) {

            slow = squareSum(slow);

            fast = squareSum(squareSum(fast));
        }

        return fast == 1;
    }

    public int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}