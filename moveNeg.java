//Goal: Move the negative number to the end of the array.
//You may assume there is only one negative number.
//All other numbers must remain in the same order.
//Codingbat doesn't check if you used a 2nd array or modified the original.
//Please only use the single array, do not make a copy.
//Return the modified array when you are done.


//moveNegativeToEnd([-1]) → [-1]
//moveNegativeToEnd([-1, 1, 2]) → [1, 2, -1]
//moveNegativeToEnd([1, -1, 2]) → [1, 2, -1]
import java.util.Arrays;
public class moveNeg{

  public static int[] moveNeg(int[] nums){
    for (int i = 0; i < nums.length; i++){

      if (nums[i] < 0){
        int placeholder = nums[i];
        for (int j = i; j < nums.length - 1; j++){
          nums[j] = nums[j + 1];
        }
        nums[nums.length - 1] = placeholder;
      }
    }
    return nums;
    }

    public static void main(String[] args) {
      System.out.println(Arrays.toString(
          moveNeg(new int[]{-1})
      ));

      System.out.println(Arrays.toString(
          moveNeg(new int[]{-1, 1, 2})
      ));

      System.out.println(Arrays.toString(
          moveNeg(new int[]{1, -1, 2})
      ));
  }



  }
