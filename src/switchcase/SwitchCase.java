package switchcase;

public class SwitchCase {
    public static void main(String[] args) {

        char x = 'a';

        switch (x) {
            case 'a': {
                System.out.println("esta es la opcion 0");
                break;
            }
            case 'b': {
                System.out.println("esta es la opcion 1");
                break;

            }
            default: {
                System.out.println("esta opcion es la opcion por defecto");
            }

        }
    }}