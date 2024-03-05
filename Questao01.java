public class Questao01 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("A soma dos números de 1 até " + INDICE + " é: " + SOMA);
        // O resultado será a soma dos números de 1 até 13, que é 91.
    }
}
