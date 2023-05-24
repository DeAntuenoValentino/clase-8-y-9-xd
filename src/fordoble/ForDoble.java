package fordoble;

public class ForDoble {
    public static void main(String[] args) {

        int respuesta;
        int FILA = 10;
        int COLUMNA = 10;

        for (int contador1 = 1; contador1 <= FILA; contador1++){
            for (int contador2 = 1; contador2 <= COLUMNA; contador2++){

                respuesta = contador1 * contador2;
                System.out.println (contador1 + " x " + contador2 + "=" + respuesta);
            }

            System.out.println("FIN!!!");
        }
    }
}
