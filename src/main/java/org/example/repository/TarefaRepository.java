package org.example.repository;

import org.example.model.Tarefa;

import java.util.List;

/*
 * ================================
 * 📌 TO-DO - TarefaRepository
 * ================================
 *
 * 🟢 Básico
 * [x] Criar interface do repositório
 * [x] Implementar versão em memória
 *
 * 🟡 Melhorias
 * [ ] Utilizar Optional em buscarPorId
 * [ ] Evitar retorno de null
 * [ ] Padronizar nomes dos métodos
 *
 * 🔵 Funcionalidades
 * [ ] Implementar método de remover tarefa
 * [ ] Implementar atualização de tarefa
 * [ ] Adicionar status (concluída/pendente)
 * [ ] Adicionar prioridade
 *
 * 🟣 Estrutura
 * [ ] Criar camada Service
 * [ ] Separar responsabilidades
 *
 * 🔴 Persistência
 * [ ] Criar versão com banco de dados
 * [ ] Criar versão com arquivo (JSON)
 *
 * ⚫ Extra (nível avançado)
 * [ ] Implementar paginação
 * [ ] Criar filtros dinâmicos
 * [ ] Tornar repositório genérico
 *
 */

public interface TarefaRepository { //contrato, qualquer outra classe que quiser repo de tarefa PRECISA ter seus métodos
    void salvar(Tarefa tarefa); //faz algo mas não precisa retornar nada

    List<Tarefa> listarTodas();

    List<Tarefa> listarPorDisciplina(int idDisciplina);

    Tarefa buscarPorId (int idTarefa);
}
