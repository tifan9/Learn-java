package codewars;
// check for a factor number
public class Grasshopper {
    public static boolean checkForFactor(int base, int factor){
        if(factor == 0){
            return false;
        }
        return base % factor == 0;
    }
}
