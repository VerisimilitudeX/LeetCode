class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.toString().contains(String.valueOf(target - nums[i]))) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == (target - nums[i])) {
                        int[] return_list = { i, j };
                        return return_list;
                    }
                }
            }
        }
        return nums;
    }

    public int[] twoSumSolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] inputlist = { 3,3 };
        int[] outputlist = twoSum(inputlist, 6);
        for (int outputnum : outputlist) {
            System.out.println(outputnum);
        }
    }
}