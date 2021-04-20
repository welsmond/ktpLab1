public class Primes {
    public static void main(String[] args){
        for(int i=2; i <= 100; i++)
            if (isPrime(i))
                System.out.print(i + " ");
}
    /*Метод isPrime принимает число и проверяет являеется ли оно простым */
    public static boolean isPrime(int n){
        if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}

