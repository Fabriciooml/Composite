public abstract class Tarefa {

    String descricao;
    String tamanho;
    int prioridade;

    public Tarefa(String descricao, String tamanho, int prioridade) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public abstract String getConteudo();
}
