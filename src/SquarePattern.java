import  java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int row = 1; row <= size; row++){
            System.out.println();
            for (int col = 1; col <= size; col++){
                System.out.print("# ");
            }
        }
        System.out.println();
    }

}