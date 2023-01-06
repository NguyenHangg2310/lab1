import java.util.Scanner;
public class Oct2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String inOct = sc.next();
        int num = Integer.parseInt(inOct);
        System.out.print("The equivalent decimal number " +num+ " is: " +convert(num));
    }
    public static int convert (int oct){
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

