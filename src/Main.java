public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //palindrome
        int number1 = -1221;
        int number2 = 707;
        int number3 = 11212;
        //perfectNumber
        int number4 = 6;
        int number5 = 28;
        int number6 = 5;
        int number7 = -1;
        //numberToWordsConverter
        int number8 = 123;
        int number9 = 1010;
        int number10 = 0;
        int number11 = -12;

        System.out.println("isPalindrome(-1221): " + palindrom.isPalindrome(number1));
        System.out.println("isPalindrome(707): " + palindrom.isPalindrome(number2));
        System.out.println("isPalindrome(11212): " + palindrom.isPalindrome(number3));

        System.out.println("isPerfectNumber(6): " + perfectNumber.isPerfectNumber(number4));
        System.out.println("isPerfectNumber(28): " + perfectNumber.isPerfectNumber(number5));
        System.out.println("isPerfectNumber(5): " + perfectNumber.isPerfectNumber(number6));
        System.out.println("isPerfectNumber(-1): " + perfectNumber.isPerfectNumber(number7));

        System.out.println("numberToWords(123): " + numberToWordsConverter.numberToWords(number8));
        System.out.println("numberToWords(1010): " + numberToWordsConverter.numberToWords(number9));
        System.out.println("numberToWords(0): " + numberToWordsConverter.numberToWords(number10));
        System.out.println("numberToWords(-12): " + numberToWordsConverter.numberToWords(number11));
    }
}