import java.util.Scanner;
class r{


    public static int romanCharToInt(String romanChar) {
        if (romanChar == null || romanChar.length() != 1) {
            throw new IllegalArgumentException("Input must be a single Roman numeral character.");
        }

        int value;
        switch (romanChar.charAt(0)) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single Roman numeral character (I, V, X, L, C, D, M): ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        try {
            int number = romanCharToInt(romanNumeral);
            System.out.println("Roman numeral " + romanNumeral + " = " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
