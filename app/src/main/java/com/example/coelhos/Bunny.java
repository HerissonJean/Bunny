package com.example.coelhos;

import java.io.Serializable;

public class Bunny implements Serializable {

    private String nome;
    private String age ;

    public Bunny(String nome, String age) {
        this.nome = nome;
        this.age = age;
    }
    public Bunny() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
