package day06string_manipulations_loops;

public class C05StringManipulations {
    public static void main(String[] args) {
        //Example 6: Type a code to find the number of punctuation marks used in a String.
        //           "Wooow!... Toms is 13, and he is in university...????"
        String s = "Wooow!... Toms is 13, and he is in university.";

        int numOfPuncts = s.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(numOfPuncts);

        //Example 7: Type a code to find the number of words used in a String
        //           "Learn Java, earn huge amount of money." ==> 7

        String t = "Learn Java, earn huge amount of money.";

        //1.Way: The number of words will be 1 more than the number of spaces
        int numOfSpaceChars = t.replaceAll("[^ ]", "").length();
        System.out.println("Total number of words: " + (numOfSpaceChars + 1));

        //2.Way: Use split() method by space then count the words
        int numOfWords = t.split(" ").length;
        System.out.println(numOfWords);

        //Example 8: Type a code to find the number of letters used in a String
        //           "Learn Java, earn huge amount of money." ==> 30

        int numOfLetters = t.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);
    }
}
