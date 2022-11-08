import java.util.List;

public class BinarySearch {

    public static Integer binarySearch1(int[] nums, int flag){
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        int res = -1;
        while (low <= high) {
            if (flag > nums[mid]){
                low = mid + 1;
            } else if (flag < nums[mid]) {
                high = mid - 1;
            }else if (flag == nums[mid]){
                res = nums[mid];
            }
        }
        return res;
    }

    public static Integer binarySearch2(int[] nums, int flag,int left,int right) {
        if (left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if (flag > nums[mid]){
            left = mid + 1;
            return binarySearch2(nums,flag,left,right);
        }else if (flag == nums[mid]) {
            return mid;
        }else{
            right = mid - 1;
            return binarySearch2(nums,flag,left,right);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Integer result = binarySearch2(nums, 12,0, nums.length -1);
        Integer res = binarySearch1(nums, 10);
        System.out.println("二分查找2的结果:" + result);
        System.out.println("二分查找1的结果:" + res);
    }
}
