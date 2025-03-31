package Semester1.Lesson11;

public class Fun {
    public static final String RESET = "\u001B[0m";  // Reset color
    public static final String RED = "\u001B[31m";   // Red color
    public static final String GREEN = "\u001B[32m"; // Green color
    public static final String BLUE = "\u001B[34m";  // Blue color

    public static void main(String[] args) {
        System.out.println(RED + "This is red text" + RESET);
        System.out.println(GREEN + "This is green text" + RESET);
        System.out.println(BLUE + "This is blue text" + RESET);
    }
}
