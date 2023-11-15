import java.util.Scanner;

public class Dec2Hex {

    public static int Arg1;

    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Error: Please provide a decimal number.");
            return;
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Error: Not a valid integer.");
            return;
        }

        Arg1 = Integer.parseInt(args[0]);
        String hexadecimal = convertToHex(Arg1);
        System.out.println("The Decimal number is represented in the Hexadecimal form: " + hexadecimal);
    }

    public static String convertToHex(int num) {
    if (num == 0) {
        return "0";
    }

    char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String hexadecimal = "";

    while (num != 0) {
        int rem = num % 16;
        hexadecimal = ch[rem] + hexadecimal;
        num = num / 16;
    }

    return hexadecimal;
    }

}
