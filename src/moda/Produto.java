package moda;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;

        while (true) {
            System.out.println("*****************************************************");
            System.out.println(" ");
            System.out.println(" MODA SUSTENTÁVEL ");
            System.out.println(" ");
            System.out.println("*****************************************************");
            System.out.println(" ");
            System.out.println(" 1 - Cadastrar Produto ");
            System.out.println(" 2 - Listar todos os Produtos ");
            System.out.println(" 3 - Buscar Produto por Nome ");
            System.out.println(" 4 - Atualizar Dados do Produto ");
            System.out.println(" 5 - Remover Produto ");
            System.out.println(" 6 - Realizar Pedido ");
            System.out.println(" 7 - Visualizar Pedidos ");
            System.out.println(" 8 - Cancelar Pedido ");
            System.out.println(" 9 - Sair ");
            System.out.println(" ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada: ");
            System.out.println(" ");

            opcao = leia.nextInt();

            if (opcao == 9) {
                System.out.println("\nModa Sustentável - O seu estilo sustentável começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");
                    break;
                case 2:
                    System.out.println("Listar todos os Produtos\n\n");
                    break;
                case 3:
                    System.out.println("Buscar Produto por Nome\n\n");
                    break;
                case 4:
                    System.out.println("Atualizar Dados do Produto\n\n");
                    break;
                case 5:
                    System.out.println("Remover Produto\n\n");
                    break;
                case 6:
                    System.out.println("Realizar Pedido\n\n");
                    break;
                case 7:
                    System.out.println("Visualizar Pedidos\n\n");
                    break;
                case 8:
                    System.out.println("Cancelar Pedido\n\n");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Najla Guimarães ");
        System.out.println("Generation Brasil - najlag@genstudents.org");
        System.out.println("https://www.linkedin.com/in/najlaguimaraes/");
        System.out.println("*********************************************************");
    }
}

		    