package org.example.model;

/*
 * ================================
 * 📌 TO-DO - Model Tarefa
 * ================================
 *
 * 🟢 Básico
 * [x] Criar atributos da tarefa
 * [x] Criar construtor
 * [x] Criar getters
 *
 * 🟡 Melhorias
 * [ ] Criar setters (se necessário)
 * [ ] Validar dados no construtor (ex: título não vazio)
 *
 * 🔵 Funcionalidades
 * [ ] Adicionar status (PENDENTE / CONCLUIDA)
 * [ ] Adicionar prioridade (BAIXA, MEDIA, ALTA)
 * [ ] Adicionar data de criação
 * [ ] Adicionar prazo (deadline)
 *
 * 🟣 Organização
 * [ ] Criar classe Disciplina separada (em vez de string)
 *
 * 🔴 Boas práticas
 * [ ] Implementar toString()
 * [ ] Implementar equals() e hashCode()
 *
 * ⚫ Extra (nível avançado)
 * [ ] Tornar classe imutável (remover setters)
 * [ ] Usar Builder Pattern para criação
 *
 * ================================
 * 🔧 TECH DEBT
 * ================================
 * TODO: substituir nomeDisciplina por objeto Disciplina
 * FIXME: ausência de validações nos dados
 *
 */

public class Tarefa {
    private int idDisciplina;
    private int idTarefa;

    private String tituloTarefa;
    private String nomeDisciplina;

    private String descricaoTarefa;

    public Tarefa(int idDisciplina, int idTarefa, String tituloTarefa, String nomeDisciplina, String descricaoTarefa){
        this.idDisciplina = idDisciplina;
        this.idTarefa = idTarefa;

        this.tituloTarefa = tituloTarefa;
        this.nomeDisciplina = nomeDisciplina;

        this.descricaoTarefa = descricaoTarefa;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

}
