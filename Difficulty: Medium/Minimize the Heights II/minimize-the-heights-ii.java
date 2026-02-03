class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        if (small > big) {
            int temp = small;
            small = big;
            big = temp;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;
            int minHeight = Math.min(small, arr[i] - k);
            int maxHeight = Math.max(big, arr[i - 1] + k);
            ans = Math.min(ans, maxHeight - minHeight);
        }
        return ans;
    }
}
