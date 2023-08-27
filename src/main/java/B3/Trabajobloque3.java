package B3;

public class Trabajobloque3 {

        public static void main(String[] args) {
            boolean primo;
            System.out.println("Son números primos del 1 al 100:\n");
            // Estructura for
            for (int num = 2; num <= 100; num++) {
                primo = true;
                for (int i = num - 1; i > 1; i--) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println(num + " es primo");
                }
            }


        }
}