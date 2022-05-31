import java.util.ArrayList;
import java.util.List;

public class Subtarefa extends Tarefa {

    private List<Tarefa> tarefas;

    public Subtarefa(String descricao, String tamanho, int prioridade) {
        super(descricao, tamanho, prioridade);
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void addTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }

    public String getConteudo() {
        String saida;
        saida = "Subtarefa:\n Descricao: " + this.getDescricao() + "\n Tamanho: " + this.getTamanho() + "\n Prioridade" + this.getPrioridade();
        for (Tarefa tarefa:tarefas){
            saida += tarefa.getConteudo();
        }
        return saida;
    }
}
