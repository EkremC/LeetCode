package Algorithms.Easy;

// https://leetcode.com/problems/move-zeroes/description/
public class _283_MoveZeroes {
    
	public void moveZeroes(int[] nums){
		int lastChangedIndex = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				for(int j = lastChangedIndex; j < i; j++){
					if(nums[j] == 0){
						swap(nums, i, j);
                        lastChangedIndex = j;
                        break;
					}

				}
			}
		}
	}

	private void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}

    public static void main(String[] args) {
        new _283_MoveZeroes().moveZeroes(new int[]{0,1,0,3,12});
    }
}
