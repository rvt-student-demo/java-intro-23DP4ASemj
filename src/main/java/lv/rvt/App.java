package lv.rvt;

    public class App{
        public class Main {
            public static void main(String[] args) {
            System.out.println("part: 1");
            printTriangle(4);

            System.out.println("part: 2");
            christmasTree(4);sss

            System.out.println("part: 3");
                printRectangle(17, 3);

            System.out.println("part: 4");
            printTriangle(4);

            }
    public static void printSquare(int size) {
    for (int i = 0; i < size; i++) {
        printStars(size);
}
    }   
    public static void printStars(int n) {
    for (int i = 0; i < n; i++) {
        System.out.print("*");
    }
    System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
    }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
}