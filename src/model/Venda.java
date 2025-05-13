package model;

import java.time.LocalDate;

public abstract class Venda {
    private int id;
    private String cliente;
    private LocalDate data;
    
    public Venda(int id, String cliente, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
    }

    public abstract String adicionar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Venda [id=" + id + ", cliente=" + cliente + ", data=" + data + "]";
    }
}
