import java.util.Scanner;
public class BoxPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BoxPattern print = new BoxPattern();
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("(a)");
        print.PatternA(size);
        System.out.println("(b)");
        print.PatternB(size);
        System.out.println("(c)");
        print.PatternC(size);
        System.out.println("(d)");
        print.PatternD(size);
    }

    public void PatternA (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || col == 1 || row == size || col == size){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatternB (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row == col || row == size ){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatternC (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row + col == size + 1|| row == size ){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatternD (int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row + col == size + 1|| row == size || row == col){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
