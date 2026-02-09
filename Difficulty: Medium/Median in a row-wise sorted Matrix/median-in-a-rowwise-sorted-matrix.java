class Solution {
    public int median(int[][] mat) {
        // code here
  int n = mat.length;
        int m = mat[0].length;
        int low = 1, high = 2000;
        int req = (n * m) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += countSmallerEqual(mat[i], m, mid);
            }
            if (count <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    int countSmallerEqual(int[] row, int m, int x) {
        int l = 0, r = m - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (row[mid] <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}