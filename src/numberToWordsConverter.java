public class numberToWordsConverter {
    public static  String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }
        String[] singleDigits = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        StringBuilder words = new StringBuilder();
        int digit;

        while (number > 0) {
            digit = number % 10;
            words.insert(0, singleDigits[digit] + " ");
            number /= 10;
        }
        return words.toString().trim();
    }

    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 1010;
        int number3 = 0;
        int number4 = -12;

        System.out.println("numberToWords(123): " + numberToWords(number1));
        System.out.println("numberToWords(1010): " + numberToWords(number2));
        System.out.println("numberToWords(0): " + numberToWords(number3));
        System.out.println("numberToWords(-12): " + numberToWords(number4));
    }
}
