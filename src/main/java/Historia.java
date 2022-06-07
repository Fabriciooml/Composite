public class Historia {

    private Atividade epico;

    public String getEpico() {
        if (this.epico == null) {
            throw new NullPointerException("Historia sem epico");
        }
        return this.epico.getConteudo();
    }

    public void setEpico(Atividade epico) {
        this.epico = epico;
    }
}
