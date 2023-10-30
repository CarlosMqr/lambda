package org.cmendoza.lambda.aritmetica;

import java.util.function.BiFunction;

public class InterfaceFunctionalLambda {
    public static void main(String[] args) {

        aritmetica suma = (a,b) -> a+b;
        aritmetica resta = (a,b) -> a-b;
        aritmetica divicion = (a,b) -> a/b;
        aritmetica mul = (a,b) -> a*b;

       Calculadora calculadora = new Calculadora();
       System.out.println("La suma es: " + calculadora.FuncionLambdaCalculadora(5,5,suma));

        System.out.println("La resta es: " + calculadora.FuncionLambdaCalculadora(20,5,resta));
        System.out.println("La division es: " + calculadora.FuncionLambdaCalculadora(50,8,divicion));
        System.out.println("la multiplicación es: " + calculadora.FuncionLambdaCalculadora(5,5,mul));

        //System.out.println(calculadora.funcionLambdaBiFuncion(12,12,(a,b)-> a+b));

        BiFunction<Double,Double,Double> sumB = (a,b) ->{
            return a+b;
        };

        BiFunction<Double,Double,Double> restaB = (a,b) ->{
            return a-b;
        };

        BiFunction<Double,Double,Double> mulB = (a,b) ->{
            return a*b;
        };

        BiFunction<Double,Double,Double> divB = (a,b) ->{
            return a/b;
        };


        System.out.println("La suma con BiFunction es: " + calculadora.funcionLambdaBiFuncion(5,5,sumB));
        System.out.println("La resta con BiFunction es: " + calculadora.funcionLambdaBiFuncion(5,5,restaB));
        System.out.println("La multiplicación con BiFunction es: " + calculadora.funcionLambdaBiFuncion(5,5,mulB));
        System.out.println("La division  con BiFunction es: " + calculadora.funcionLambdaBiFuncion(5,5,divB));


















    }
}
