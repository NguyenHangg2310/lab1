import java.util.Scanner;
import java.util.regex.Pattern;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("(a)");
        TriangularPattern print = new TriangularPattern();
        print.PatternA(size);
        System.out.println("(b)");
        print.PatterB(size);
        System.out.println("(c)");
        print.PatterC(size);
        System.out.println("(d)");
        print.PatterD(size);
    }
    public void PatternA (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row >= col) {
                    System.out.print("# ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void PatterB (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row + col <= size +1 ) {
                    System.out.print("# ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void PatterC (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row <= col ) {
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatterD (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row + col >= size +1 ) {
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
