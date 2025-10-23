public class HighestAndLowest {
      public static String highAndLow(String numbers) {
      String [] numArray = numbers.split("");
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(String num : numArray){
        int n = Integer.parseInt(num);
        max = Math.max(max, n);
        min = Math.min(min,n);

      }
      return max + " " + min;
    }
}
