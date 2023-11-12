import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Metodos {

    public Metodos(){}

    public ArrayList<String> convertir(ArrayList vieneLista){
        ArrayList<String> nueva = new ArrayList();
        TrabjarCadenas convierto = (valor)->valor.toUpperCase();
        vieneLista.forEach(valor->nueva.add(convierto.trabajar((String) valor)));
        return nueva;

        /*
        TrabjarCadenas una = (cadena)->cadena.toUpperCase();
        listaOriginal.forEach(vamos->listaDestino.add(una.trabajar(vamos)));
         */
    }

    public void listarCadenas(List<String> elArray, int num){
        ArrayList<Integer> temp = new ArrayList();
        TrabjarCadenas c =(m)->String.valueOf(m.length());
        //elArray.forEach(algo-> System.out.println(c.trabajar(algo)));
        elArray.forEach(numeros->temp.add(Integer.parseInt(c.trabajar(numeros))));
        Map<String, Integer> elMapa = new HashMap<>();
        for (int i=0;i<elArray.size();i++){
            elMapa.put(elArray.get(i), temp.get(i));
        }
        //System.out.println("Lo que tiene el mapa "+ elMapa.toString());
        List<String> salida = elMapa.entrySet().stream().filter(v->num<v.getValue()).map(Map.Entry::getKey).collect(Collectors.toList());
        salida.forEach(muestro-> System.out.print(muestro + ", "));

    }

}
