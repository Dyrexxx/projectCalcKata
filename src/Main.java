import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(calc((new Scanner(System.in)).nextLine()));
    }

    public static String calc(String input) throws Exception {
        String[] listValues = input.split(" ");
        if (listValues.length == 3) {
            Numbers numbers = isCorrectedValues(listValues);
            return numbers.calc();
        } else {
            throw new Exception("invalid");
        }
    }

    private static Numbers isCorrectedValues(String[] listValues) throws Exception {
        try {
            int a = Integer.parseInt(listValues[0]);
            int b = Integer.parseInt(listValues[2]);
            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new Exception("Не подходящие цифры");
            }
            return new Arabic(listValues);
        } catch (NumberFormatException e) {
            if (isRomanNumbers(listValues[0]) && isRomanNumbers(listValues[2])) {
                return new Roman(listValues);
            }
            throw new Exception("Error");
        }
    }

    private static boolean isRomanNumbers(String number) {
        RomanNumbersEnum[] list = RomanNumbersEnum.values();
        for (RomanNumbersEnum value : list) {
            if (value.name().equals(number)) {
                return true;
            }
        }
        return false;
    }
}