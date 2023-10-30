package org.cmendoza.lambda;

import org.cmendoza.lambda.model.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {

        //retorna un boolean
        //verifica sí num es mayor a 10
        System.out.println("==============Verifica si num es mayor que 10 con un argumento====================");
        Predicate<Integer> test = num -> {
            return num > 10;
        };
       // boolean resultado = test.test(5);
        System.out.println("num > 10 " +  test.test(20));


        //compara si los dos String son iguales
        System.out.println("==============Compara dos String con un argumento====================");
        Predicate<String> test2 = rol ->{
          return rol.equals("ROLE_ADMIN");
        };
        System.out.println(test2.test("ROLE_USER"));



       //compara si los dos String son iguales
        System.out.println("==============Compara dos String====================");
        BiPredicate<String, String> test3 = (a,b)->{
          return a.equals(b);
        };
        System.out.println(test3.test("Jazmin","Jazmin"));
        //simplificada

        System.out.println("==============Compara dos String====================");
        BiPredicate<String,String> test3B = String::equals;
        System.out.println(test3B.test("hola","Hola"));


        System.out.println("==============Compara dos Integer====================");
        BiPredicate<Integer,Integer> test4 = (i,j)->{

        return i>j;
        };

        System.out.println(test4.test(5,10));


        System.out.println("==============Tipo usuario====================");
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("carlos");
        b.setNombre("carlos");

        BiPredicate<Usuario,Usuario> test5 = (a1, b1) ->{
            return a1.getNombre().equals(b1.getNombre());
        };

        System.out.println(test5.test(a,b));






    }
}
