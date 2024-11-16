import java.util.ArrayList;

class single_element{
    public static void main(String[] args){
        int[] nums = {1,2,2,5,5};
        System.out.println(find(nums));
    }

    public static ArrayList<Integer> find(int[] nums) {
        ArrayList ls = new ArrayList<>();
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[j-1] && nums[j] != nums[j+1]){
                ls.add(nums[j]);
            }
        }
        return ls;
    }
}