package controller;

import model.VendaAutomovel;
import java.util.List;

public class VendaAutomovelController {
    private List<VendaAutomovel> vendas;
    String resultado = "";

    public VendaAutomovelController(List<VendaAutomovel> vendas) {
        this.vendas = vendas;
    }

    public String adicionarVenda(VendaAutomovel venda){
        vendas.add(venda);
        return venda.adicionar();
    }


    public String visualizarVenda(){
        for (VendaAutomovel venda : vendas) {
            resultado += venda + "\n";
        }
        return resultado; 
    }

    public String atualizarVenda(int id, VendaAutomovel novaVenda) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId() == id) {
                vendas.set(i, novaVenda);
                return "Venda atualizada com sucesso!";
            }
        }
        return "Venda não encontrada.";
    }
    
    public String excluirVenda(int id) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId() == id) {
                vendas.remove(i);
                return "Venda excluída com sucesso!";
            }
        }
        return "Venda não encontrada.";
    }
}
