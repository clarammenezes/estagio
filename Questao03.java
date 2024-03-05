public class Questao03 {
    public static void main(String[] args) {
        System.out.println("Sequência a):");
        completaSequenciaA();

        System.out.println("\nSequência b):");
        completaSequenciaB();

        System.out.println("\nSequência c):");
        completaSequenciaC();

        System.out.println("\nSequência d):");
        completaSequenciaD();

        System.out.println("\nSequência e):");
        completaSequenciaE();

        System.out.println("\nSequência f):");
        completaSequenciaF();
    }

    // Sequência a) 1, 3, 5, 7, ___
    public static void completaSequenciaA() {
        int ultimoElemento = 7;
        int proximoElemento = ultimoElemento + 2;
        System.out.println(proximoElemento);
    }

    // Sequência b) 2, 4, 8, 16, 32, 64, ____
    public static void completaSequenciaB() {
        int ultimoElemento = 64;
        int proximoElemento = ultimoElemento * 2;
        System.out.println(proximoElemento);
    }

    // Sequência c) 0, 1, 4, 9, 16, 25, 36, ____
    public static void completaSequenciaC() {
        int ultimoElemento = 36;
        int proximoElemento = ultimoElemento + 11;
        System.out.println(proximoElemento);
    }

    // Sequência d) 4, 16, 36, 64, ____
    public static void completaSequenciaD() {
        int ultimoElemento = 64;
        int proximoElemento = ultimoElemento + 28;
        System.out.println(proximoElemento);
    }

    // Sequência e) 1, 1, 2, 3, 5, 8, ____
    public static void completaSequenciaE() {
        int ultimoElemento = 8;
        int penultimoElemento = 5;
        int proximoElemento = ultimoElemento + penultimoElemento;
        System.out.println(proximoElemento);
    }

    // Sequência f) 2,10, 12, 16, 17, 18, 19, ____
    public static void completaSequenciaF() {
        int ultimoElemento = 19;
        int proximoElemento = ultimoElemento + 1;
        System.out.println(proximoElemento);
    }
}
