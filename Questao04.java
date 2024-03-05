public class Questao04 {
    public static void main(String[] args) {
        boolean[] interruptores = {false, false, false};
        boolean[] lampadas = {false, false, false};

        ligarInterruptor(0, interruptores, lampadas);

        ligarInterruptor(1, interruptores, lampadas);

        for (int i = 0; i < 3; i++) {
            System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + ": " + interruptores[i]);
        }
    }

    public static void ligarInterruptor(int index, boolean[] interruptores, boolean[] lampadas) {
        interruptores[index] = !interruptores[index];

        for (int i = 0; i < 3; i++) {
            if (interruptores[i]) {
                lampadas[i] = !lampadas[i];
            }
        }
    }
}
