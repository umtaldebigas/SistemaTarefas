import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linha = "=".repeat(40);
        System.out.println(linha);
        System.out.println("Bem vindo ao seu sistema de tarefas!");
        System.out.println(linha);

        while (true) {
            System.out.println("[1.] Adicionar Tarefa");
            System.out.println("[2.] Remover Tarefa");
            System.out.println("[3.] Listar todas as Tarefas");
            System.out.println("[4.] Listar Tarefa Pendente");
            System.out.println("[5.] Listar Tarefa Finalizado");
            System.out.println("[6.] Sair");
            System.out.print("Digite opção desejada: ");
            int escolha = sc.nextInt();
        }
    }
}