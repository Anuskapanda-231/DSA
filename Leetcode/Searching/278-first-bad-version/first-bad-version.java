/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1;
        int high = n;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                // first bad version is at mid or before mid
                high = mid;
            } else {
                // first bad version is after mid
                low = mid + 1;
            }
        }

        return low;
    }
}