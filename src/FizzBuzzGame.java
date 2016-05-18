/**
 * Created by rajur on 5/18/16.
 */

public class FizzBuzzGame {
    public static void main(String[] args){
        FizzBuzz();
    }
    public static void FizzBuzz(){
        for(short number=1;number<=100;number++){
            if(number%3==0 && number%5==0)
                System.out.println("FizzBuzz");
            else if(number%3==0)
                System.out.println("Fizz");
            else if(number%5==0)
                System.out.println("Buzz");
            else
                System.out.println(number);
        }
    }
}
