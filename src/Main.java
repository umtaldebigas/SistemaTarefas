import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefa = new ArrayList<Tarefa>();

        tarefa.add(new Tarefa("Ir no supermercado", "No mercado dia", "Pendente", "24-05-2026", "25-06-2026"));
        tarefa.add(new Tarefa("Jogar videogame com meus amigos", "Jogar Valorant", "Pendente", "25-05-2026", "26-06-2026"));
        tarefa.add(new Tarefa("Dançar Creu", "Com a minha namorada", "Finalizado", "24-05-2026", "24-06-2026"));
        tarefa.add(new Tarefa("Alimentar os macacos", "Eles estão famintos", "Pendente", "24-05-2026", "25-06-2026"));

        String linha = "=".repeat(40);
        System.out.println(linha);
        System.out.println("Bem vindo ao seu sistema de tarefas!");
        System.out.println(linha);

        while (true) {
            System.out.println("[1.] Adicionar Tarefa");
            System.out.println("[2.] Listar Tarefa");
            System.out.println("[3.] Remover Tarefa");
            System.out.println("[4.] Listar Tarefa Pendente");
            System.out.println("[5.] Listar Tarefa Finalizado");
            System.out.println("[6.] Sair");
            System.out.print("Digite opção desejada: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do tarefa: ");
                    String idTarefa = sc.nextLine();

                    System.out.println("Digite o descricao do tarefa: ");
                    String descricaoTarefa = sc.nextLine();

                    System.out.println("Progresso atual da tarefa(Pendente, Finalizado): ");
                    String progressoTarefa = sc.nextLine();

                    System.out.println("Tarefa adicionada com sucesso!");
                    String criadoTarefa = LocalDate.now().toString();
                    String AtualizadoTarefa = LocalDate.now().toString();

                    Tarefa tarefaadd = new Tarefa(idTarefa, descricaoTarefa, progressoTarefa, criadoTarefa, AtualizadoTarefa);
                    tarefa.add(tarefaadd);
                break;

                case 2:
                    for(Tarefa t : tarefa) {
                        System.out.println("Tarefa: " + t.getIdTarefa());
                        System.out.println("Descricao: " + t.getDescricaoTarefa());
                        System.out.println("Progresso: " + t.getProgressoTarefa());
                        System.out.println("Data criação: " + t.getCriadoTarefa());
                        System.out.println("Atualizado: " + t.getAtualizadoTarefa() + "\n");
                    }
                break;
            }
        }
    }
}