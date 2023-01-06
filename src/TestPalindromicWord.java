import java.util.Scanner;
public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a palindrome string: ");
        String inStr = sc.next();
        int strLen = inStr.length();
        if (test(inStr)){
            System.out.print(inStr + " is a palindrome");
        }else {
            System.out.print(inStr + " is not a palindrome");
        }
    }
        public static boolean test (String inStr){
            int strLen = inStr.length();
            for (int fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; fIdx++, bIdx--){
                if (inStr.charAt(fIdx) == inStr.charAt(bIdx)){
                    return true;
                }
            }
            return false;
        }



}
