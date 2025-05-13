package model;

import java.time.LocalDate;

public class VendaProduto extends Venda {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public VendaProduto(int id, String cliente, LocalDate data, String nomeProduto, int quantidade, double precoUnitario) {
        super(id, cliente, data);
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String adicionar() {
        return "Venda de produto adicionada com sucesso!";
    }

    public double calcularTotal(){
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "VendaProduto [nomeProduto=" + nomeProduto + ", quantidade=" + quantidade + ", precoUnitario="
                + precoUnitario + "]";
    }
    
    
}
