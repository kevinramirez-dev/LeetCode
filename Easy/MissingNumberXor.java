/*
Given an array nums containing n distinct numbers in the range [ 0,n ] return the only number in the range that
missing from the array

Could you implement a solution using only 0 (1) extra space complexity and 0 (n) runtime complexity?

 */



public class MissingNumberXor {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 6, 4, 5, 2}; // Example array, missing number should be 2

        int missing = missing_number(nums);
        System.out.println("Missing number: " + missing);
    }

    static int missing_number(int[] nums) {
        int n = nums.length;
        int allXOR = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            allXOR ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            allXOR ^= num;
        }

        return allXOR;
    }
}
