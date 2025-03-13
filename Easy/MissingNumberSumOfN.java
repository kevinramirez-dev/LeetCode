public class MissingNumberSumOfN {
    public int missingNumber(int[] arr) {
        // set n to the length of the array

        int n = arr.length;

        // Calculate the sum of the array elements
        int sum = 0;

        for(int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        //calculate the expected sum
        int ExpectedSum = (n *(n + 1) / 2);

        return ExpectedSum - sum;

    }
    public static void main(String[] args) {
        int [] arr = {1,7,2,3,4,6,8,9};

        MissingNumberSumOfN obj = new MissingNumberSumOfN();

        System.out.println(obj.missingNumber(arr));
    }
}
