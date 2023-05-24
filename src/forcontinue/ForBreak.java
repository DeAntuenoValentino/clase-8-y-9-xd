package forcontinue;

public class ForBreak {
    public static void main(String[] args) {

        for (int contador = 1; contador <= 10; contador++){
            System.out.println("el valor de contador es: " + contador);
            if (contador == 5){
                continue;
            }
            System.out.println("el valor de contador es :" + contador);
        }
    }
}
