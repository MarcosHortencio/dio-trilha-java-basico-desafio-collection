package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover= new ArrayList<>();
        for (Tarefas t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

   public static void main(String[] args) {
      ListaTarefa listaTarefa = new ListaTarefa();

      System.out.println("O numero de elementos na tarefa e : "+listaTarefa.obterNumeroTotalTarefas());
      listaTarefa.adicionarTarefa("tarefa 1");
      listaTarefa.adicionarTarefa("Tarefa 2");
      listaTarefa.adicionarTarefa("Tarefa 2");
      System.out.println("O numero de elementos na tarefa e : "+listaTarefa.obterNumeroTotalTarefas());
      listaTarefa.removerTarefa("tarefa 2");
      System.out.println("O numero de elementos na tarefa e : "+listaTarefa.obterNumeroTotalTarefas());
      ListaTarefa.obterDescricoesTarefas();

   }
}
