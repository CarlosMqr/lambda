package org.cmendoza.lambda.tarea;
import java.util.Collections;
public class Lambdapalabrafrecuente {
    public static void main(String[] args) {


        IContarPalabras funcion = frase -> {
            String[] arreglo = frase.split(" ");// el método split convierte la oración en eun arreglo debe ser String

            int max = 0;
            String palabra = null;
            for (int i = 0; i < arreglo.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[i].equals(arreglo[j]))
                        cantidad++;
                }
                if (cantidad > max) {
                    max = cantidad;
                    palabra = arreglo[i];
                }
            }
            return Collections.singletonMap(palabra, max);
        };

        funcion.contarPalabras("hola mundop desde java jazmin es chica muy linda jazmin te quiero ademas trabaja de maestra " +
                "jazmin debemos salior").forEach((k,v)-> System.out.println(k + " se repite " + v + " veces"));








    }
}
