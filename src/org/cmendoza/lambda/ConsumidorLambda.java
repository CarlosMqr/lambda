package org.cmendoza.lambda;

import org.cmendoza.lambda.model.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumidorLambda {
    public static void main(String[] args) {

        //MM -> para el número del mes
        //MMMM -> para imprimir el nombre del mes
        //EEEE -> para imprimir el nombre de la semana

        Consumer<Date> consumidor = fecha ->{

            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

            System.out.println("Hola como estas?");
            System.out.println("Manejando expresiónes Lambda " + format.format(fecha) );
        };
        //consumer es expresión lambda que permite pasar por argumento un solo parametro del tipo generico
        //es void no devuelve nada

        //para levantar el consumidor es con la implementación
        consumidor.accept(new Date());

        //podemos usar el Biconsumer para dos argumentos de la siguiente forma


        BiConsumer<String, Integer> biConsumer = (nombre, edad) ->{
            System.out.println(nombre + " tiene " + edad + " años");
        };
        biConsumer.accept("Jazmin",27);


        //simplificada la expresión lambda
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo con expresiónes lambda!!!!");

        //se usa en apis, Stream, Consumer, BiConsumer, foreach


        List<String> nombres = Arrays.asList("Carlos","Jazmin","Jessy","Daniela","Thalia");
       nombres.forEach(System.out::println);// forma cuando solo es  Arrays.asList


       Usuario usuario = new Usuario();

        BiConsumer<Usuario,String> darNombre = (persona,nombre) ->{
          persona.setNombre(nombre);//le mandamos nombre del parámetro
            System.out.println(usuario.getNombre());
        };
        darNombre.accept(usuario,"CCarlos");//a qui se asigna el nombre que se manda en el setNombre


        Consumer<Usuario> darNombre2 = usuarioA -> {
          usuarioA.setNombre("JJazmin");
            System.out.println(usuarioA.getNombre());
        };
        darNombre2.accept(usuario);//se manda un tipo usuario con el cual se va a trabajar


        BiConsumer<Usuario, String> darNombre3 = Usuario::setNombre;
        darNombre3.accept(usuario,"JJessy");
        System.out.println(usuario.getNombre());

         ///////////////////////////////////////////////////////////////////////////
        Supplier<String> proveedor = ()->{
            return "Hola mundo con lambda supplier";
        };
        System.out.println(proveedor.get());































    }
}
