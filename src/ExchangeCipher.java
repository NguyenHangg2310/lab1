import java.util.Scanner;
public class ExchangeCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        int inStrLength = inStr.length();
        for (int charIdx = 0; charIdx < inStrLength; charIdx++){
            char cipherTextChar = inStr.charAt(charIdx);
            if ('A' + 'Z' == 155){
                cipherTextChar = (char)((int)155 - inStr.charAt(charIdx));
            }
            System.out.print(cipherTextChar);
        }
    }
}
