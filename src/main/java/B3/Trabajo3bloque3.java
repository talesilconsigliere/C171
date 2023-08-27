package B3;

public class Trabajo3bloque3 {

    public static void main(String[] args) {
        boolean primo;
        System.out.println("Son números primos del 1 al 1000:\n");
        for (int num = 2; num <= 1000; num++) {
            primo = true;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    primo = false;
                    break;}
            }
            if (primo) {
                System.out.println(num + " es primo");
            }
        }
    }
}