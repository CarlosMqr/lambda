package org.cmendoza.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double FuncionLambdaCalculadora(double z , double x , aritmetica lambda){
        return lambda.operacion(z,x);
    }

    public double funcionLambdaBiFuncion(double a, double b, BiFunction<Double,Double,Double> lambda){
        return lambda.apply(a,b);
    }


}
