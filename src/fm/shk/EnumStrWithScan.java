package fm.shk;

import java.util.Scanner;

public class EnumStrWithScan {

    public static void main(String[] args) {

        System.out.println("Input text : ");
        String text = null;
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
        }

        int smallestWordNumber = 0;
        int smallestWordLength = Integer.MAX_VALUE;
        int i = smallestWordNumber;
        String smallestWord = null;

        try (Scanner scanner = new Scanner(text)) {
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                i += 1;
                int currentWordLength = currentWord.length();
                if (currentWordLength < smallestWordLength) {
                    smallestWordLength = currentWordLength;
                    smallestWordNumber = i;
                    smallestWord = currentWord;
                }
            }
        }

        System.out.println("The smallest " + smallestWordNumber + "-st word is : " + smallestWord);
    }

}
