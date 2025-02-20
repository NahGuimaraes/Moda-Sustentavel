package moda;
import moda.controller.ModaController;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import moda.controller.ModaController;
import moda.model.Moda;
import moda.model.ModaOrganica;
import moda.model.ModaReciclavel;
import moda.util.Cores;

public class Produto {

	
	public Produto(int i, String string, String string2, float f) {
		
	}
		

	public Produto(int i, String string, String string2, float f, String string3, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public Produto(int codigo, String nome, String string, float preco, String tamanho, String cor) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
     ModaController produtos = new ModaController();
		
		
	Scanner leia = new Scanner(System.in);
	
		int opcao, codigo, tipo, estoque;
		String nome, descricao, material;
		float preco;
		
		System.out.println("\nCadastrar Produtos\n");
		Produto p1 = new Produto(1, "Vestido Sustentável", "Vestido feito de material reciclado", 200.0f, "Algodão Orgânico", true);
		Produto.cadastrar(p1);
		Produto p2 = new Produto(2, "Camiseta Ecológica", "Camiseta feita de material orgânico", 50.0f, "Algodão Orgânico", true);
		Produto.cadastrar(p2);
		Produto p3 = new Produto(3, "Calça Sustentável", "Calça feita de material reciclado", 150.0f, "Tecido Reciclado", true);
		Produto.cadastrar(p3);
		Produto p4 = new Produto(4, "Bolsa Ecológica", "Bolsa feita de material orgânico", 100.0f, "Algodão Orgânico", true);
		Produto.cadastrar(p4);
		
		Produto.listarTodas();


		int opcao1;

        while (true) {
        	
        	System.out.println(Cores.TEXT_PURPLE_BRIGHT+ Cores.ANSI_BLACK_BACKGROUND_BRIGHT);
            System.out.println("************************************************** ");
            System.out.println("*                                                * ");
            System.out.println("*                MODA SUSTENTÁVEL                * ");
            System.out.println("*                                                * ");
            System.out.println("************************************************** ");
            System.out.println("*                                                * ");
            System.out.println("* 1 - Cadastrar Produto                          * ");
            System.out.println("* 2 - Listar todos os Produtos                   * ");
            System.out.println("* 3 - Buscar Produto por Nome                    * ");
            System.out.println("* 4 - Atualizar Dados do Produto                 * ");
            System.out.println("* 5 - Remover Produto                            * ");
            System.out.println("* 6 - Realizar Pedido                            * ");
            System.out.println("* 7 - Visualizar Pedidos                         * ");
            System.out.println("* 8 - Cancelar Pedido                            * ");
            System.out.println("* 9 - Sair                                       * ");
            System.out.println("*                                                * ");
            System.out.println("************************************************** ");
            System.out.println("*           Entre com a opção desejada:          * ");
            System.out.println("************************************************** ");
        
        
            try {
                opcao1 = leia.nextInt();
             }catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao1 = 0;
            
             }

            if (opcao1 == 9) {
                System.out.println("\nModa Sustentável - O seu estilo sustentável começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
                
            }

            switch (opcao1) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");
                    System.out.println("Digite o Código do Produto:");
                    codigo = leia.nextInt();
                    System.out.println("Digite o nome do Produto:");
                    leia.skip("\\R?");
                    nome = leia.nextLine();
                    do {
                        System.out.println("Digite o tipo do Produto (1-Vestido ou 2-Camiseta):");
                        tipo = leia.nextInt();
                    }while(tipo < 1 && tipo > 2);
                    System.out.println("Digite o Preço do Produto (R$): ");
                    preco = leia.nextFloat();
                    switch(tipo) {
                        case 1 -> {
                            System.out.println("Digite o Material do Produto:");
                            material = leia.next();
                            System.out.println("Digite se o Produto é Sustentável (true/false):");
                            boolean eSustentavel = leia.nextBoolean();
                            produtos.cadastrar(new Produto(codigo, nome, "", preco, material, eSustentavel));
                        }
                        case 2 -> {
                            System.out.println("Digite o Tamanho do Produto:");
                            String tamanho = leia.next();
                            System.out.println("Digite a Cor do Produto:");
                            String cor = leia.next();
                            produtos.cadastrar(new Produto(codigo, nome, "", preco, tamanho, cor));
                        }
                    
                    }
            
                    keyPress();
                    break;
               
                case 2:
                
                	System.out.println("Listar todos os Produtos\n\n");
                    
                    keyPress();
                    break;
            
               
                case 3:
                    System.out.println("Buscar Produto por Nome\n\n");
                    System.out.println("Listar todos os Produtos\n\n");
                    System.out.println("Digite o código do produto: ");
                    codigo = leia.nextInt();
                    produtos.procurarPorCodigo(codigo);
                
                    
                    keyPress();
                    break;
                
                case 4:
                    System.out.println("Atualizar Dados do Produto\n\n");
                   
                    System.out.println("Digite o código do produto: ");
                    codigo = leia.nextInt();
                    var buscaProduto = produtos.buscarNaCollection(codigo);
                    if (buscaProduto != null) {
                        System.out.println("Digite o nome do produto: ");
                        leia.skip("\\R?");
                        nome = leia.nextLine();
                        System.out.println("Digite o preço do produto (R$): ");
                        preco = leia.nextFloat();
                        System.out.println("Digite a descrição do produto: ");
                        leia.skip("\\R?");
                        descricao = leia.nextLine();
                        tipo = buscaProduto.getTipo();
                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Digite o material do produto: ");
                                material = leia.next();
                                System.out.println("Digite se o produto é sustentável (true/false): ");
                                boolean eSustentavel = leia.nextBoolean();
                                produtos.atualizar(new Produto(codigo, nome, descricao, preco, material, eSustentavel));
                            }
                            case 2 -> {
                                System.out.println("Digite o tamanho do produto: ");
                                String tamanho = leia.next();
                                System.out.println("Digite a cor do produto: ");
                                String cor = leia.next();
                                produtos.atualizar(new Produto(codigo, nome, descricao, preco, tamanho, cor));
                            }
                            default -> {
                                System.out.println("Tipo de produto inválido!");
                            }
                        }
                    } else {
                        System.out.println("\nProduto não encontrado!");
                    }
                    
                    keyPress();
                    break;
                
                case 5:
                    System.out.println("Remover Produto\n\n");
                    System.out.println("Digite o código do produto: ");
                    codigo = leia.nextInt();
                    produtos.deletar(codigo); 
                    
                    keyPress();
                    break;
                
                case 6:
                    System.out.println("Realizar Pedido\n\n");
                    
                    keyPress();
                    break;
                
                case 7:
                    System.out.println("Visualizar Pedidos\n\n");
                    
                    keyPress();
                    break;
                
                case 8:
                    System.out.println("Cancelar Pedido\n\n");
                   
                    keyPress();
                    break;
                
                default:
                    System.out.println("\nOpção Inválida!\n");
                    
                    keyPress();
                    break; 
           
           }
        }
    }
                  
     private static void listarTodas() {
		
		
	}

	private static void cadastrar(Produto p1) {
		
		
	}

	public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Najla Guimarães ");
        System.out.println("Generation Brasil - najlag@genstudents.org");
        System.out.println("https://www.linkedin.com/in/najlaguimaraes/");
        System.out.println("*********************************************************");
    
	}
        public static void keyPress() {
        	
        	try {
        		
        		
        		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
                System.in.read();
            } catch (IOException e) {
                System.out.println("Você pressionou uma tecla diferente de enter!");
            
            }
        }


		public void visualizar() {
	
	   }
   }
            