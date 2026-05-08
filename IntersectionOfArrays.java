import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);

        Set<Integer> result = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) result.add(n);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));        // [2]
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));  // [4, 9]
    }
}
