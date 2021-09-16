package Atividade1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda extends Pessoa {

    List<Pessoa> pessoas = new ArrayList<>();

    public Agenda() {
        super();
    }

    public void armazenarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        System.out.println("\n"+"---------------Remover pessoa---------------------");
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(pessoa.getNome())) {
                pessoas.remove(pessoas.get(i));
                System.out.println("Pessoa removida com sucesso");
            }
            }
        }


    //int buscarPessoa(String nome)
    public int buscarPessoa(Pessoa pessoa) {
          System.out.println("\n"+"---------------Buscar pessoa---------------------");
            for (int i = 0; i < pessoas.size(); i++)
                if (pessoas.get(i).getNome().equals(pessoa.getNome())) {
                    System.out.println("Posição: "+(pessoas.indexOf(pessoa))+"\n"+pessoa.toString());
                }
        return 0;
    }

    public void exibirTodaAgenda() {
        System.out.println("\n"+"---------------Agenda----------------------");
        for (int i = 0; i < pessoas.size(); i++) {
            var pessoa = pessoas;
            System.out.println(pessoa.get(i).toString());
        }
    }

    public void exibirPessoa(int i) {
        System.out.println("\n"+"-----Exibir pessoa na Posição " + i + "----------------------");
        System.out.println(pessoas.get(i).toString());
    }

    @Override
    public String toString() {
        return super.toString()+getEndereco();
    }

    public void listarPessoasEmOrdemAlfabéticaDeNome() {
        System.out.println("\n"+"-------Agenda ordenada por Nome--------");
        pessoas.sort((Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));
        pessoas.forEach(s -> System.out.println(s.toString()));
    }
}

