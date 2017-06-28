package Easy;

import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}

    public static void main(String[] args) {
		System.out.println("Test Start");
		TwoSum s = new TwoSum();
		int[] array = {3,2,4};
		int[] result = s.twoSum(array,6);
		System.out.print("[");
		for (int x : result) {
			System.out.print(x+",");
		}
		System.out.println("]");
		System.out.println("Test Ends");
	}
}