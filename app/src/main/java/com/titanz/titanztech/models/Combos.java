package com.titanz.titanztech.models;

import java.io.Serializable;

public class Combos implements Serializable {

    private String nome;

    private String descricao;

    private String id;

    private String imagem;

    private String valor;

    private String energetico;

    private String gelo;

    public String getEnergetico() {
        return energetico;
    }

    public void setEnergetico(String energetico) {
        this.energetico = energetico;
    }

    public String getGelo() {
        return gelo;
    }

    public void setGelo(String gelo) {
        this.gelo = gelo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
