package org.cmendoza.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {

        //el primer argumento es del tipo que recibe
        //el segundo argumento el del tipo que devuelve
        Function<String,String> funcion = param ->{
          return "Hola que tal " + param;
        };
        String resultado = funcion.apply("Carlos");//recibe un String la variable param
                                                    //el return devuelve un String; es el segundo parámetro de la función
        System.out.println(resultado);

        Function<String,String> funcionB = param-> "Hola qte tal " + param + " función simplificada";
        System.out.println(funcionB.apply("Carlos"));

        /*
        se puede usar en las clases en un método que reciba una expresión lambda
        también en apis
         */


        Function<String,String> funcion2 = param ->{
          return  param.toUpperCase();
        };
        System.out.println(funcion2.apply("jazmin"));

        //simplificada
        Function<String,String> funcio2B = param -> param.toUpperCase();
        System.out.println(funcio2B.apply("jazmin") + " función simplificada");

        /*Function<String,String> a1 = String::toUpperCase;
        System.out.println(a1.apply("jazmin").concat(" función simplificada"));*/



        //primer argumento del tipo String
        //segundo argumento del tipo String
        //uno y dos es lo que recibe
        //tercer argumento es del tipo que retorna el return
        BiFunction<String,String,String> funcion3  = (a,b)->{

          return a.toUpperCase().concat(b.toUpperCase());
        };
        System.out.println(funcion3.apply("Te quiero ","jazmin"));

        //simplificada

        BiFunction<String,String,String> f = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f.apply("te quiero ","jazmin").concat(" FUNCIÓN SIMPLIFICADA"));


        //función que compara dos String y verifica sí sion iguales
        BiFunction<String,String,Integer> funcion4 = (a,b) -> a.compareTo(b);
        System.out.println(funcion4.apply("carlos","carlos"));

        BiFunction<String,String,Integer> funcion4B = String::compareTo;
        System.out.println(funcion4B.apply("jazmin","jazmin") + " función simplificada String::compareTo");






















    }
}
