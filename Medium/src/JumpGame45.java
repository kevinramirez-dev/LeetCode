public class JumpGame45 {
    int jump (int [] nums) {
        int jumpsMade = 0;

        int destination = nums.length - 1;

        int coverage = 0, lastJumpIndex = 0;

        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {

            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                jumpsMade++;

                if (coverage >= destination) {
                    return jumpsMade;
                }
            }
        }
        return jumpsMade;

    }
}
