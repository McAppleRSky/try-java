package fm.shk;

import java.util.*;

public class SortStr {

    public static void main(String[] args) {
        SortedMap<Integer, Integer> wordsLenPos = new TreeMap<>();
        String[] words = "Java is good very".split(" ");
        int i = 0;
        for (String str : words){
            wordsLenPos.put(str.length(), i++);
        }
        int minLen = wordsLenPos.firstKey();
        int minLenPos = wordsLenPos.get(minLen);
        System.out.println("The smallest " + minLenPos + "-st word is : " + words[minLenPos]);
    }

}
