import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by rajur on 5/18/16.
 */

public class PrimeFactors {
    public static void main(String[] args){
        ArrayList<Integer> PrimeFactorArray=new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        int numberN=input.nextInt();
        PrimeFactorArray=generate(numberN);
        Collections.sort(PrimeFactorArray);
        System.out.println(PrimeFactorArray);

    }
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> PrimeFactorArray=new ArrayList<Integer>();
        for(int factorcheck=2;factorcheck<=Math.round(Math.sqrt(n));factorcheck++){
            int divisor1,divisor2;
            if(n%factorcheck==0){
                divisor1=factorcheck;
                divisor2=n/factorcheck;
                if(divisor1==2)
                    PrimeFactorArray.add(divisor1);
                else{
                    if(divisor1%2==1)
                    {
                        boolean prime=false;
                        for(long index1=2;index1<=Math.round(Math.sqrt(divisor1));index1++)
                        {
                            if(divisor1%index1==0){
                                prime=false;
                                break;
                            }
                            else
                                prime=true;
                        }
                        if(prime)
                            PrimeFactorArray.add(divisor1);
                    }
                }
                if(divisor2%2==1){
                    boolean prime=false;
                    for(long index2=2;index2<=Math.round(Math.sqrt(divisor2));index2++)
                    {
                        if(divisor2%index2==0){
                            prime=false;
                            break;
                        }
                        else
                            prime=true;
                    }
                    if(prime) {
                        PrimeFactorArray.add(divisor2);
                    }
                }
            }
        }
        return PrimeFactorArray;
    }
}
