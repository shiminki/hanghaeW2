import java.lang.Math;

public class test {
    public static void main(String[] args) {
        // initial state
        int sum = 0;

        System.out.println("시작!");
        while (sum != 5) {
            // get two random integer from 1 to 6 inclusive
            int firstRoll = (int) (Math.random() * 6) + 1;
            int secondRoll = (int) (Math.random() * 6) + 1;
            System.out.println(String.format("%d %d", firstRoll, secondRoll));

            sum = firstRoll + secondRoll;
        }
        System.out.println("끝!");
    }
}
