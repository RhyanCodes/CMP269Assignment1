import java.util.Scanner;

class App {
    public int divide(int a, int b) throws RuntimeException {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
            return result;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Please don't divide by zero!");
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) { 
            int divisor = Integer.parseInt(scanner.nextLine());
            App app = new App();
            app.divide(10, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}
