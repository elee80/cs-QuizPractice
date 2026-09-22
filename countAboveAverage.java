//Write a Java function named countAboveAverage that takes an array
//of integers and returns the number of elements
//that are strictly greater than the average of the array.
//Hint: First compute the sum and average.

//countAboveAverage([2, 4, 6, 8, 10]) → 2
//countAboveAverage([1, 2, 3, 4, 5, 6]) → 3
//countAboveAverage([-10, 2, 3, 4, 5, 6]) → 5
import java.util.Arrays;
public class countAboveAverage{
  int count = 0;
  public static int countAboveAverage(int[] nums){
    if (int[i] > (sumFunc(int[] nums) / nums.length)){
      count++;
    }
    return count;
  }


public static int sumFunc(int[] nums){
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    sum = sum + nums[i];
  }
}




  public static void main(String[] args){
    System.out.println(sumFunc(new int[]{3, 2, 4});
    System.out.println(countAboveAverage(new int[]{2, 4, 6, 8, 10}) );

  }
}
