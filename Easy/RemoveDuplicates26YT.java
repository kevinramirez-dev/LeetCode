public class RemoveDuplicates26YT {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            nums[i++] = nums [j];

            while (j != nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args){

        int [] nums = {1,2,2,3,3,4,5,6,7};

        RemoveDuplicates26YT obj = new RemoveDuplicates26YT();

        System.out.println(obj.removeDuplicates(nums));
    }

}
