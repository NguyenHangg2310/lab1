import java.util.Scanner;
public class Bin2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        while (true) {
            String inBin = sc.next();
            if (test(inBin) == false) {
                System.out.print("error: invalid binary string " + inBin);
            } else {
                int number = convert(inBin);
                System.out.print("The equivalent decimal number for binary " + inBin + " is: " + number);
            }
            System.out.println();
        }
    }
    public static boolean test (String bin){
        for (int charIdx = 0; charIdx < bin.length(); charIdx++){
            char charBin = bin.charAt(charIdx);
            if (charBin != '0' && charBin != '1'){
                return false;
            }
        }
        return true;
    }
    public static int convert (String bin) {
        int number = 0;
        for (int charIdx = 0; charIdx < bin.length(); charIdx++){
            if (bin.charAt(charIdx) == '0'){
                continue;
            }
            number += Math.pow(2, (bin.length() - 1 - charIdx));
        }
        return number;
    }
}
