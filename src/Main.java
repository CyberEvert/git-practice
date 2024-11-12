import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello people!");
        String text = "New car";
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");

        int number = 9;
        System.out.println(number);
    }
}