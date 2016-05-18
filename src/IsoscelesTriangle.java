import java.util.Scanner;

/**
 * Created by rajur on 5/18/16.
 */
public class IsoscelesTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberN = input.nextInt(), lineNumber = 1;
        for (int index = 0; index < numberN; index++) {
            for(int space=0; space<(numberN-index-1);space++){
                System.out.print(" ");
            }
            for (int innerIndex = 0; innerIndex < index + lineNumber; innerIndex++) {
                System.out.print("*");
            }
            System.out.println();
            lineNumber++;
        }
    }
}
