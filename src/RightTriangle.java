/**
 * Created by rajur on 5/18/16.
 */
import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int numberN=input.nextInt();
        for(int index=1;index<=numberN;index++){
            for(int innerIndex=0;innerIndex<index;innerIndex++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
