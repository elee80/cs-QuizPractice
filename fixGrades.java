//You are writing a grade "fixing" program to "help" [insert rival school] students compete with your school!
//Given an array that contains a set of integer scores, calculate the mean (average) and then modify the array as follows:
//Any grade above average gets cut in half.
//Any grade below average gets doubled, but has a maximum of 100.
//Write a helper method to calculate the mean of the scores.
//Codingbat doesn't check if you used a 2nd array or modified the original.
//Please only use the single array, do not make a copy. Return the modified array when you are done.


//fixGradesArray([]) → []
//fixGradesArray([80, 80, 90, 90, 70, 70]) → [80, 80, 45, 45, 100, 100]
//fixGradesArray([0, 0, 0, 0, 0, 0]) → [0, 0, 0, 0, 0, 0]
import java.util.Arrays;

public class fixGrades{
  public static int[] fixGrades(int[] grades){
    double mean = meanGrades(grades);

    for (int i = 0; i < grades.length; i++){
      if (grades[i] > mean){
        grades[i] = grades[i] / 2;
      }
      else if (grades[i] < mean){
      grades[i] = grades[i] * 2;

      if (grades[i] > 100){
        grades[i] = 100;

      }

    }
    }
    return grades;
  }

  public static double meanGrades(int[] grades){
    double sum = 0;
    for (int i = 0; i < grades.length; i++){
      sum = sum + grades[i];
    }
    return sum / grades.length;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        fixGrades(new int[]{80, 80, 90, 90, 70, 70})
    ));

    System.out.println(Arrays.toString(
        fixGrades(new int[]{0, 0, 0, 0, 0, 0})
    ));

    System.out.println(Arrays.toString(
        fixGrades(new int[]{})
    ));
}

}
