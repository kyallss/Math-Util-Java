public class MathUtil {
    public static boolean isPrime(int n) {

        if (n<=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 0;
        for(int i=2; i<=n; i++) {
            fib = a+b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static int factorial(int n) {
        int fact=1;
        for (int i=2; i<=n; i++) {
            fact*=i;
        }
        return fact;
    }

    public boolean isPerfectNumber(int n) {
        if (n<=1) {
            return false;
        }
        int sum = 0;
        for (int i=1; i<=n/2; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        return sum==n;
    }
    public int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n%10;
            n /= 10;
        }
        return reversed;
    }

    public boolean isArmstrongNumber(int n) {
        int sum = 0, or = n, digits = 0;
        while (n!=0) {
            n/=10;
            digits ++;
        }
        n=or;
        while (n!=0) {
            int digit = n%10;
            sum+=Math.pow(digit, digit);
            n/=10;
        }
        return sum == or;
    }

    public int nextPrime(int n) {
        int next = n+1;
        while(!isPrime(next)) {
            next++;
        }
        return next;
    }
}
