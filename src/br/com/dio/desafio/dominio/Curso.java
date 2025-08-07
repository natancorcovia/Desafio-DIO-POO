package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }

    public void setDescricao(String novaDescricao){
        descricao = novaDescricao;
    }

    public void setCargaHoraria(int novaCargaHoraria){
        cargaHoraria = novaCargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}
