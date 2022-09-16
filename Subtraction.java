
package calculator;

import java.util.Scanner;
public class Subtraction extends Calculator{
    Scanner input = new Scanner(System.in);
    
    @Override
    public void calculate(){
        System.out.println("Subtraction");
        System.out.println("Key in a number. ");
        int num1 = input.nextInt();
        System.out.println("Key in second number. ");
        int num2 = input.nextInt();
        int result = num1-num2;
        System.out.println("The difference of the two numbers is " + result + ".");
    }
}
