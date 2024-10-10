package lv.rvt;

import java.util.*;

public class App
{
public static void main( String[] args )
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give a number: ");
    long fact = 1;
    
    int Num = Integer.valueOf(scanner.nextLine());
    for ( int i = 1; i <= Num; i++){
        fact *=i;
    }

        
         System.out.println(fact);
    }
}
