class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> a = new HashSet<>();
        for (int i = 0; i<nums.length; i++){
            if (a.contains(nums[i])){
                return true;
            }
            a.add(nums[i]);
            
        }return false;
        
    }
}