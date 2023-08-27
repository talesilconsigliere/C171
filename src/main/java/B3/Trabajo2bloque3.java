package B3;

public class Trabajo2bloque3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int auxiliar;
        int limite = 20;

        System.out.println(num1);
        System.out.println(num2);

        while (num1 + num1 <= limite) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar+ num1;

            System.out.println(num2);
        }
    }
}

