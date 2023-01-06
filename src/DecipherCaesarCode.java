import java.util.Scanner;
public class DecipherCaesarCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = sc.next().toUpperCase();
        int strLength = inStr.length();
        System.out.print("The plaintext string is: ");
        for (int charIdx = 0; charIdx < strLength; charIdx++){
            char outStr = inStr.charAt(charIdx);
            if (outStr >= 44) {
                outStr = (char) ((int) outStr - 3);
            }else if (outStr == 41){
                outStr = 88;
            }else if (outStr == 42){
                outStr = 89;
            } else if (outStr == 43) {
                outStr = 90;
            }
            System.out.print(outStr);
        }
    }
}
