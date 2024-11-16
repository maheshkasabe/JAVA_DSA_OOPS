// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class find_min_num {
    public static void main(String[] args){
        int[] nums = {-4,0,1,2,3};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    static public int findMin(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        int min = nums[0];
        while(s<=e){
            if(nums[s] < nums[e]){
                min = Math.min(min, nums[s]);
                break;
            }
            int mid = s + (e-s)/2;
            min = Math.min(min, nums[mid]);
            if(nums[s] <= nums[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return min;
    }
}
