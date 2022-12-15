// Faster Solution (Beats 100% of Java Submissions [0ms runtime])
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!(i == 0)) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        return nums;
    }
}

// Original Solution
class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int roundSum = nums[i];
            for (int j = 0; j < i; j++) {
                roundSum += nums[j];
            }
            runningSum[i] = roundSum;
        }
        return runningSum;
    }
}