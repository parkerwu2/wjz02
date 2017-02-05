package maxSubArray;

/**
 * Created by Administrator on 2017/2/5.
 */
//输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个
//
//        子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O(n)。
//
//        例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，因此输出为该子数组的和18。
public class Main {
    public static void main(String[] args) {
        int a[] = {1, -2, 3, 10, -4, 7, 2, -5};
        find(a);
        System.out.println(getMaxSubArray2(a));
    }
    //公式递推
    public static int getMaxSubArray2(int a[]){
        int[] dp = new int[a.length];
        dp[0] = a[0];
        int answer = dp[0];
        for(int i=1; i< a.length; i++){
            dp[i] = Math.max(dp[i-1]+a[i], a[i]);
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }
    private static void find(int[] a) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        if (maxSum == 0) {
            maxSum = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] > maxSum) {
                    maxSum = a[i];
                }
            }
        }
        System.out.println(maxSum);
    }
}
