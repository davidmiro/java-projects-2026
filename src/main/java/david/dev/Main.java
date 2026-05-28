package david.dev;

public class Main {
    public static void main(String[] args) {
        LetterReverser reverser = new LetterReverser();
        String word = "J@va the be$t!123";
        String result = reverser.reverseLetters(word);

        System.out.println(result);
    }
}
