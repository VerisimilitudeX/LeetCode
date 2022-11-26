class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        else if (s.equals(goal)) {
            
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rotateString("abcde", "cdeab"));
    }
}
