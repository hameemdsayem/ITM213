package hackerrank;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index;
        
        for(index = 1; index<= n; index++){
            System.out.println("The number is: " + index + " and the cube of " + index + " is: " + (index*index*index));
        }
    }
}
