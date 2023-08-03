package desafios;

import org.jetbrains.annotations.Contract;

public class Mult3or5 {

    private static int limit;

    @Contract(pure = true)
        public static int somaDosMultiplos(int limit) {
        Mult3or5.limit = limit;
        int sum = 0;

            for (int i = 1; i < limit; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            int limit = 1000;
            int result = somaDosMultiplos(limit);
            System.out.println("A soma dos multiplos de 3 ou 5 abaixo " + limit + " são: " + result);
        }
}