package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Leleco", 8, "branco"));
                add(new Gato("Simba", 4, "tigrado"));
                add(new Gato("Pipoca", 5, "amarelo"));
            }
        };
        System.out.println();
        // Imprimindo em ordem de inserção
        System.out.println("Imprimindo em ordem de inserção:");
        System.out.println(meusGatos);
        
        System.out.println("Imprimindo em ordem aleatória:");
        Collections.shuffle(meusGatos);      
        System.out.println(meusGatos);
        
        System.out.println("Imprimindo em ordem alfabética (nome):");
        Collections.sort(meusGatos);       
        System.out.println(meusGatos);

        System.out.println("Imprimindo em ordem crescente de idade:");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Imprimindo em ordem alfabética (cor):");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Imprimindo em ordem Nome/Cor/Idade:");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
