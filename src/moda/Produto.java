package moda;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


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


	public static void main(String[] args) {
		
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
                    
                    keyPress();
                    break;
               
                case 2:
                    System.out.println("Listar todos os Produtos\n\n");
                    
                    keyPress();
                    break;
                
                case 3:
                    System.out.println("Buscar Produto por Nome\n\n");
                    
                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar Dados do Produto\n\n");
                   
                    keyPress();
                    break;
                
                case 5:
                    System.out.println("Remover Produto\n\n");
                    
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
            