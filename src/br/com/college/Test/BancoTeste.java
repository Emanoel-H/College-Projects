package br.com.college.Test;

import br.com.college.Domain.Banco;
import br.com.college.Domain.Cliente;

import java.util.Scanner;

public class BancoTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Cliente cliente = adicionaCliente();
        System.out.println( cliente.getNome() + ", insira seu saldo inicial");
        int saldo = sc.nextInt();
        Banco banco = new Banco(saldo);
        int input;

        do {
            banco.menu();
            input = sc.nextInt();
            switch (input){
            case 1:
                System.out.println(cliente + ". Saldo: " + banco.exibirSaldo());
                break;
            case 2:
                System.out.println(cliente.getNome() + ", insira o valor que você deseja depositar: ");
                double valor = sc.nextDouble();
                banco.deposita(valor);
                break;
            case 3:
                System.out.println(cliente.getNome() + ", insira o valor que você deseja retirar: ");
                double valorRetirada = sc.nextDouble();
                banco.retira(valorRetirada);
                break;
            case 9:
                System.out.println("Até a próxima consulta a conta :)");
            }
        } while(input != 9);

        sc.close();
    }

    public static Cliente adicionaCliente(){
        Scanner sc = new Scanner(System.in);
        String nome, sobrenome, cpf;
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = sc.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = sc.nextLine();

        return new Cliente(nome, sobrenome, cpf);
    }
}
