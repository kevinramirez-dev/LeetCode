
// O(n^2) Time and O(1) Space

public class MissingNumberNaive {
    static int missingNumber (int[] nums) {
        // Integer (n) will equal the length of the array plus one (the number that is missing)

        //We will create a loop to iterate through the array

        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
                }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    int [] arr = {0, 1, 2, 3, 6, 7, 8, 5};
    System.out.println(missingNumber(arr));

    }
}
