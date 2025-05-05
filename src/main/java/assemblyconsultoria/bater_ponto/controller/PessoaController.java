package assemblyconsultoria.bater_ponto.controller;

import java.util.ArrayList;
import java.util.List;

import assemblyconsultoria.bater_ponto.entity.PessoaEntity;

public class PessoaController {
    
    // Simulação de um banco de dados em memória
    private List<PessoaEntity> pessoas = new ArrayList<>();

    // Método para adicionar uma nova pessoa
    public void adicionarPessoa(PessoaEntity pessoa) {
        pessoas.add(pessoa);
    }

    // Método para buscar uma pessoa pelo ID
    public PessoaEntity buscarPessoaPorId(Long id) {
        for (PessoaEntity pessoa : pessoas) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }
        }
        return null; // Retorna null se não encontrar a pessoa
    }

    // Método para listar todas as pessoas
    public List<PessoaEntity> listarPessoas() {
        return pessoas;
    }
}
