import java.util.ArrayList;
import java.util.List;

public class Tarefa extends Atividade {

    private List<Atividade> atividades;
    private String tamanho;

    public Tarefa(String descricao, int prioridade, String tamanho) {
        super(descricao, prioridade);
        this.atividades = new ArrayList<Atividade>();
        this.tamanho = tamanho;
    }

    public void addAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getConteudo() {
        String saida;
        saida = "\nTarefa:\n Descricao: " + this.getDescricao() + "\n Prioridade: " + this.getPrioridade() + "\n Tamanho: " + this.getTamanho();
        for (Atividade atividade :atividades){
            saida += atividade.getConteudo();
        }
        return saida;
    }
}
