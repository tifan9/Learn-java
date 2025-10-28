public class PositiveNegative {
        public static int[] countPositivesSumNegatives(int[] input)
{
    if(input == null || input.length == 0){
        return new int[0];
    }
    int positive = 0;
    int negative = 0;
    for(int number : input){
        if(number > 0){
            positive ++;
        }else if(number < 0 ){
            negative += number;
        }
    
    }
    return new int[]{positive, negative};
}
}
