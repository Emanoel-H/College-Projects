package br.com.college.Domain;

import java.util.Scanner;

public class Banco {

    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void menu(){
        System.out.println("=====================================================");
        System.out.println("           Qual ação você deseja realizar?           ");
        System.out.println("1- exibir saldo \n2- depositar \n3- retirar \n9- Sair");
        System.out.println("=====================================================");

    }

    public void executar(int opcao){
        Scanner sc = new Scanner(System.in);
        switch (opcao){
            case 1:
                exibirSaldo();
                break;
            case 2:
                System.out.println("Insira o valor que você deseja depositar: ");
                double valor = sc.nextDouble();
                deposita(valor);
                break;
            case 3:
                System.out.println("Insira o valor que você deseja retirar: ");
                double valorRetirada = sc.nextDouble();
                retira(valorRetirada);
                break;
            case 9:
                System.out.println("Até a próxima consulta a conta :)");
        }
    }


    public double exibirSaldo(){
        if(this.saldo != 0){
            return getSaldo();
        } else {
            System.out.println("Seu saldo está vazio, deposite mais dinheiro na sua conta.");
            return 0d;
        }

    }

    public void deposita(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Insira um valor maior que 0");
        }

    }

    public void retira(double valor){
        if (valor < getSaldo()){
            saldo -= valor;
        } else {
            System.out.println("O valor que você inseriu ultrapassa o saldo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
