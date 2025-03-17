public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return 0;

        int  majority = nums[0], votes = 1;

        for(int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else
                votes--;
        }
        return majority;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3, 5, 6, 7, 8, 3, 1, 1, 2, 2};

        MajorityElement169 obj = new MajorityElement169();

        System.out.println("The majority element is: " + obj.majorityElement(arr));

    }
}
