package service;

import java.util.Stack;
import model.Paciente;

public class PilhaHistoricoAtendimentos {
    private Stack<Paciente> historico;

    public PilhaHistoricoAtendimentos() { historico = new Stack<>(); }

    public void adicionarAoHistorico(Paciente p) { historico.push(p); }

    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) return historico.peek();
        else {
            System.out.println("Nenhum paciente atendido ainda.");
            return null;
        }
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) { System.out.println("Histórico vazio."); }
        else {
            System.out.println("Histórico de atendimentos (mais recente primeiro):");
            for (int i = historico.size() - 1; i >= 0; i--) {
                System.out.println(historico.get(i).exibirInfo());
            }
        }
    }
}
