package ecuacion;

public class Cuadratica {
    public static void main (String []args){
        double a= 1;
        double b= 1;
        double c= 2;

        double x1;
        double x2;

        if (Math.pow(b, 2) - (4* a * c)> 0){
            x1= (-b + Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
            x2= (-b - Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
            System.out.println("Tiene dos soluciones x1: " + x1 + " y x2: " + x2);
        }else if (Math.pow(b, 2) - (4* a * c) ==0) {
            x1= (-b + Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
            x2= (-b - Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
            System.out.println("La solucion es real x1: " + x1 + " y x2: " + x2);
        }
    }
}
