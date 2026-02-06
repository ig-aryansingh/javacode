class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int n = arr.length;
        int l = 0;
        int sum = 0;
        int ans = n + 1;
        for(int r = 0; r < n; r++) {
            sum += arr[r];
            while(sum > x) {
                if(r - l + 1 < ans)
                    ans = r - l + 1;
                sum -= arr[l];
                l++;
            }
        }
                 if(ans == n + 1)
                 return 0;
                 else
                 return ans;
    }
}
