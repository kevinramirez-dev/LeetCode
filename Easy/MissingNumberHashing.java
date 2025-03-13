
// Using Hashing - O(n) Time and O(n) Space
public class MissingNumberHashing {
    static int missingNumber(int[] arr) {
        int n = arr.length + 1;

        // Create hash array of size n+1
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr
                = { 1, 2, 3, 5 };
        int res = missingNumber(arr);
        System.out.println(res);
    }
}
