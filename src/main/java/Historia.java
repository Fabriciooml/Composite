public class Historia {

    private Tarefa epico;

    public String getEpico() {
        if (this.epico == null) {
            throw new NullPointerException("Historia sem epico");
        }
        return this.epico.getConteudo();
    }

    public void setEpico(Tarefa epico) {
        this.epico = epico;
    }
}
