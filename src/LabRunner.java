import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str = scan.nextLine();
        int score = 0;
        while(score != 0) {
            System.out.print("Enter next word: ");
            String str2 = scan.nextLine();

            if (str.compareTo(str2) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (str.compareTo(str2) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else {
                score -= 10;
                System.out.println("-10 points: current word match previous word; SCORE: " + score);
            }

        }


    }
}
