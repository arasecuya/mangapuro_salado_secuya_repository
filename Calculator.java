
package calculator;

import java.util.Scanner;

public class Calculator {
    public void calculate(){
    }
    public static void main(String[] args) {
        
        
        int i=0;
        while (i==0){
            Scanner input = new Scanner(System.in);
            System.out.println("Choose an operator");
            System.out.println("[1] ADDITION");
            System.out.println("[2] SUBTRACTION");
            System.out.println("[3] MULTIPLICATION");
            System.out.println("[4] DIVISION");
            int operator = input.nextInt();
            
            if (operator == 1){
                Calculator add = new Addition();
                add.calculate();
            }
            
            else if (operator == 2){
                Calculator minus = new Subtraction();
                minus.calculate();
            }
            
            else if (operator == 3){
                Calculator multiply = new Multiplication();
                multiply.calculate();
            }
            
            else if (operator == 4){
                Calculator divide = new Division();
                divide.calculate();
            } 
        break;
        
        }
    }
}
