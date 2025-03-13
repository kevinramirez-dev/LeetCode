public class RemoveElement27YT {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args) {

        int [] nums = {1,2,2,3,4,5,6,7};

        RemoveElement27YT obj = new RemoveElement27YT();

        System.out.println(obj.removeElement(nums, 2));

    }

}
