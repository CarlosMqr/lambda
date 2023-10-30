package org.cmendoza.lambda.tarea;

import java.util.function.Function;

public class TareaLambda {
    public static void main(String[] args) {

        IFrase frase = palabra->{
          return   palabra.replace(",","").replace(" ","")
                  .replace(".","").trim().toUpperCase();
        };

        System.out.println(frase.frase(" Hola.Mundo desde,java "));

        IFrase frase2 = palabra2 -> palabra2
                .toUpperCase()
                .trim()
                .replace(",","")
                .replace(" ","")
                .replace(".","");

        System.out.println(frase2.frase(" Hola.Mundo desde,java trabajando,con.expresiónes lambda"));










    }
}
