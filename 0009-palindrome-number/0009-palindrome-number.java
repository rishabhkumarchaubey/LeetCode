class Solution {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}