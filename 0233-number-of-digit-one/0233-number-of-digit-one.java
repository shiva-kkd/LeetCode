public class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long digit = 1;
        long high = n / 10, cur = n % 10, low = 0;

        while (high != 0 || cur != 0) {
            if (cur == 0) {
                count += high * digit;
            } else if (cur == 1) {
                count += high * digit + low + 1;
            } else {
                count += (high + 1) * digit;
            }
            low += cur * digit;
            cur = high % 10;
            high = high / 10;
            digit *= 10;
        }

        return count;
    }
}
