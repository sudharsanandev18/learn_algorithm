package strivers_a2z_dsa_course.solve_problem_on_array.easy;

public class RotatedSortedArrayChecker {

    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next one in circular manner
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            // More than one drop in order => not rotated sorted array
            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        RotatedSortedArrayChecker checker = new RotatedSortedArrayChecker();

        int[] nums1 = { 3, 4, 5, 1, 2 };
        int[] nums2 = { 2, 1, 3, 4 };
        int[] nums3 = { 1, 2, 3 };

        System.out.println(checker.check(nums1)); // true
        System.out.println(checker.check(nums2)); // false
        System.out.println(checker.check(nums3)); // true
    }
}
