package desafios;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long number) {
        long largestFactor = 1;

        // Divide by 2 as long as number is even
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Divide by odd numbers starting from 3
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it is a prime factor
        if (number > 2) {
            largestFactor = number;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrime = largestPrimeFactor(number);
        System.out.println("O maior número primo do número " + number + " é: " + largestPrime);
    }
}