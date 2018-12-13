package palindrom.test;

import java.util.Scanner;

public class PalindromTest {

    public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        System.out.print("Geben Sie bitte das zu pruefende Wort ein: ");
        String wort = ts.nextLine();
        wort = wort.toLowerCase();

        String awort = normalize(wort);

        boolean b = isPalindrom(awort);
        if (b == true) {
           
            System.out.println("Das Wort " + (char)34 + awort + (char)34 + " ist ein Palindrom");
        }
        if (b == false) {
            System.out.println("Das Wort " + (char)34 +awort + (char)34 + " ist kein Palindrom");
        }
    }

    static boolean isPalindrom(String wort) {
        int i = 0;
        int j = wort.length() - 1;
        while (i < j) {

            if (wort.charAt(i) != wort.charAt(j)) {
                return false;
            }

            i = i + 1;
            j = j - 1;

        }
        return true;
    }

    static String normalize(String wort) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < wort.length(); i++) {
            char aChar = wort.charAt(i);
            boolean c = Character.isAlphabetic(aChar);
            if (c == true) {
                strBuilder.append(aChar);
                }
        }
        return strBuilder.toString();
    }

}
