package br.com.techcorp.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {
    private List<Funcionario> historicoCatraca = new ArrayList<>();
    private Set<Funcionario> autorizadosSalaSegura = new HashSet<>();

    public void registrarPassagem(Funcionario f) {
        this.historicoCatraca.add(f);
        System.out.println("Passagem registrada na catraca para: " + f.getNome());
    }

    public void concederAcessoSala(Funcionario f) {
        if (this.autorizadosSalaSegura.add(f)) {
            System.out.println("Acesso liberado para a Sala Segura");
        } else {
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido.");
        }
    }
}