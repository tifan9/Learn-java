public class SmallestInteger {
        public static int findSmallestInt(int[] args) {
            int min = Integer.MAX_VALUE;
            for(int num : args){
min = Math.min(min, num);
            }
            return min;
        }
}
