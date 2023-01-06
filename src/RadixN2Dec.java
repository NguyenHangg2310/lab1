import java.util.Scanner;
public class RadixN2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String inStr = sc.next();
        System.out.print("The equivalent decimal number " + inStr + " is: ");
        if (radix == 2){
            System.out.print(convert1(inStr));
        } else if (radix == 16) {
            System.out.print(convert2(inStr));
        }else if (radix == 8) {
            int num = Integer.parseInt(inStr);
            System.out.print(convert3(num));
        }
    }

    public static int convert1 (String bin) {
        int number = 0;
        for (int charIdx = 0; charIdx < bin.length(); charIdx++){
            if (bin.charAt(charIdx) == '0'){
                continue;
            }
            number += Math.pow(2, (bin.length() - 1 - charIdx));
        }
        return number;
    }

    public static int convert2 (String hex){
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
    public static int convert3 (int oct){
        int number = 0;
        int n = 0;
        while (true){
            if (oct == 0){
                break;
            }else {
                int temp = oct % 10;
                number += temp * Math.pow(8,n);
                oct = oct/10;
                n++;
            }
        }
        return number;
    }



}
