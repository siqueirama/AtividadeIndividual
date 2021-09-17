package Atividade5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite CPF: ");
        String cpf = teclado.nextLine();

        System.out.println("Endereço: ");
        String enderco = teclado.nextLine();

        System.out.println("Telefone: ");
        String telefone = teclado.nextLine();

        System.out.println("Digite e-mail: ");
        String email = teclado.nextLine();

        Cliente cliente = new Cliente(nome,cpf,enderco,email,telefone);
       // Cliente cliente = new Cliente("mar","04112245578","hvddjhcwd","hj@hhuh","00564565460");
        cliente.validarClientes();

    }
}
