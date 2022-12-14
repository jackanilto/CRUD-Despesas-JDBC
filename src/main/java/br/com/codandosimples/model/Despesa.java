package br.com.codandosimples.model;

import java.time.LocalDate;

public class Despesa {
    private Long id;
    private String descricao;
    private LocalDate data;
    private Double valor;
    private Categoria categoria;

    public Despesa() {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }
}