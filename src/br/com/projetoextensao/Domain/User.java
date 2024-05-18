package br.com.projetoextensao.Domain;

public class User {
    private String userName;
    private String passWord;

    public User(String nome, String senha) {
        this.userName = nome;
        this.passWord = senha;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
