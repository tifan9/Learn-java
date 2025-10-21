package codewars;
public class Rockpaper {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if ((p1.equals("Rock") && p2.equals("Scissors")) ||
                   (p1.equals("Scissors") && p2.equals("Paper")) ||
                   (p1.equals("Paper") && p2.equals("Rock"))) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}
