package fm.shk;

public class EnumStr {

    public static void main(String[] args) {
        String[] words = "Java is good".split(" ");
        int atMin = 0;
        for (int i=0; i<words.length; i++) {
            if ( words[i].length() < words[atMin].length() ) {
                atMin=i;
            }
        }
        System.out.println("The smallest " + atMin+1 + "-st word is :" + words[atMin]);
    }

}
