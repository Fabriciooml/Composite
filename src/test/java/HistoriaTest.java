import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HistoriaTest {

    @Test
    void deveRetornarEmentaDisciplina() {

        Tarefa tarefa1 = new Tarefa("Criar script da interface com usuário", 0, "M");
        Chore chore11 = new Chore("Criar Script de conversão de fala para texto", 0);
        Chore chore12 = new Chore("Criar Script de conversão de texto para fala", 1);
        tarefa1.addAtividade(chore11);
        tarefa1.addAtividade(chore12);

        Tarefa tarefa2 = new Tarefa("Implementar GPT-3", 2, "M");

        Tarefa tarefa3 = new Tarefa("Implementar personas", 3, "G");
        Chore chore31 = new Chore("Criar arquivo YAML com nomes e personas", 3);
        Chore chore32 = new Chore("Criar persona bardo", 4);
        tarefa3.addAtividade(chore31);
        tarefa3.addAtividade(chore32);

        Tarefa epico = new Tarefa("TCC", 0, "GG");
        epico.addAtividade(tarefa1);
        epico.addAtividade(tarefa2);
        epico.addAtividade(tarefa3);

        Historia historia = new Historia();
        historia.setEpico(epico);

        assertEquals("\nTarefa:\n" +
                " Descricao: TCC\n" +
                " Prioridade: 0\n" +
                " Tamanho: GG\n" +
                "Tarefa:\n" +
                " Descricao: Criar script da interface com usuário\n" +
                " Prioridade: 0\n" +
                " Tamanho: M\n" +
                "Chore:\n" +
                " Descricao: Criar Script de conversão de fala para texto\n" +
                " Prioridade: 0\n" +
                "Chore:\n" +
                " Descricao: Criar Script de conversão de texto para fala\n" +
                " Prioridade: 1\n" +
                "Tarefa:\n" +
                " Descricao: Implementar GPT-3\n" +
                " Prioridade: 2\n" +
                " Tamanho: M\n" +
                "Tarefa:\n" +
                " Descricao: Implementar personas\n" +
                " Prioridade: 3\n" +
                " Tamanho: G\n" +
                "Chore:\n" +
                " Descricao: Criar arquivo YAML com nomes e personas\n" +
                " Prioridade: 3\n" +
                "Chore:\n" +
                " Descricao: Criar persona bardo\n" +
                " Prioridade: 4", historia.getEpico());
    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Historia historia = new Historia();
            historia.getEpico();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Historia sem epico", e.getMessage());
        }
    }
}
