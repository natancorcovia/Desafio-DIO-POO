package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public LocalDate getData(){
        return data;
    }

    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }

    public void setDescricao(String novaDescricao){
        descricao = novaDescricao;
    }
     public void setData(LocalDate novaData){
        data = novaData;
     }

     @Override
     public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
     }

     
}
