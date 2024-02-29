/**
 * Classe responsável pela gestão do sistema, incluindo cadastro, edição, exclusão e listagem de clientes e profissionais.
 */

import java.util.ArrayList;
import java.util.List;

public class SistemaGestao {
    private List<Cliente> clientes;
    private List<Profissional> profissionais;
  
    public SistemaGestao() {
        this.clientes = new ArrayList<>();
        this.profissionais = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String endereco, String telefone) {
        Cliente cliente = new Cliente(nome, endereco, telefone);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso.");
    }
    
    public void editarCliente(String nome, String endereco, String telefone) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            System.out.println("Cliente editado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void excluirCliente(String nome) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente excluído com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void cadastrarProfissional(String nome, String endereco, String telefone) {
        Profissional profissional = new Profissional(nome, endereco, telefone);
        profissionais.add(profissional);
        System.out.println("Profissional cadastrado com sucesso.");
    }

    public void editarProfissional(String nome, String endereco, String telefone) {
        Profissional profissional = buscarProfissional(nome);
        if (profissional != null) {
            profissional.setEndereco(endereco);
            profissional.setTelefone(telefone);
            System.out.println("Profissional editado com sucesso.");
        } else {
            System.out.println("Profissional não encontrado.");
        }
    }

    public void excluirProfissional(String nome) {
        Profissional profissional = buscarProfissional(nome);
        if (profissional != null) {
            profissionais.remove(profissional);
            System.out.println("Profissional excluído com sucesso.");
        } else {
            System.out.println("Profissional não encontrado.");
        }
    }
    
    public void listarClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println();
        }
    }
    
    public void listarProfissional() {
        System.out.println("Profissionais:");
        for (Profissional profissional : profissionais) {
            System.out.println("Nome: " + profissional.getNome());
            System.out.println("Endereço: " + profissional.getEndereco());
            System.out.println("Telefone: " + profissional.getTelefone());
            System.out.println("Serviço(s) presetado: ");
            List<String> servicos = profissional.getServicos();
            if (servicos.isEmpty()) {
                System.out.println("Nenhum serviço cadastrado.");
            } else {
                for (String servico : servicos) {
                    System.out.println(servico);
                }
            }
        }System.out.println();
    }

 
    private Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
    
    private Profissional buscarProfissional(String nome) {
        for (Profissional profissional : profissionais) {
            if (profissional.getNome().equals(nome)) {
                return profissional;
            }
        }
        return null;
    }
   

    public void adicionarServicoProfissional(String nomeProfissional, String servico) {
        Profissional profissional = buscarProfissional(nomeProfissional);
        if (profissional != null) {
            profissional.adicionarServico(servico);
            System.out.println("Serviço adicionado com sucesso!");
        } else {
            System.out.println("Profissional não encontrado!");
        }
    }

    public void removerServicoProfissional(String nomeProfissional, String servico) {
        Profissional profissional = buscarProfissional(nomeProfissional);
        if (profissional != null) {
            profissional.removerServico(servico);
            System.out.println("Serviço removido com sucesso!");
        } else {
            System.out.println("Profissional não encontrado!");
        }
    }
  
}
