import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> avgTemperaturesFromFistSixMonths = new ArrayList<>();
        avgTemperaturesFromFistSixMonths.add(25.6);
        avgTemperaturesFromFistSixMonths.add(22.1);
        avgTemperaturesFromFistSixMonths.add(27.4);
        avgTemperaturesFromFistSixMonths.add(24.3);
        avgTemperaturesFromFistSixMonths.add(21.2);
        avgTemperaturesFromFistSixMonths.add(26.9);

        System.out.println("Temperatura média dos 6 primeiros meses do ano: " + avgTemperaturesFromFistSixMonths);

        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        Double sum = 0d;
        for (Double i: avgTemperaturesFromFistSixMonths) {
            sum += i;
        }
        Double semesterTempAvg = sum / avgTemperaturesFromFistSixMonths.size();
        System.out.println("Média semestral das temperaturas: " + semesterTempAvg);

        for (int i = 0; i < avgTemperaturesFromFistSixMonths.size(); i++) {
            if (avgTemperaturesFromFistSixMonths.get(i) > semesterTempAvg) {
                System.out.println(avgTemperaturesFromFistSixMonths.get(i) + " - " + meses.get(i));
            }
        }
    }
}
