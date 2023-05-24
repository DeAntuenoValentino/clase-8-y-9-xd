package forinterator;

public class ForInterator {
    public static void main(String[] args) {

        int contador;
        int suma = 0;

        for (contador = 0; contador <= 5; contador++){

            System.out.println("contador:[" + contador + "]");

            suma = suma + contador;
        }

        System.out.println ("la suma del acumulador es:" + suma);
    }
}
