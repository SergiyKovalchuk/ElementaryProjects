package Habibulyn.Glava1;

/**
 * Created by Hi-Tech on 18.04.2017.
 */
public enum Operation{
    PLUS{double eval(double x, double y){return  x + y;}},
    MINUS{double eval(double x, double y){return  x - y;}},
    TIMES{double eval(double x, double y){return  x * y;}},
    DIVIDE{double eval(double x, double y){return  x / y;}};

    abstract double eval (double x, double y);

    public static void main(String[] args) {
        double x = - 23.56, y = 0.235;
        for(Operation oper: Operation.values())
            System.out.println(oper.eval(x,y));
    }
}

