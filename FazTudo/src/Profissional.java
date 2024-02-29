/**
 * Representa um profissional que pode prestar serviços para clientes.
 */

import java.util.ArrayList;
import java.util.List;

public class Profissional extends Pessoa {
    private List<String> servicos;

    public Profissional(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.servicos = new ArrayList<>();
    }

    public void adicionarServico(String servico) {
        servicos.add(servico);
    }

    public void removerServico(String servico) {
        servicos.remove(servico);
    }

    public List<String> getServicos() {
        return servicos;
    }
}