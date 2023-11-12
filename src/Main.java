import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaOriginal = new ArrayList<>(Arrays.asList("VieNe BIEn","Mando CuAlquiera","Siga siga","todo ok"));
        ArrayList<String> listaDestino = new ArrayList<>();

//        TrabjarCadenas una = (cadena)->cadena.toUpperCase();
//        listaOriginal.forEach(vamos->listaDestino.add(una.trabajar(vamos)));
//        for (String valor : listaDestino){
//            System.out.println("Muesto la cadena de a un elemento " + valor);
//        }
        Metodos metodo = new Metodos();
        listaDestino = metodo.convertir(listaOriginal);
        System.out.println("Muestro los objetos originales ");
        for (String original : listaOriginal){
            System.out.println(original);
        }
        System.out.println();
        System.out.println("Muestro los objetos modificados ");
        for (String valor : listaDestino){
            System.out.println(valor);
        }

        metodo.listarCadenas(listaOriginal, 8);

    }
}