package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa Caio = new Pessoa("Caio","rua Um","3712-4578", 10,1.50);
        Pessoa Maria = new Pessoa("Maria","rua Dois","3712-9898", 21,1.70);
        Pessoa Luiza = new Pessoa("Luiza","rua Tres","3712-1010", 27,1.80);
        Pessoa Vanessa = new Pessoa("Vanessa","rua Quatro","3712-1010", 26,1.80);
        Pessoa Ana = new Pessoa("Ana","rua Cinco","3712-1010", 26,1.80);
        Pessoa Karina = new Pessoa("Karina","rua Seis","3712-1010", 26,1.80);
        Pessoa Raquel = new Pessoa("Raquel","rua Sete","3712-1010", 26,1.80);
        Pessoa Cassio = new Pessoa("Cassio","rua Oito","3712-1010", 26,1.80);
        Pessoa Renata = new Pessoa("Renata","rua Nove","3712-1010", 26,1.80);
        Pessoa Joao = new Pessoa("Joao","rua Dez","3712-1010", 26,1.80);

        Agenda agenda = new Agenda();
        agenda.armazenarPessoa(Caio);
        agenda.armazenarPessoa(Maria);
        agenda.armazenarPessoa(Luiza);
        agenda.armazenarPessoa(Vanessa);
        agenda.armazenarPessoa(Ana);
        agenda.armazenarPessoa(Karina);
        agenda.armazenarPessoa(Raquel);
        agenda.armazenarPessoa(Cassio);
        agenda.armazenarPessoa(Renata);
        agenda.armazenarPessoa(Joao);

        agenda.exibirTodaAgenda();
        agenda.removerPessoa(Maria);
        agenda.buscarPessoa(Joao);
        agenda.exibirTodaAgenda();
        agenda.exibirPessoa(6);
        agenda.listarPessoasEmOrdemAlfabéticaDeNome();

    }
}
