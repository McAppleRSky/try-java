package fm.shk;

import java.util.Scanner;

public class EnumStrWithScan {
// https://www.yandex.ru/search/?text=java+scanner+next+word&lr=146&clid=1836587
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text : ");
        scanner.next()

        String[] words = .split(" ");
        int atMin = 0;
        for (int i=0; i<words.length; i++) {
            if ( words[i].length() < words[atMin].length() ) {
                atMin=i;
            }
        }
        System.out.println("The smallest " + atMin+1 + "-st word is :" + words[atMin]);
    }

}
