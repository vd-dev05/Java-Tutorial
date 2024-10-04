package leetcode.towSum;
// 1 Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
       // O(n^2)
        for (int i = 0 ; i < nums.length ; i ++ ) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            } 
        }
        return new int[]{};
// O(n)
          HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i ++ ) {
            int test = target - nums[i];
            if (hashmap.containsKey(test)) {
                return new int[]{hashmap.get(test),i};
            }
              hashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

