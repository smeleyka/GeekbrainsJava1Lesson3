import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by smeleyka on 03.04.17.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }

    public static void guessNumber() {
        while (true) {
            System.out.println("Угадайте число от 0 до 9");
            int xNumber = random.nextInt(10);
            int uInput;
            for (int i = 0; i < 3; i++) {
                uInput = sc.nextInt();
                if (xNumber > uInput) System.out.println("Больше");
                else if (xNumber < uInput) System.out.println("Меньше");
                else if (xNumber == uInput) {
                    System.out.println("Угадал!!!");
                    i = 3;
                }
            }
            System.out.println("Еще разок? (1-да/0-нет)");
            uInput = sc.nextInt();
            if (uInput == 0) break;
        }
    }

    public static void guessWord() {
        while (true) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            int rand = random.nextInt(words.length);
            char empty = '#';
            String xWord = words[rand];
            System.out.println("Угадайте слово из " + xWord.length() + " букв.");
            while (true) {
                String uWord = sc.nextLine();
                if (xWord.equals(uWord)) {
                    System.out.println("Угадал!");
                    break;
                }

                for (int i = 0; i < 15; i++) {
                    if (i < xWord.length() && i < uWord.length() && uWord.charAt(i) == xWord.charAt(i)) {
                        System.out.print(xWord.charAt(i));
                    }
                    else System.out.print(empty);
                }
                System.out.println();
            }
        }
    }
}

