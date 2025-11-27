package Arrays_And_Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String newString = s.trim();
        int count = 0;

        for (int i = newString.length() - 1; i >= 0; i--) {
            if (newString.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
