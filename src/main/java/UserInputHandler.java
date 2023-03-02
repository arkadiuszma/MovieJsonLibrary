import java.util.Scanner;

public class UserInputHandler {
    protected static int getNumber() {
        return new Scanner(System.in).nextInt();
    }

    protected static String getText() {
        return new Scanner(System.in).nextLine();
    }
}
