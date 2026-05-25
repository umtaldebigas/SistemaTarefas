import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefa = new ArrayList<Tarefa>();

        tarefa.add(new Tarefa("Ir no supermercado", "No mercado dia", "Pendente", "2026-05-24", "2026-05-25"));
        tarefa.add(new Tarefa("Jogar videogame com meus amigos", "Jogar Valorant", "Pendente", "2026-05-25", "2026-05-26"));
        tarefa.add(new Tarefa("Dançar Creu", "Com a minha namorada", "Finalizado", "2026-05-24", "2026-05-24"));
        tarefa.add(new Tarefa("Alimentar os macacos", "Eles estão famintos", "Pendente", "2026-05-24", "2026-05-25"));

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
            System.out.println("[6.] Atualizar Progresso");
            System.out.println("[7.] Sair");
            System.out.print("Digite opção desejada: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nDigite o nome do tarefa: ");
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

                case 3:
                    System.out.println("Digite o nome do tarefa a ser removida: ");
                    String nomeTarefa = sc.nextLine();

                    for(Tarefa t : tarefa) {
                        if(t.getIdTarefa().equalsIgnoreCase(nomeTarefa)) {
                            System.out.println("Tem certeza que deseja remover a tarefa " + t.getIdTarefa() + "? (S/N)");
                            String resposta = sc.nextLine();

                            if(resposta.equalsIgnoreCase("S")) {
                                tarefa.remove(t);
                                System.out.println("Tarefa removida com sucesso!");
                            } else {
                                System.out.println("Remoção cancelada!");
                            }
                            break;
                        }
                    }
                break;

                case 4:
                    boolean temPendente = false;

                    for(Tarefa t : tarefa) {

                        if (t.getProgressoTarefa().equalsIgnoreCase("Pendente")) {
                            temPendente = true;
                            System.out.println("Tarefa: " + t.getIdTarefa());
                            System.out.println("Descrição: " + t.getDescricaoTarefa());
                            System.out.println("Progresso: " + t.getProgressoTarefa());
                            System.out.println("Data Criação: " + t.getCriadoTarefa());
                            System.out.println("Atualizado: " + t.getAtualizadoTarefa() + "\n");
                        }
                    }

                    if(!temPendente) {
                        System.out.println("Você não possui tarefas pendentes!");
                    }

                break;

                case 5:
                    boolean temFinalizado = false;

                    for(Tarefa t : tarefa) {

                        if (t.getProgressoTarefa().equalsIgnoreCase("Finalizado")) {
                            temFinalizado = true;
                            System.out.println("Tarefa: " + t.getIdTarefa());
                            System.out.println("Descrição: " + t.getDescricaoTarefa());
                            System.out.println("Progresso: " + t.getProgressoTarefa());
                            System.out.println("Data Criação: " + t.getCriadoTarefa());
                            System.out.println("Atualizado: " + t.getAtualizadoTarefa() + "\n");
                        }
                    }

                    if (!temFinalizado) {
                        System.out.println("Você não finalizou nenhuma tarefa!");
                    }

                break;

                case 6:
                    System.out.println("Digite o nome da tarefa a ser atualizada: ");
                    String nomeTarefa2 = sc.nextLine();

                    for(Tarefa t : tarefa) {
                        if(t.getIdTarefa().equalsIgnoreCase(nomeTarefa2)) {
                            System.out.println("Tem certeza que deseja atualizar o progresso da tarefa " + t.getIdTarefa() + "? (S/N)");
                            String resposta = sc.nextLine();

                            if(resposta.equalsIgnoreCase("S")) {
                                System.out.println("Digite novo progresso da tarefa: (Pendente/Finalizado)");
                                t.setProgressoTarefa(sc.nextLine());
                            } else {
                                System.out.println("Remoção cancelada!");
                            }
                            break;
                        }
                    }
                break;

                case 7:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
            }
        }
    }
}