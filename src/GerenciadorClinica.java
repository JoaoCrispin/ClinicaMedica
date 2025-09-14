import java.util.Scanner;
import model.Paciente;
import service.FilaDeAtendimento;
import service.PilhaHistoricoAtendimentos;

public class GerenciadorClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n===================================================");
            System.out.println("1. Adicionar novo paciente à fila");
            System.out.println("2. Atender próximo paciente");
            System.out.println("3. Exibir fila de atendimento");
            System.out.println("4. Exibir histórico de atendimentos");
            System.out.println("5. Sair");
            System.out.println("===================================================");
            System.out.print("Escolha uma opção: ");
            int opcao = lerInteiro(scanner);

            if (opcao == 1) {
                System.out.print("Nome do paciente: ");
                String nome = scanner.nextLine();
                System.out.print("Idade do paciente: ");
                int idade = lerInteiro(scanner);
                System.out.print("Sintoma do paciente: ");
                String sintoma = scanner.nextLine();
                Paciente p = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(p);
            } else if (opcao == 2) {
                Paciente atendido = fila.atenderPaciente();
                if (atendido != null) historico.adicionarAoHistorico(atendido);
            } else if (opcao == 3) { fila.mostrarFila(); }
            else if (opcao == 4) { historico.mostrarHistorico(); }
            else if (opcao == 5) {
                rodando = false;
                System.out.println("Saindo do sistema...");
            } else { System.out.println("Opção inválida! Tente novamente."); }
        }
        scanner.close();
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida! Digite um número inteiro: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
