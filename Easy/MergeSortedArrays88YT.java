public class MergeSortedArrays88YT {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = nums1.length - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && (j < 0 || nums1[i] > nums2[j])) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has extra space for nums2 elements
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArrays88YT obj = new MergeSortedArrays88YT();
        obj.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

