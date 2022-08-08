package Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {
    private static Double max;

    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());

        System.out.println("Altera consumo do gol:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Verifica se o modelo 'tucson' está no dicionário:");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exibe o consumo do Uno:");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("Exibe os modelos dos carros:");
        System.out.println(carrosPopulares.keySet());

        System.out.println("Exibe os consumos dos carros:");
        System.out.println(carrosPopulares.values());

        System.out.println("Exibe modelo mais econômico e seu consumo:");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + melhorConsumo);
            }
        }

        System.out.println("Exibe modelo menos econômico e seu consumo:");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(piorConsumo)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + piorConsumo);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exibe a soma dos consumos: " + soma);

        System.out.println("Exibe a média dos consumos: " + (soma / carrosPopulares.size()));

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }

        System.out.println(carrosPopulares);

        List<String> numeros = List.of("1", "2", "3", "4");
        System.out.println(numeros.stream().mapToInt(Integer::parseInt).average());

        List<String> coresDaBandeiraDoBrasil = Arrays.asList("c", "m", "l", "v");
        System.out.println(coresDaBandeiraDoBrasil);
    }
}
