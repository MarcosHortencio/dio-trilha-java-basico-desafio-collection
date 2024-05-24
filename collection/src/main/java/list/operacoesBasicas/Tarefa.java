package main.java.list.operacoesBasicas;

public class Tarefa {
  //atribut0
private String descricao;

public Tarefa(String descricao) {
    this.descricao = descricao;
}

public String getDescricao() {
    return descricao;
}

@Override
public String toString() {
    return  descricao ;
}


}


