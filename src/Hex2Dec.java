import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Hexadecimal string: ");
            String inHex = sc.next();
            if (test(inHex)) {
                int number = convert(inHex);
                System.out.println("The equivalent decimal number for hexadecimal: " + inHex + " is: " + number);
            } else {
                System.out.println("error: invalid hexadecimal string " + inHex);
            }
            System.out.println();
        }
    }
    public static boolean test (String hex){
        for (int charIdx = 0; charIdx < hex.length(); charIdx++){
            char charHex = hex.charAt(charIdx);
            if ((charHex >= '0' && charHex <=10) || (charHex >= 'A' && charHex <= 'F') || (charHex >= 'a' && charHex <= 'f')){
                return true;
            }
        }
        return false;
    }
    public static int convert (String hex){
        int number = 0;
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        for (int charIdx = 0; charIdx < hex.length(); charIdx++){
            char charHex = hex.charAt(charIdx);
            int d = digits.indexOf(charHex);
            number = 16*number +d;

            }
        return number;
    }
}
