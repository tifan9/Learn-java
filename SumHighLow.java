/*
Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

 */
public class SumHighLow {
    public static int sum(int[] numbers)
  {
    if(numbers == null || numbers.length <= 2){
      return 0;
    }
    int sum = 0;
    int max = numbers[0];
    int min = numbers[0];
    for(int i=0; i<numbers.length; i++){
      sum += numbers[i];
      if(numbers[i] > max){
        max = numbers[i];
      }
      if(numbers[i] < min){
        min = numbers[i];
      }
    }
    return sum - max - min;
  }
}
