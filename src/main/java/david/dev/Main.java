package david.dev;



public class Main {
    public static void main(String[] args) {
        String word = "J@va the be$t!123";

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

        System.out.println(new String(letters));
    }
}