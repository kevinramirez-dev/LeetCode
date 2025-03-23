public class RemoveDuplicates80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 2;  // Allow at most two occurrences

        for (int j = 2; j < nums.length; j++) {  // Fix: Start j from 2
            if (nums[j] != nums[i - 2]) {  // Compare with nums[i-2]
                nums[i] = nums[j];
                i++;  // Fix: Move i forward when a valid new number is found
            }
        }
        return i;  // New length of the modified array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6};

        RemoveDuplicates80 obj = new RemoveDuplicates80();
        int newLength = obj.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

