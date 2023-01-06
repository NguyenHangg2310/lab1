import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a palindrome string: ");
        String inStr = sc.nextLine();
        int strLen = inStr.length();
        if (test(inStr)){
            System.out.print(inStr + " is a palindrome phrase");
        }else {
            System.out.print(inStr + " is not a palindrome pharse");
        }

    }
    public static String sanitizeString(String inStr){
        String outStr ="";
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++){
            switch (inStr.charAt(charIdx)){
                case '.':
                case ',':
                case '-':
                case '\'':
                case '!':
                case '?':
                    break;
                default: outStr += inStr.charAt(charIdx);
            }
        }
        return outStr;
    }
    public static boolean test (String inStr){
        inStr = sanitizeString(inStr);
        int strLen = inStr.length();
        for (int fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; fIdx++, bIdx--){
            if (inStr.charAt(fIdx) == inStr.charAt(bIdx)){
                return true;
            }
        }
        return false;
    }
}
