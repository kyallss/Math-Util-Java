public class Main {
    public static void main(String[] args) {

        MathUtil util = new MathUtil();

        System.out.println("Is prime 13: " + MathUtil.isPrime(13));
        System.out.println("Is prime 2: " + MathUtil.isPrime(2));
        System.out.println("Is prime 44: "+ MathUtil.isPrime(44));

        System.out.println("Greatest common divisor of 12 and 21: " + MathUtil.gcd(12, 21));
        System.out.println("GCD of 18 and 8: "+ MathUtil.gcd(18, 8));
        System.out.println("GCD of 10 and 11:  " + MathUtil.gcd(10, 11));

        System.out.println("LCM of 2 and 3: " + MathUtil.lcm(2,3));
        System.out.println("LCM of 6 and 8: " + MathUtil.lcm(6, 8));
        System.out.println("LCM of 4 and 2: " + MathUtil.lcm(4, 2));

        System.out.println("Fibonacci of 8: " + MathUtil.fibonacci(8));
        System.out.println( "Fibonacci of 1: " + MathUtil.fibonacci(1));
        System.out.println("Fibonacci of 12: " + MathUtil.fibonacci(12));

        System.out.println("Factorial of 15: " + MathUtil.factorial(15));
        System.out.println("Factorial of 20: " + MathUtil.factorial(20));
        System.out.println("Factorial of 4: " + MathUtil.factorial(4));

        System.out.println("Is perfect number 5: " + util.isPerfectNumber(5));
        System.out.println("Is perfect number 47: " + util.isPerfectNumber(47));
        System.out.println( "Is perfect number 10: " + util.isPerfectNumber(10));

        System.out.println("Sum of digits of 126: " + util.sumOfDigits(126));
        System.out.println("Sum of digits of 321: " + util.sumOfDigits(321));
        System.out.println("Sum of digits 194: " + util.sumOfDigits(194));

        System.out.println("Reverse number of 678: " + util.reverseNumber(678));
        System.out.println("Reverse number of 321: " + util.reverseNumber(321));
        System.out.println("Reverse number of 567: " + util.reverseNumber(567));

        System.out.println("Is Armstrong number 378: " + util.isArmstrongNumber(378));
        System.out.println("Is Armstrong number 345: " + util.isArmstrongNumber(345));
        System.out.println("Is Armstrong number 123: " + util.isArmstrongNumber(123));

        System.out.println("Next prime 19: " + util.nextPrime(19));
        System.out.println("Next prime 45: " + util.nextPrime(45));
        System.out.println("Next prime 28: " + util.nextPrime(28));

    }
}
