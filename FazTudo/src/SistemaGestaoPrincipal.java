/* Faz tudo:
 * Integrantes do grupo:
 * Nome: Breno Silva Oliveira
 * RA: 323128927
 * 
 * Nome: Lucas Chaves Freitas
 * RA: 323114954
 */
import java.util.Scanner;

public class SistemaGestaoPrincipal {
    public static void main(String[] args) {
        SistemaGestao sistema = new SistemaGestao();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        //Loop principal do menu
        while (opcao != 5) {
            System.out.println("-====== Inicio ======-");
            System.out.println("1 - Menu do Cliente");
            System.out.println("2 - Menu do Profissional");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Contratar Profissional");
            System.out.println("5 - Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                	int opcaoCliente = 0;
                	//Menu do Cliente
                	while (opcaoCliente != 4) {
                    System.out.println("\n-====== Menu Cliente ======-");
                    System.out.println("1 - Cadastrar Cliente");
                    System.out.println("2 - Editar Cliente");
                    System.out.println("3 - Excluir Cliente");
                    System.out.println("4 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    opcaoCliente = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoCliente) {
                    
                        case 1:
                        	// Cadastrar novo cliente
                            System.out.print("\nNome do Cliente: ");
                            String nomeCliente = scanner.nextLine();
                            System.out.print("Digite o endereço do cliente: ");
                            String enderecoCliente = scanner.nextLine();
                            System.out.print("Telefone do Cliente: ");
                            String telefoneCliente = scanner.nextLine();
                            sistema.cadastrarCliente(nomeCliente, enderecoCliente, telefoneCliente);
                            
                            break;
                            
                        case 2:
                        	// Editar informações do cliente
                            System.out.print("\nDigite o nome do cliente: ");
                            String nomeEditarCliente = scanner.nextLine();
                            System.out.print("Digite o novo endereço do cliente: ");
                            String novoEnderecoCliente = scanner.nextLine();
                            System.out.print("Digite o novo telefone do cliente: ");
                            String novoTelefoneCliente = scanner.nextLine();
                            sistema.editarCliente(nomeEditarCliente, novoEnderecoCliente, novoTelefoneCliente);
                            
                            break;
                            
                        case 3:
                        	// Excluir cliente do sistema
                        	System.out.print("Digite o nome do cliente a ser excluído: ");
                        	String nomeExcluirCliente = scanner.nextLine();
                        	sistema.excluirCliente(nomeExcluirCliente);
                        	break;
                        	
                        case 4:
                        	// Voltar para o menu principal
                        	System.out.println();
                        	break;
                        
                        default: 
                            System.out.println("Opção inválida!");
                            break;
                    }
                }
                	break;
                
                case 2:
                int opcaoProfissional = 0;
                // Menu do Profissional
                while (opcaoProfissional != 6) {
                    System.out.println("\n-====== Menu Profissional ======-");
                    System.out.println("1 - Cadastrar Profissional");
                    System.out.println("2 - Editar Profissional");
                    System.out.println("3 - Excluir Profissional");
                    System.out.println("4 - Adicionar Serviço");
                    System.out.println("5 - Remover Serviço");
                    System.out.println("6 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    opcaoProfissional = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoProfissional) {
                    
                    case 1:
                    	// Cadastrar novo profissional
                    	System.out.print("Digite o nome do profissional: ");
                    	String nomeProfissional = scanner.nextLine();
                    	System.out.print("Digite o endereço do profissional: ");
                    	String enderecoProfissional = scanner.nextLine();
                    	System.out.print("Digite o telefone do profissional: ");
                    	String telefoneProfissional = scanner.nextLine();
                    	sistema.cadastrarProfissional(nomeProfissional, enderecoProfissional, telefoneProfissional);
                    
                    break;
                    
                    case 2:
                    	// Editar informações do profissional
                    	System.out.print("Digite o nome do profissional: ");
                    	String nomeEditarProfissional = scanner.nextLine();
                    	System.out.print("Digite o novo endereço do profissional: ");
                    	String novoEnderecoProfissional = scanner.nextLine();
                    	System.out.print("Digite o novo telefone do profissional: ");
                    	String novoTelefoneProfissional = scanner.nextLine();
                    	sistema.editarProfissional(nomeEditarProfissional, novoEnderecoProfissional, novoTelefoneProfissional);
                    
                    break;
                        
                    case 3:
                    	// Excluir profissional do sistema          	
                    System.out.print("Digite o nome do profissional a ser excluído: ");
                    String nomeExcluirProfissional = scanner.nextLine();
                    sistema.excluirProfissional(nomeExcluirProfissional);
                    
                    break;
                    
                    case 4:
                    	// Adicionar serviço ao profissional
                    	System.out.print("Digite o nome do profissional: ");
                    	String nomeAdicionarServico = scanner.nextLine();
                    	System.out.print("Digite o serviço a ser adicionado: ");
                    	String servicoAdicionar = scanner.nextLine();
                    	sistema.adicionarServicoProfissional(nomeAdicionarServico, servicoAdicionar);
                    break;
                    	          
                    case 5:
                    	// Remover serviço do profissional
                        System.out.print("Digite o nome do profissional: ");
                        String nomeRemoverServico = scanner.nextLine();
                        System.out.print("Digite o serviço a ser removido: ");
                        String servicoRemover = scanner.nextLine();
                        sistema.removerServicoProfissional(nomeRemoverServico, servicoRemover);
                        break;

                    case 6:
                    	// Voltar para o menu principal
                    	System.out.println();
                    	break;
                        
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                } break;
                
                case 3:
                	// Listar clientes ou profissionais
                	int opcaoListar = 0;
                	while (opcaoListar != 3) {
                	System.out.println("\n-====== Listar ======-");
                    System.out.println("1 - Clientes");
                    System.out.println("2 - Profissionais");
                    System.out.println("3 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    opcaoListar = scanner.nextInt();
                    
                    switch (opcaoListar) {
                    case 1:
                    	// Listar todos os clientes cadastrados no sistema
                    	sistema.listarClientes();
                    	break;
                    	case 2:
                    		// Listar todos os profissionais cadastrados no sistema
                    		sistema.listarProfissional();
                            break;
                         case 3:
                        	// Voltar para o menu principal
                        	System.out.println();
                            break;
                         default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                   }
                	
                     break;
                
                case 4:
                	// Contratar profissional
                    System.out.print("Digite o nome do cliente: ");
                    String nomeClienteContrato = scanner.nextLine();
                    System.out.print("Digite o nome do profissional: ");
                    String nomeProfissionalContrato = scanner.nextLine();
                    System.out.println("Contrato realizado entre o cliente " + nomeClienteContrato + " e o profissional " + nomeProfissionalContrato + ".");
                    break;
                
                case 5:
                	// Sair do programa
                	System.out.println();
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        // Mensagem de encerramento do programa
        System.out.println("Programa finalizado!");
        scanner.close();
    }
}
