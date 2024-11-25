import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class principal{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        System.out.println("Ej 27 Probando Stream");
        Scanner leer = new Scanner(System.in);
        //Function<tipo_entra, tipo_regresa> nombre_funcion = (parametros) -> {
            //cuerpo de la funcion
        //};
        //variable_recibe_valor = nombre_funcion.apply(parametro);
    Function<String,Integer> sizeOf = (String s) -> {
        return s.length();
    };

    Integer r1 = sizeOf.apply("me canso ganso");
    System.out.println("cantidad caracteres: " + r1);

    ArrayList<String> names = new ArrayList<>
    (Arrays.asList("John", "John", "Mariam", "Alex", "Mohammado", "Mohammado", "Vincent", "Alex", "Alex"));

    ArrayList<String> filtrado = new ArrayList<>(Arrays.asList("uno", "dos", "tres"));

    System.out.println("foreach");
    names.forEach(elem->System.out.println(elem));
    System.out.println("foreach funcion abreviado");
    names.forEach(System.out::println); // solo para 1 instruccion

    //usando filtros
    System.out.println("filtrado con o");
    names.stream().filter(name-> name.contains("o")).forEach(System.out::println);
    filtrado = (ArrayList<String>) names.stream().filter(name -> name.contains("o")).collect(Collectors.toList());
    //imprimir filtrados
    System.out.println("imprimir filtrados");
    filtrado.forEach(elem -> System.out.println(elem));
    System.out.println("otro filtrado");
    names.stream().filter(name -> name.equals("Alex")).forEach(System.out::println);
    System.out.println("Empieza con M");
    names.stream().filter(name -> name.startsWith("M")).forEach(System.out::println);
    System.out.println("Ordenar");
    names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

    leer.close();
    }
}