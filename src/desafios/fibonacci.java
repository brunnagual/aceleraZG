package desafios;

public class fibonacci {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;

        int prevTerm = 1;
        int currentTerm = 2;

        while (currentTerm <= limit) {
            if (currentTerm % 2 == 0) {
                sum += currentTerm;
            }

            int nextTerm = prevTerm + currentTerm;
            prevTerm = currentTerm;
            currentTerm = nextTerm;
        }

        System.out.println("A Soma dos termos de valor par na sequência de Fibonacci: " + sum);
    }
}