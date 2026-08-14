package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private List<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        this.aniversariantes.add(novo);
    }

    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<>();
        DataAniversario dataProcurada = new DataAniversario(dia, mes);

        for (Aniversariante a : this.aniversariantes) {
            if (a.getDataAniversario().equals(dataProcurada)) {
                nomesDoDia.add(a.getNome());
            }
        }
        return nomesDoDia;
    }

    public void removerAniversariante(String nomeAniversariante) {
        this.aniversariantes.removeIf(a -> a.getNome().equalsIgnoreCase(nomeAniversariante));
    }
}
