package hackerrank;
import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b;
        int operator;
        
        System.out.println("Please enter 1st number: ");
        a = input.nextDouble();
        System.out.println("Please enter 2nd number");
        b = input.nextDouble();
        
        System.out.println("Please enter number for following operation: 1. Plus; 2. Minus; 3. Division; 4. Multiplication");
        operator = input.nextInt();
        
        switch (operator){
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " / " + b + " = " + (a%b));
                break;
            case 4:
                System.out.println(a + " x " + b + " = " + (a*b));
                break;
        }
}
}
