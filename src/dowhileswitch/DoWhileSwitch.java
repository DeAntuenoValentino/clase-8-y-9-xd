package dowhileswitch;
import java.util.Scanner;
public class DoWhileSwitch {
    public static void main(String []args){
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1. numeros del 1 al 5");
            System.out.println("introduce una opcion: ");

            opcion = teclado.nextInt();
        } while (opcion > 2);
        switch (opcion){
            case 1:
                int contador =0;
                int num = 5;

                while (contador <= num){
                    System.out.println ("bucle while numero:[" + contador + "]");

                    contador = contador + 1;

                }
                break;
            default:

                System.out.println (" elige una opcion correcta.");
        }

    }
}
