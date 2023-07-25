public class perfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number <= 0) {
            return false;
        }
        int sumOfDivisors = 0;

        for(int i=1;i<= number / 2;i++){
            if(number % i == 0) {
                sumOfDivisors +=i;
            }
         }
        return sumOfDivisors == number;
    }
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 28;
        int number3 = 5;
        int number4 = -1;

        System.out.println("isPerfectNumber(6): " + isPerfectNumber(number1));
        System.out.println("isPerfectNumber(28): " + isPerfectNumber(number2));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(number3));
        System.out.println("isPerfectNumber(-1): " + isPerfectNumber(number4));
    }
}
