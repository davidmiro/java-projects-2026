package david.dev;

public class LetterReverser {
    
    public String reverseLetters(String word){

        char[] letters = word.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            if (!Character.isLetter(letters[left])) {
                left++;
            } else if (!Character.isLetter(letters[right])) {
                right--;
            } else {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }
        }
        return new String(letters);
    }
}
