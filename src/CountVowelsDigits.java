import java.util.Scanner;
public class CountVowelsDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        int vowels = 0;
        int digits = 0;
        for (int charIdx = 0 ; charIdx < inStr.length(); charIdx++){
            char outStr = inStr.charAt(charIdx);
            inStr = inStr.toLowerCase();
            if (outStr == 'a' || outStr == 'e' || outStr == 'i' || outStr == 'o' || outStr == 'u'){
                vowels ++;
            }
            if (outStr >= '0' && outStr <= '9'){
                digits++;
            }
        }
        double perVowel = (double)vowels / inStr.length() * 100;
        double perDigit =(double) digits / inStr.length() * 100;
        System.out.print("Number of vowels: " + vowels + " ");
        System.out.printf("(%.2f%%)%n",perVowel);
        System.out.print("Number of digits: " + digits + " ");
        System.out.printf("(%.2f%%)",perDigit);

    }
}
