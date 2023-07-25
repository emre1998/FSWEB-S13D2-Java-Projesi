public class palindrom {
        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        }

        public static void main(String[] args) {
            int number1 = -1221;
            int number2 = 707;
            int number3 = 11212;

            System.out.println("isPalindrome(-1221): " + isPalindrome(number1));
            System.out.println("isPalindrome(707): " + isPalindrome(number2));
            System.out.println("isPalindrome(11212): " + isPalindrome(number3));
        }
    }

