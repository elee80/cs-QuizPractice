
//Find and return the largest value in the array.
//You may assume arr.length is not zero.


//largestValue([100]) → 100
//largestValue([9, 8, 7]) → 9
//largestValue([7, 8, 9]) → 9
import java.util.Arrays;
public class largestValue {
  public static int largestValue(int[] values){
int i = 0;
int biggest = values[0];
    for (i = 0; i < values.length; i++){
      if (values[i] > biggest){
        biggest = values[i];
      }

    }
    return biggest;
  }

  public static void main(String[] args){
    System.out.println(largestValue(new int[]{100}));
System.out.println(largestValue(new int[]{100, 9, 10, 10001, 696969696, 67676767676767}));
  System.out.println(largestValue(new int[]{10, 9, 8, 11}));

  }
}
