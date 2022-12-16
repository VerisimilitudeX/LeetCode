# Highly Efficient Java Solution (Beats 100% In Runtime And 94% in Memory Usage)

## Intuition

My first thought on how to solve this problem is to iterate through the array and add the current element to the previous element. This will give us a running sum of the elements in the array.

## Approach

To implement this approach, I will use a for loop to iterate through the array. I will check if the current index is not equal to 0, as we do not want to add the element at index 0 to itself. If the current index is not 0, I will update the value at the current index to be the sum of the current element and the previous element.

## Complexity

- Time complexity: O(n)
  - The time complexity of this solution is O(n), as we are iterating through the array once and performing a constant number of operations on each element.

- Space complexity: O(1)
  - The space complexity of this solution is O(1), as we are not using any additional data structures or variables to store the running sum.
  -

## Code

```java
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
```

For more details: <https://leetcode.com/problems/running-sum-of-1d-array/solutions/2916215/highly-efficient-solution-beats-100-in-runtime-and-94-in-memory-usage/>
