package br.com.projetoextensao.Test;

import br.com.projetoextensao.Domain.EnrollSystem;

import java.util.Scanner;

public class EnrollSystemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnrollSystem sistemaCadastro = new EnrollSystem();
        int input = 0;
        while (input != 9){
            sistemaCadastro.menu();
            input = scanner.nextInt();

            sistemaCadastro.intoSystem(input);
        }
        scanner.close();
    }
}
