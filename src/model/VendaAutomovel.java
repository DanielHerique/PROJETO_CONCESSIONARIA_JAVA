package model;

import java.time.LocalDate;

public class VendaAutomovel extends Venda {
    private String modelo, marca;
    private double preco;

    public VendaAutomovel(int id, String cliente, LocalDate data, String modelo, String marca, double preco) {
        super(id, cliente, data);
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String adicionar() {
        return "Venda do automovel registrada com SUCESSO!";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "VendaAutomovel [modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + "]";
    }
}
