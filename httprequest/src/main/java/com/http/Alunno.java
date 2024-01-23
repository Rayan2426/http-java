package com.http;

public class Alunno {
    private String nome;
    private String cognome;
    private String dataNascita;
    
    public Alunno(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public Alunno(){}

    @Override
    public String toString() {
        return nome+","+cognome+","+dataNascita+";";
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    
}
