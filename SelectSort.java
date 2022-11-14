import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName:SelectSort
 * @Auther: wjh
 * @Date: 2022/11/14 20:55
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] nums = {1,5,2,6,3,7,9,8};
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length;j++){
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

}
