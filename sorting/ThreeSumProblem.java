package sorting;
import java.util.*;


//Here its done slightly different than the homework. Both are O(n2) time.
public class ThreeSumProblem {

	public static void main(String[] args) {

		int[] arr = {1, 2, 1, 3, -8, 4, 6, 9, -7};
		List<List<Integer>> res = threeSum(arr);
		for (List<Integer> l : res)
			System.out.println(l);
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length < 3)
            return res;
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        for (int i = 0; i < nums.length - 2; i++) {
            //avoid duplicates
            if (i == 0 || nums[i] > nums[i - 1]) {
                int neg = -1 * nums[i];
                int low = i + 1;
                int high = nums.length - 1;
                
                while(low < high) {
                    if (neg == nums[low] + nums[high]) {
                        List<Integer> lst = new ArrayList<Integer>();
                        lst.add(-1 * neg);
                        lst.add(nums[low]);
                        lst.add(nums[high]);
                        res.add(lst);
                        low++;
                        high--;
                        //Avoid duplicates
                        while(low < high && nums[low] == nums[low - 1])
                            low++;
                        while(low < high && nums[high] == nums[high + 1])
                            high--;
                    }
                    else if(neg < nums[low] + nums[high])
                        high--;
                    else
                        low++;
                }
            }
        }
        
        return res;
    }
}
