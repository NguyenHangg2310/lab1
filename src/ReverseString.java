import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr;
        int inStrLen;
        inStr = sc.next();
        inStrLen = inStr.length();
        String outStr = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--){
            outStr = outStr + inStr.charAt(charIdx);
        }
        System.out.println("The reserse of the String "  + inStr + " is " + outStr);
    }
}
