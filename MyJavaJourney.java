/**
 * This is the beginning of your Java journey!
 *
 * This file is a simple Java program that you can compile and run from the command line.
 * It demonstrates some of the basic concepts of the Java programming language.
 */
public class MyJavaJourney {

    /**
     * The main method is the entry point of any Java application.
     * When you run this program, the code inside this method will be executed.
     *
     * @param args These are the command-line arguments. We are not using them in this program.
     */
    public static void main(String[] args) {
        // This is a single-line comment. The compiler will ignore it.

        /*
         * This is a multi-line comment.
         * It can span across multiple lines.
         */

        // Let's print a message to the console.
        System.out.println("Hello, World! Welcome to my Java Journey.");

        // --- Variables and Data Types ---
        // A variable is a container for storing data values.
        // In Java, there are different types of variables, for example:
        String name = "Java Learner"; // Stores text
        int age = 1; // Stores integers (whole numbers)
        double score = 99.9; // Stores floating-point numbers
        boolean isLearning = true; // Stores true or false values

        // You can print the values of these variables to the console.
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My score is: " + score);
        System.out.println("Am I learning? " + isLearning);

        // --- Methods ---
        // A method is a block of code which only runs when it is called.
        // You can pass data, known as parameters, into a method.
        // Let's call a method that we have defined below.
        int sum = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);

        // Let's call another method.
        sayHello("Alice");
    }

    /**
     * A simple method that takes two integers and returns their sum.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * A simple method that prints a greeting to the console.
     * This method does not return any value, so its return type is `void`.
     *
     * @param name The name to greet.
     */
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
