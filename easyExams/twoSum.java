package easyExams;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int arrLength = nums.length;
        int[] result = new int[2];
        for(int i=0; i < arrLength; i++){
            for(int j=i+1; j < arrLength; j++){
                if (nums[i]+nums[j] != target){
                    continue;
                }
                else {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
