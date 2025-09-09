class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String doubled = s + s;

        int res = n; 
        int diff1 = 0, diff2 = 0;
        int left = 0;

        for (int right = 0; right < 2 * n; right++) {
            char c = doubled.charAt(right);

            if (c != (right % 2 == 0 ? '0' : '1')) diff1++;
            if (c != (right % 2 == 0 ? '1' : '0')) diff2++;

            if (right - left + 1 > n) {
                char leftChar = doubled.charAt(left);
                if (leftChar != (left % 2 == 0 ? '0' : '1')) diff1--;
                if (leftChar != (left % 2 == 0 ? '1' : '0')) diff2--;
                left++;
            }

            if (right - left + 1 == n) {
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }

        return res;
    }
}
