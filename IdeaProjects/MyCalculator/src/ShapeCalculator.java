/**
 * Created by MałaMi on 2016-12-18.
 */
public class ShapeCalculator {
    void squareArea(double a){
        double result = Math.sqrt(a);
        System.out.println("Square area: " + result);
    }
    void circleArea(double r){
        double result = Math.PI*(Math.sqrt(r));
        System.out.println("Circle area: " + result);
    }
    void triangleCircuit(double a, double b, double c){
        double result = a + b + c;
        System.out.println("Triangle circuit: " + result);
    }
    void rectangleCircuit(double a, double b){
        double result = (2*a)+(2*b);
        System.out.println("Rectangle circuit: " + result);
    }
}
