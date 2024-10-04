package tutorrial.Hashmap;
import java.util.HashMap;

public class towSum {
   

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 5 ;
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i ++ ) {
            int test = target - nums[i];
            if (hashmap.containsKey(test)) {
                return new int[]{hashmap.get(test),i};
                // return new int[] {hashmap.get((test),i)}; 
            }
            hashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
}
