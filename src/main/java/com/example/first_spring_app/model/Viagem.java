package com.example.first_spring_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Viagens")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destino;
    private String pais;
    private Double preco;
    private Integer quantidadeDias;

    public Viagem(){};

    public Viagem(String destino, String pais, Double preco, Integer quantidadeDias) {
        this.destino = destino;
        this.pais = pais;
        this.preco = preco;
        this.quantidadeDias = quantidadeDias;
    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
}
