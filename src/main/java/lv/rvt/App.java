package lv.rvt;

import java.util.*;

public class App{
        public static void main(String[] args) throws Exception{ 

            Scanner scanner = new Scanner(System.in);
            List<Integer> intList = new ArrayList<>();
            
            System.out.println("Enter integers (press Enter without a value to stop):");
            while (scanner.hasNextInt()) {
            intList.add(scanner.nextInt());
            }
            scanner.close(); 
            
            System.out.println("\nOriginal List:");
            printTable(intList);
            
            intList.sort(Comparator.naturalOrder());
            System.out.println("\nAugošā secībā:");
            printTable(intList);

            intList.sort(Comparator.reverseOrder());
            System.out.println("\nDilstošā secībā:");
            printTable(intList);
            }
            
            private static void printTable(List<Integer> list) {
            System.out.println("====================");
            System.out.printf("| %-6s | %-6s |\n", "Index", "Value");
            System.out.println("====================");
            for (int i = 0; i < list.size(); i++) {
            System.out.printf("| %-6d | %-6d |\n", i, list.get(i));
            }
            System.out.println("====================");
            }
    }



