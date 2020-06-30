class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int s1 = 1, s2 = 1;
        int result = 0;
        
        for (int i = 2; i <=n; i++) {
            result = s1+s2;
            s2 = s1;
            s1 = result;
        }
        return result;
    }
    
}