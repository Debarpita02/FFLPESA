class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findFirstPosition(nums, target);
        int lastPos = findLastPosition(nums, target);
        
        return new int[]{firstPos, lastPos};
    }
    
    private int findFirstPosition(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        
        return index;
    }
    
    private int findLastPosition(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }
}
