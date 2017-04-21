import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        System.out.println("Hello World 2!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number between 1 and 5: ");
        int input = scan.nextInt();

        switch (input) {
            case 1:
            case 2:
            case 3:
                System.out.println("low number");
                break;
            case 4:
                System.out.println(input);
                break;
            case 5:
                System.out.println("you win");
                break;
            default:
                System.out.println("try again");
        }
    }
}
