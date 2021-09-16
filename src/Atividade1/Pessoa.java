package Atividade1;

import lombok.Data;

@Data
public class Pessoa {
    String nome;
    String endereco;
    String telefone;
    Integer idade;
    Double altura;


    public Pessoa(String nome, String endereco, String telefone, Integer idade, Double altura) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;


    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }


    public String toString() {
        return "Nome: "+nome+" - Endereço:"+ endereco+" - Telefone:"+ telefone+" - Idade: "+idade+" - Altura:"+altura;
    }
}
