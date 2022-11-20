public class Quadrilatero {

    public static void area (double lado){
        System.out.println("Area do quadrado: " +lado*lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Area do triangulo: "+ lado1 *lado2);
    }

    public static void area(double basemaior, double basemenor, double altura){
        System.out.println("Area do trapézio: "+ ((basemaior+basemenor) *altura));
    }

    public static void area(float diagonal1, float diagonal2){
        System.out.println("Area do losango: "+(diagonal1*diagonal2)/2);
    }


}
