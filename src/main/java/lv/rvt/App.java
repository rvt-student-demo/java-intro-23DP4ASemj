package lv.rvt;

import java.util.Scanner;

public class App{
        public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int birth = 0;
        String name = "";
            
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[0]);
            birth = birth + 1;
        }

        System.out.println("Longest name: " + name );

        if (birth > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / birth));
        } 
        else {
            System.out.println("No input.");
        }
            
        
    }
}
            
