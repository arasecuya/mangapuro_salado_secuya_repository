
package calculator;

import java.util.Scanner;
public class Addition extends Calculator{
    Scanner input = new Scanner(System.in);
    
    @Override
    public void calculate(){
        System.out.println("Addition");
        System.out.println("Key in a number. ");
        int num1 = input.nextInt();
        System.out.println("Key in second number. ");
        int num2 = input.nextInt();
        int result = num1+num2;
        System.out.println("The sum of the two numbers is " + result + ".");
        
    }
}
