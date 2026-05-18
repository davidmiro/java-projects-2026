package david.dev;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String word = "J@va the be$t!123";

        Stack<Character> letter = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                letter.push(word.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                sb.append(letter.pop());
            } else {
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}