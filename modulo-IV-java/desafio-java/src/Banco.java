import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
    
    public void listarClientes() {
        while (contas.iterator().hasNext()) {
            System.out.println(contas.iterator().next().cliente.getNome());
        }
    }
}
