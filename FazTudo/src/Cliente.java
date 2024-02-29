/**
 * Representa um cliente que pode contratar serviços de profissionais.
 */

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Profissional> profissionaisContratados;

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.profissionaisContratados = new ArrayList<>();
    }

    public void contratarProfissional(Profissional profissional) {
        profissionaisContratados.add(profissional);
        System.out.println("Profissional contratado com sucesso!");
    }
}