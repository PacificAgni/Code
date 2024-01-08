class Solution {
    public int minEatingSpeed(int[] piles, int h) {
                Arrays.sort(piles);

        int min = 1;
        int max = piles[piles.length - 1];

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (helper(piles, h, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

    public boolean helper(int[] piles, int h, int k) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += Math.ceil((double) piles[i] / k);
        }
        return time <= h;
    }
}
