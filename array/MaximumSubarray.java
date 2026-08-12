import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            currSum = currSum + nums[i];

            if (nums[i] > currSum) {
                currSum = nums[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        System.out.println(maxSum);
    }
}