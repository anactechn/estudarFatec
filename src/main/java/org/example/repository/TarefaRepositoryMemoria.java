package org.example.repository;

import org.example.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

/*
 * ================================
 * 📌 TODO - TarefaRepositoryMemoria
 * ================================
 *
 * 🟢 Básico
 * [x] Implementar armazenamento em memória
 * [x] Criar lista de tarefas
 *
 * 🟡 Melhorias
 * [ ] Evitar duplicidade de tarefas (mesmo id)
 * [ ] Validar dados antes de salvar
 * [ ] Retornar cópia da lista (evitar alteração externa)
 *
 * 🔵 Funcionalidades
 * [ ] Implementar método de remover tarefa
 * [ ] Implementar atualização de tarefa
 * [ ] Buscar por outros campos (título, disciplina)
 *
 * 🟣 Performance
 * [ ] Substituir List por Map (id → tarefa) para buscas mais rápidas
 *
 * 🔴 Persistência
 * [ ] Integrar com banco de dados
 * [ ] Salvar em arquivo (JSON ou TXT)
 *
 * ⚫ Extra (nível avançado)
 * [ ] Implementar paginação de resultados
 * [ ] Criar filtros dinâmicos
 * [ ] Tornar thread-safe (uso com múltiplas threads)
 *
 * ================================
 * 🔧 TECH DEBT
 * ================================
 * FIXME: buscarPorId retorna null (usar Optional)
 * TODO: usar Stream API para melhorar legibilidade
 *
 */

public class TarefaRepositoryMemoria implements TarefaRepository {

    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public List<Tarefa> listarTodas() {
        return tarefas;
    }

    @Override
    public List<Tarefa> listarPorDisciplina(int idDisciplina) {
        List<Tarefa> filtradas = new ArrayList<>();

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdDisciplina() == idDisciplina) {
                filtradas.add(tarefa);
            }
        }

        return filtradas;
    }

    @Override
    public Tarefa buscarPorId(int idTarefa) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdTarefa() == idTarefa) {
                return tarefa;
            }
        }
        return null;
    }
}
