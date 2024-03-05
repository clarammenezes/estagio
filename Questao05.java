public class Questao05 {
    public static void main(String[] args) {
        String texto = "hello world";
        String invertida = inverteString(texto);
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + invertida);
    }
    public static String inverteString(String texto) {
        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        return new String(caracteres);
    }
}
