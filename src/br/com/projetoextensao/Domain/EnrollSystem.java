package br.com.projetoextensao.Domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnrollSystem {
    private Map<String, User> usuarios;

    public EnrollSystem() {
        this.usuarios = new HashMap<>();
    }

    public void menu(){
        System.out.println("===============================");
        System.out.println("1- Registre-se \n2- Fazer Login \n9- Sair");
        System.out.println("===============================");
    }

    public void intoSystem(int a){
        Scanner sc = new Scanner(System.in);
        switch (a){
            case 1:
                System.out.println("Insira o nome do seu usuário? ");
                String username = sc.nextLine();
                System.out.println("Insira sua senha:");
                String password = sc.nextLine();
                usuarios.put(username, new User(username, password));
                break;
            case 2:
                System.out.println("Qual o nome do seu usuário?");
                String nome = sc.nextLine();
                System.out.println("Olá " + findUser(nome).getUserName() + ", Digite sua senha:");
                String senha = sc.nextLine();

                if (findUser(nome).getUserName().equalsIgnoreCase(nome) &&
                        findUser(nome).getPassWord().equalsIgnoreCase(senha)){
                    System.out.println("Bem-vindo ao sistema " + findUser(nome).getUserName());
                } else {
                    System.out.println("Você digitou o nome de usuário ou senha incorreta, tente de novo.");
                }
                break;
            case 9:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Digite uma opção válida!!!");
        }
    }

    public User findUser(String userName){
        return usuarios.get(userName);
    }
}
