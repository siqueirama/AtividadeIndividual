package Atividade5;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Data
public class Cliente {

    int id;
    String nome;
    String cpf;
    String endereco;
    String email;
    String telefone;

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }



    public void validarClientes() {
        boolean validaDados = true;

        while (validaDados == true) {

            String infoNome="";
            String infoCpf="";
            String infoEmail="";
            String infoTelefone ="";

            boolean b = nomeValido();
            if (b == false) {
                validaDados = false;
                infoNome = "- Nome deve ter entre 3 e 50 caracteres";
            }
            boolean c = cpfValido();
            if (c == false) {
                validaDados = false;
                infoCpf = "- Cpf deve ter 11 caracteres";
            }
            boolean d = emailValido();
            if (d == false) {
                validaDados = false;
                infoEmail = "- E-mail invalido";
            }
            boolean e = telefoneValido();
            if (e == false) {
                validaDados = false;
                infoTelefone = "- Telefone pode ter 11 digitos";
            }
            if (validaDados == false){
                System.out.println("Cliente não pode ser Cadastrado. Dados inválidos!"+"\n"+infoNome+"\n"+infoCpf+"\n"+infoEmail+"\n"+infoTelefone);
            }else {
                cadastrarCliente();
                System.out.println("Cliente cadastrado com sucesso");}
            validaDados = false;
        }
    }

    private boolean nomeValido() {
        setNome(nome);
        return (nome.length()>=3 && nome.length()<=50);
    }

    private boolean cpfValido() {
        setCpf(cpf);
        return (cpf.length()==11);
    }

    private boolean emailValido() {
        setEmail(email);
        return (email.indexOf('@') > 0 );
    }

    private boolean telefoneValido() {
        setTelefone(telefone);
        return (telefone.length()==11);
    }


    private void cadastrarCliente() {
            int i =0;
            Cliente[] array = new Cliente[1];
            array[i] = new Cliente(nome, cpf, endereco, email, telefone);
            id = +1;
            System.out.println("Cliente: " + id + ";" + array[i].toString());
    }

       @Override
       public String toString() {
           return nome +";"+ cpf  +";"+ endereco  +";"+ email  +";"+ telefone;
       }

}
