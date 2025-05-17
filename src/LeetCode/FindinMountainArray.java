package LeetCode;

public class FindinMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int s = 0, e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        int peak = s;

        s = 0;
        e = peak;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;
            else if (val < target) s = mid + 1;
            else e = mid - 1;
        }

        s = peak + 1;
        e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;
            else if (val > target) s = mid + 1;
            else e = mid - 1;
        }

        return -1;
    }
}
