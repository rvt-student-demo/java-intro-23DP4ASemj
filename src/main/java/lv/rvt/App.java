package lv.rvt;

import java.util.*;

public class App
{
public static void main( String[] args )
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give a number: ");

    
        for ( int Num = Integer.valueOf(scanner.nextLine()); Num < 101; Num++) {
            System.out.println(Num);
        }
    }
}
