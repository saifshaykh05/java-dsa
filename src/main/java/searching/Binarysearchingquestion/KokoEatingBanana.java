package searching.Binarysearchingquestion;

public class KokoEatingBanana {
    class Solution {

        private int findMax(int[] piles) {
            int max = piles[0];

            for (int pile : piles) {
                if (pile > max) {
                    max = pile;
                }
            }

            return max;
        }

        private long calculateHours(int[] piles, int speed) {
            long hours = 0;

            for (int pile : piles) {
                hours += (long) Math.ceil((double) pile / speed);
            }

            return hours;
        }

        public int minEatingSpeed(int[] piles, int h) {

            int left = 1;
            int right = findMax(piles);

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (calculateHours(piles, mid) <= h) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }
    }
}
