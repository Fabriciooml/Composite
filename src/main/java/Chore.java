public class Chore extends Atividade{

    public Chore(String descricao, int prioridade) {
        super(descricao, prioridade);
    }

    @Override
    public String getConteudo() {
        return "\nChore:\n Descricao: " + this.getDescricao() + "\n Prioridade: " + this.getPrioridade();
    }
}
