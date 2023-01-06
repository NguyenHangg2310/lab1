import java.util.Scanner;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a hex string: ");
            String inStr = sc.next();
            if (test(inStr) == true){
                System.out.print(inStr+ " is a hex string");
            }
            else {
                System.out.print(inStr + " is NOT a hex string");
            }
            System.out.println();
        }
    }
    public static boolean test(String inStr){
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f'))) {
               return false;
            }
        }
        return true;
    }
}
