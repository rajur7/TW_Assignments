import java.util.Scanner;

/**
 * Created by rajur on 5/18/16.
 */
public class DiamondWithName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberN = input.nextInt(), asterisk=1;
        for (int index = 0; index < numberN-1; index++) {
            for(int space=0; space<(numberN-index-1);space++){
                System.out.print(" ");
            }
            for (int innerIndex = 0; innerIndex < asterisk; innerIndex++) {
                System.out.print("*");
            }
            System.out.println();
            asterisk+=2;
        }
        System.out.println("Raju");
        asterisk-=2;
        for(int index=numberN-1;index>0;index--){
            for(int space=0; space<(numberN-index);space++){
                System.out.print(" ");
            }
            for (int innerIndex = 0; innerIndex < asterisk; innerIndex++) {
                System.out.print("*");
            }
            System.out.println();
            asterisk-=2;
        }
    }
}
