package codewars;
//https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

public class Squareroot {
    public static int squareSum(int[] n)
  { 
   //Your Code
    int sum = 0;
    for (int num : n){
      sum += num * num;
    }
    return sum;
  }
}
