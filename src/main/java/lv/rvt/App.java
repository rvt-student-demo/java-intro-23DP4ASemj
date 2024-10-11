package lv.rvt;

import java.util.*;

public class App
{
public static void main( String[] args )
{
    Scanner reader = new Scanner(System.in);

    System.out.print("Write numbers:  ");
    int sum = 0;
    int Numbers = 0;
    int average = 0;
    int odd = 0;
    int even = 0;
    while (true) {
        int input = Integer.valueOf(reader.nextLine());

        if (input == 0) {
            break;
        }
       else {
            Numbers++;
        }
        if (input % 2 == 0) {
            odd++;
        }
        else {
            even++;
        }
        
        average = sum/Numbers;
        sum += input;
        Numbers++;
    }
    System.out.println("Thx! Bye!");
    System.out.println("Sum: " + sum);
    System.out.println("Numbers: " + Numbers);
    System.out.println("Average: " + average);
    System.out.println("Even: " + even);
    System.out.println("Odd: " + odd);


} 
}