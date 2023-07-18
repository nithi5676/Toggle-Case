package toggleCase;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = scanner.next();
        scanner.close();
        toggle(word);
    }

    private static void toggle(String word) {
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ (1 << 5));
        }

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]);
        }
    }

}
