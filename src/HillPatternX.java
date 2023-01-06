import java.util.Scanner;
public class HillPatternX {
    public static void main(String[] args){
        HillPatternX print = new HillPatternX();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("(a)");
        print.PatternA(rows);
        System.out.println("(b)");
        print.PatternB(rows);
        System.out.println("(c)");
        print.PatternC(rows);
        System.out.println("(d)");
        print.PatternD(rows);

    }
    public void PatternA (int rows){
        for (int row = 1; row <= rows; row++){
            for (int col = 1; col <= 2*rows - 1; col++){
                if ((row + col >= rows + 1) && (row >= col - rows +1) ){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatternB (int rows){
        for (int row = 1; row <= rows; row++){
            for (int col = 1 ; col <= 2*rows - 1; col++){
                if ((row + col <= 2*rows) && (row <=col)  ){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void PatternC (int rows){
        for (int row = 1; row <= 2*rows - 1; row++){
            for (int col = 1; col <= 2*rows - 1; col++){
                if (row <= rows) {
                    if ((row + col >= rows + 1) && (row >= col - rows + 1)){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                } else {
                    if ((row + col <= 3*rows -1)  && (row <= col + rows -1)   ){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void PatternD (int rows) {
        for (int row = 1; row <= 2*rows - 1; row++){
            for (int col = 1; col <= 2*rows -1; col++){
                if (row == 1 || row == 2*rows -1){
                    System.out.print("# ");
                }else {
                    if (row >=2 && row <=rows){
                        if ((row + col >= rows + 2) && (row >= col - rows +2)){
                            System.out.print("  ");
                        }
                        else {
                            System.out.print("# ");
                        }
                    }else {
                        if ((row + col <= 3*rows -1-1)  && (row <= col + rows -1-1)   ){
                            System.out.print("  ");
                        }else {
                            System.out.print("# ");
                        }

                    }
                }
            }
            System.out.println();
        }
    }

}
