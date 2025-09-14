package service;

import java.util.LinkedList;
import model.Paciente;

public class FilaDeAtendimento {
    private LinkedList<Paciente> fila;

    public FilaDeAtendimento() { fila = new LinkedList<>(); }

    public void adicionarPaciente(Paciente p) {
        fila.addLast(p);
        System.out.println("Paciente adicionado à fila: " + p.getNome());
    }

    public Paciente atenderPaciente() {
        if (!fila.isEmpty()) {
            Paciente atendido = fila.removeFirst();
            System.out.println("Atendendo paciente: " + atendido.getNome());
            return atendido;
        } else {
            System.out.println("A fila está vazia.");
            return null;
        }
    }

    public boolean estaVazia() { return fila.isEmpty(); }

    public void mostrarFila() {
        if (fila.isEmpty()) { System.out.println("A fila está vazia."); }
        else {
            System.out.println("Fila de atendimento:");
            for (Paciente p : fila) { System.out.println(p.exibirInfo()); }
        }
    }
}
