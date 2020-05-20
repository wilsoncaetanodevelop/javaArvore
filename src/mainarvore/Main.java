package mainarvore;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.print("\nEntre com a opcao:");
        System.out.print("\n ----1: Inserir");
        System.out.print("\n ----2: Excluir");
        System.out.print("\n ----3: Pesquisar");
        System.out.print("\n ----4: Exibir");
        System.out.print("\n ----5: Sair do programa");
        System.out.print("\n-> ");
    }

    public static Item obtemItem() {

        String nome, fone;

        sc.nextLine();
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o Telefone: ");
        fone = sc.nextLine();

        Item item = new Item(nome, fone);

        return item;
    }

    public static void main(String[] args) {

        Arvore1 arv = new Arvore1();
        int opcao;
        Item x = null;

        do {

            menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    x = obtemItem();
                    arv.inserir(x);
                    x = null;
                    break;

                case 2:
                    System.out.print("\n Informe o Item a ser  Excluido -> ");
                    x = obtemItem();
                    if (!arv.remover(x)) {
                        System.out.print("\n Valor nao encontrado!");
                    }
                    x = null;
                    break;

                case 3:
                    System.out.print("\n Informe o Item a Ser encontrado -> ");
                    x = obtemItem();
                    if (arv.buscar(x) != null) {
                        System.out.print("\n Valor Encontrado");
                    } else {
                        System.out.print("\n Valor nao encontrado!");
                    }
                    x = null;
                    break;

                case 4:
                    arv.caminhar();
                    break;

            }
        } while (opcao != 5);
    }
}
